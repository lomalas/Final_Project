package App.Application.Controllers;

import App.Domain.Spell;
import App.Infrastructure.SpellRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spells")
public class SpellController {

    private final SpellRepository spellRepository;

    // Autowire the SpellRepository into the controller
    @Autowired
    public SpellController(SpellRepository spellRepository) {
        this.spellRepository = spellRepository;
    }

    // Endpoint to create a new Spell
    @PostMapping
    public Spell create(@RequestBody Spell spell) {
        return spellRepository.create(spell);
    }

    // Endpoint to retrieve a Spell by its ID
    @GetMapping("/{spellId}")
    public Spell get(@PathVariable int spellId) {
        return spellRepository.get(spellId);
    }

    // Endpoint to retrieve all Spells
    @GetMapping
    public List<Spell> getAll() {
        return spellRepository.getAll();
    }

    // Endpoint to update an existing Spell entry
    @PutMapping("/{spellId}")
    public int update(@PathVariable int spellId, @RequestBody Spell spell) {
        return spellRepository.update(spellId, spell);
    }

    // Endpoint to delete a Spell by its ID
    @DeleteMapping("/{spellId}")
    public boolean delete(@PathVariable int spellId) {
        return spellRepository.delete(spellId);
    }
}
