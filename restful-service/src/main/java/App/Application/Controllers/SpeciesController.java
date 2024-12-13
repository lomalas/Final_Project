package App.Application.Controllers;

import App.Domain.Species;
import App.Infrastructure.SpeciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/species")
public class SpeciesController {

    private final SpeciesRepository speciesRepository;

    // Autowire the SpeciesRepository into the controller
    @Autowired
    public SpeciesController(SpeciesRepository speciesRepository) {
        this.speciesRepository = speciesRepository;
    }

    // Endpoint to create a new Species
    @PostMapping
    public Species create(@RequestBody Species species) {
        return speciesRepository.create(species);
    }

    // Endpoint to retrieve a Species by its name
    @GetMapping("/{speciesName}")
    public Species get(@PathVariable String speciesName) {
        return speciesRepository.get(speciesName);
    }

    // Endpoint to retrieve all Species
    @GetMapping
    public List<Species> getAll() {
        return speciesRepository.getAll();
    }

    // Endpoint to update an existing Species entry
    @PutMapping("/{speciesName}")
    public int update(@PathVariable String speciesName, @RequestBody Species species) {
        return speciesRepository.update(speciesName, species);
    }

    // Endpoint to delete a Species by its name
    @DeleteMapping("/{speciesName}")
    public boolean delete(@PathVariable String speciesName) {
        return speciesRepository.delete(speciesName);
    }
}
