package App.Application.Controllers;

import App.Domain.Feat;
import App.Infrastructure.FeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feats")
public class FeatController {

    private final FeatRepository featRepository;

    // Autowire the FeatRepository into the controller
    @Autowired
    public FeatController(FeatRepository featRepository) {
        this.featRepository = featRepository;
    }

    // Endpoint to create a new Feat
    @PostMapping
    public Feat create(@RequestBody Feat feat) {
        return featRepository.create(feat);
    }

    // Endpoint to retrieve a Feat by its ID
    @GetMapping("/{featId}")
    public Feat get(@PathVariable int featId) {
        return featRepository.get(featId);
    }

    // Endpoint to retrieve all Feats
    @GetMapping
    public List<Feat> getAll() {
        return featRepository.getAll();
    }

    // Endpoint to update an existing Feat
    @PutMapping("/{featId}")
    public int update(@PathVariable int featId, @RequestBody Feat feat) {
        return featRepository.update(featId, feat);
    }

    // Endpoint to delete a Feat by its ID
    @DeleteMapping("/{featId}")
    public boolean delete(@PathVariable int featId) {
        return featRepository.delete(featId);
    }
}
