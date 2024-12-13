package App.Application.Controllers;

import App.Domain.Subclass;
import App.Infrastructure.SubclassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/subclasses")
public class SubclassController {

    private final SubclassRepository subclassRepository;

    // Autowire the SubclassRepository into the controller
    @Autowired
    public SubclassController(SubclassRepository subclassRepository) {
        this.subclassRepository = subclassRepository;
    }

    // Endpoint to create a new Subclass
    @PostMapping
    public Subclass create(@RequestBody Subclass subclass) {
        try {
            subclassRepository.createSubclass(subclass);
            return subclass;
        } catch (SQLException e) {
            // Handle the exception or rethrow a custom exception
            throw new RuntimeException("Error creating subclass", e);
        }
    }

    // Endpoint to retrieve a Subclass by its ID
    @GetMapping("/{subclassId}")
    public Subclass get(@PathVariable int subclassId) {
        try {
            Subclass subclass = subclassRepository.getSubclassById(subclassId);
            if (subclass == null) {
                throw new RuntimeException("Subclass not found");
            }
            return subclass;
        } catch (SQLException e) {
            // Handle the exception or rethrow a custom exception
            throw new RuntimeException("Error retrieving subclass", e);
        }
    }

    // Endpoint to retrieve all Subclasses
    @GetMapping
    public List<Subclass> getAll() {
        try {
            return subclassRepository.getAllSubclasses();
        } catch (SQLException e) {
            // Handle the exception or rethrow a custom exception
            throw new RuntimeException("Error retrieving subclasses", e);
        }
    }

    // Endpoint to update an existing Subclass
    @PutMapping("/{subclassId}")
    public Subclass update(@PathVariable int subclassId, @RequestBody Subclass subclass) {
        try {
            // Ensure subclass exists before updating
            Subclass existingSubclass = subclassRepository.getSubclassById(subclassId);
            if (existingSubclass == null) {
                throw new RuntimeException("Subclass not found");
            }
            subclass.setSubclassId(subclassId);  // Set the subclass ID
            subclassRepository.updateSubclass(subclass);
            return subclass;
        } catch (SQLException e) {
            // Handle the exception or rethrow a custom exception
            throw new RuntimeException("Error updating subclass", e);
        }
    }

    // Endpoint to delete a Subclass by its ID
    @DeleteMapping("/{subclassId}")
    public boolean delete(@PathVariable int subclassId) {
        try {
            // Ensure subclass exists before deleting
            Subclass existingSubclass = subclassRepository.getSubclassById(subclassId);
            if (existingSubclass == null) {
                throw new RuntimeException("Subclass not found");
            }
            subclassRepository.deleteSubclass(subclassId);
            return true;
        } catch (SQLException e) {
            // Handle the exception or rethrow a custom exception
            throw new RuntimeException("Error deleting subclass", e);
        }
    }
}
