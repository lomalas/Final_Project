package App.Application.Controllers;

import App.Domain.Skill;
import App.Infrastructure.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skills")
public class SkillController {

    private final SkillRepository skillRepository;

    // Autowire the SkillRepository into the controller
    @Autowired
    public SkillController(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    // Endpoint to create a new Skill
    @PostMapping
    public Skill create(@RequestBody Skill skill) {
        return skillRepository.create(skill);
    }

    // Endpoint to retrieve a Skill by its name and character ID
    @GetMapping("/{skillName}/{charId}")
    public Skill get(@PathVariable String skillName, @PathVariable String charId) {
        return skillRepository.get(skillName, charId);
    }

    // Endpoint to retrieve all Skills for a specific character
    @GetMapping("/character/{charId}")
    public List<Skill> getByCharacter(@PathVariable String charId) {
        return skillRepository.getByCharacter(charId);
    }

    // Endpoint to retrieve all Skills with a specific proficiency level
    @GetMapping("/proficiency/{proficiencyLevel}")
    public List<Skill> getByProficiencyLevel(@PathVariable String proficiencyLevel) {
        return skillRepository.getByProficiencyLevel(proficiencyLevel);
    }

    // Endpoint to update an existing Skill entry
    @PutMapping("/{skillName}/{charId}")
    public int update(@PathVariable String skillName, @PathVariable String charId, @RequestBody Skill skill) {
        return skillRepository.update(skillName, charId, skill);
    }

    // Endpoint to delete a Skill by its name and character ID
    @DeleteMapping("/{skillName}/{charId}")
    public boolean delete(@PathVariable String skillName, @PathVariable String charId) {
        return skillRepository.delete(skillName, charId);
    }
}
