package App.Application.Controllers;

import App.Domain.Caster;
import App.Infrastructure.CasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/casters")
public class CasterController {

    private final CasterRepository casterRepository;

    // Autowire the CasterRepository into the controller
    @Autowired
    public CasterController(CasterRepository casterRepository) {
        this.casterRepository = casterRepository;
    }

    // Endpoint to create a new Caster
    @PostMapping
    public Caster create(@RequestBody Caster caster) {
        return casterRepository.create(caster);
    }

    // Endpoint to retrieve a Caster by its ID
    @GetMapping("/{casterId}")
    public Caster get(@PathVariable int casterId) {
        Caster caster = casterRepository.get(casterId);
        if (caster == null) {
            throw new RuntimeException("Caster not found");
        }
        return caster;
    }

    // Endpoint to retrieve all Casters
    @GetMapping
    public List<Caster> getAll() {
        return casterRepository.getAll();
    }

    // Endpoint to update an existing Caster
    @PutMapping("/{casterId}")
    public Caster update(@PathVariable int casterId, @RequestBody Caster caster) {
        int rowsAffected = casterRepository.update(casterId, caster);
        if (rowsAffected == 0) {
            throw new RuntimeException("Caster not found for update");
        }
        return caster;
    }

    // Endpoint to delete a Caster by its ID
    @DeleteMapping("/{casterId}")
    public boolean delete(@PathVariable int casterId) {
        boolean isDeleted = casterRepository.delete(casterId);
        if (!isDeleted) {
            throw new RuntimeException("Caster not found for deletion");
        }
        return true;
    }
}
