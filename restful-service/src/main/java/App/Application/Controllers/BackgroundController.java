package App.Application.Controllers;

import App.Domain.Background;
import App.Infrastructure.BackgroundRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/backgrounds")
public class BackgroundController {

    private final BackgroundRepository backgroundRepository;

    // Autowire the BackgroundRepository into the controller
    @Autowired
    public BackgroundController(BackgroundRepository backgroundRepository) {
        this.backgroundRepository = backgroundRepository;
    }

    // Endpoint to create a new Background
    @PostMapping
    public Background create(@RequestBody Background background) {
        return backgroundRepository.create(background);
    }

    // Endpoint to retrieve a Background by its name
    @GetMapping("/{backgroundName}")
    public Background get(@PathVariable String backgroundName) {
        Background background = backgroundRepository.get(backgroundName);
        if (background == null) {
            throw new RuntimeException("Background not found");
        }
        return background;
    }

    // Endpoint to retrieve all Backgrounds
    @GetMapping
    public List<Background> getAll() {
        return backgroundRepository.getAll();
    }

    // Endpoint to update an existing Background
    @PutMapping("/{backgroundName}")
    public Background update(@PathVariable String backgroundName, @RequestBody Background background) {
        int rowsAffected = backgroundRepository.update(backgroundName, background);
        if (rowsAffected == 0) {
            throw new RuntimeException("Background not found for update");
        }
        return background;
    }

    // Endpoint to delete a Background by its name
    @DeleteMapping("/{backgroundName}")
    public boolean delete(@PathVariable String backgroundName) {
        boolean isDeleted = backgroundRepository.delete(backgroundName);
        if (!isDeleted) {
            throw new RuntimeException("Background not found for deletion");
        }
        return true;
    }
}
