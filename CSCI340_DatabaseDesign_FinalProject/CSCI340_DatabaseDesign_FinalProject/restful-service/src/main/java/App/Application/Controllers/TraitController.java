package App.Application.Controllers;

import App.Domain.Trait;
import App.Infrastructure.TraitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/traits")
public class TraitController {

    private final TraitRepository traitRepository;

    // Autowire the TraitRepository into the controller
    @Autowired
    public TraitController(TraitRepository traitRepository) {
        this.traitRepository = traitRepository;
    }

    // Endpoint to create a new Trait
    @PostMapping
    public Trait create(@RequestBody Trait trait) {
        try {
            traitRepository.createTrait(trait);
            return trait;
        } catch (SQLException e) {
            throw new RuntimeException("Error creating trait", e);
        }
    }

    // Endpoint to retrieve a Trait by its ID
    @GetMapping("/{traitId}")
    public Trait get(@PathVariable int traitId) {
        try {
            Trait trait = traitRepository.getTraitById(traitId);
            if (trait == null) {
                throw new RuntimeException("Trait not found");
            }
            return trait;
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving trait", e);
        }
    }

    // Endpoint to retrieve all Traits
    @GetMapping
    public List<Trait> getAll() {
        try {
            return traitRepository.getAllTraits();
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving traits", e);
        }
    }

    // Endpoint to update an existing Trait
    @PutMapping("/{traitId}")
    public Trait update(@PathVariable int traitId, @RequestBody Trait trait) {
        try {
            // Ensure trait exists before updating
            Trait existingTrait = traitRepository.getTraitById(traitId);
            if (existingTrait == null) {
                throw new RuntimeException("Trait not found");
            }
            trait.setTraitId(traitId);  // Set the trait ID
            traitRepository.updateTrait(trait);
            return trait;
        } catch (SQLException e) {
            throw new RuntimeException("Error updating trait", e);
        }
    }

    // Endpoint to delete a Trait by its ID
    @DeleteMapping("/{traitId}")
    public boolean delete(@PathVariable int traitId) {
        try {
            // Ensure trait exists before deleting
            Trait existingTrait = traitRepository.getTraitById(traitId);
            if (existingTrait == null) {
                throw new RuntimeException("Trait not found");
            }
            traitRepository.deleteTrait(traitId);
            return true;
        } catch (SQLException e) {
            throw new RuntimeException("Error deleting trait", e);
        }
    }
}
