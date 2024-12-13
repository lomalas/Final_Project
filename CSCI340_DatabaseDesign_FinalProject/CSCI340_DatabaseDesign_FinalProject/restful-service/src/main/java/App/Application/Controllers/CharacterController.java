package App.Application.Controllers;

import App.Domain.Character;
import App.Domain.Statistic;
import App.Domain.Skill;
import App.Infrastructure.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/characters")
public class CharacterController {

    private final CharacterRepository characterRepository;

    // Autowire the CharacterRepository into the controller
    @Autowired
    public CharacterController(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    // Endpoint to create a new Character
    @PostMapping
    public Character create(@RequestBody Character character) {
        return characterRepository.create(character);
    }

    // Endpoint to retrieve a Character by its ID
    @GetMapping("/{charId}")
    public Character get(@PathVariable String charId) {
        List<Character> characters = characterRepository.get(charId);
        if (characters.isEmpty()) {
            throw new RuntimeException("Character not found");
        }
        return characters.get(0);
    }

    // Endpoint to retrieve all Characters
    @GetMapping
    public List<Character> getAll() {
        return characterRepository.get();
    }

    // Endpoint to update an existing Character
    @PutMapping("/{charId}")
    public Character update(@PathVariable String charId, @RequestBody Character character) {
        int rowsAffected = characterRepository.update(charId, character);
        if (rowsAffected == 0) {
            throw new RuntimeException("Character not found for update");
        }
        return character;
    }

    // Endpoint to delete a Character by its ID
    @DeleteMapping("/{charId}")
    public boolean delete(@PathVariable String charId) {
        boolean isDeleted = characterRepository.delete(charId);
        if (!isDeleted) {
            throw new RuntimeException("Character not found for deletion");
        }
        return true;
    }

    // Endpoint to get the hitpoints of a specific character by ID
    @GetMapping("/{charId}/hitpoints")
    public int getHitpoints(@PathVariable String charId) {
        return characterRepository.getHitpoints(charId);
    }

    // Endpoint to get the statistics (e.g., Strength, Dexterity) of a character
    @GetMapping("/{charId}/statistics")
    public List<Statistic> getStatistics(@PathVariable String charId) {
        return characterRepository.getStatistics(charId);
    }

    // Endpoint to get the skills of a character
    @GetMapping("/{charId}/skills")
    public List<Skill> getSkills(@PathVariable String charId) {
        return characterRepository.getSkills(charId);
    }
}
