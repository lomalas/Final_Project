package App.Application.Controllers;

import App.Domain.Class;
import App.Infrastructure.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classes")
public class ClassController {

    private final ClassRepository classRepository;

    @Autowired
    public ClassController(ClassRepository classRepository) {
        this.classRepository = classRepository;
    }

    // Endpoint to create a new Class
    @PostMapping
    public Class create(@RequestBody Class characterClass) {
        return classRepository.create(characterClass);
    }

    // Endpoint to retrieve a Class by its ID
    @GetMapping("/{classId}")
    public Class get(@PathVariable int classId) {
        return classRepository.get(classId);
    }

    // Endpoint to retrieve all Classes
    @GetMapping
    public List<Class> getAll() {
        return classRepository.getAll();
    }

    // Endpoint to update an existing Class
    @PutMapping("/{classId}")
    public int update(@PathVariable int classId, @RequestBody Class characterClass) {
        return classRepository.update(classId, characterClass);
    }

    // Endpoint to delete a Class by its ID
    @DeleteMapping("/{classId}")
    public boolean delete(@PathVariable int classId) {
        return classRepository.delete(classId);
    }
}
