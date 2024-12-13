package App.Application.Controllers;

import App.Domain.Statistic;
import App.Infrastructure.StatisticRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/statistics")
public class StatisticController {

    private final StatisticRepository statisticRepository;

    // Autowire the StatisticRepository into the controller
    @Autowired
    public StatisticController(StatisticRepository statisticRepository) {
        this.statisticRepository = statisticRepository;
    }

    // Endpoint to create or update a Statistic
    @PostMapping
    public void save(@RequestBody Statistic statistic) {
        statisticRepository.save(statistic);
    }

    // Endpoint to retrieve a Statistic by character ID
    @GetMapping("/{charId}")
    public Statistic get(@PathVariable String charId) {
        Optional<Statistic> statistic = statisticRepository.findById(charId);
        return statistic.orElse(null); // Return null if the statistic doesn't exist
    }

    // Endpoint to retrieve all Statistics
    @GetMapping
    public Map<String, Statistic> getAll() {
        return statisticRepository.findAll();
    }

    // Endpoint to delete a Statistic by character ID
    @DeleteMapping("/{charId}")
    public void delete(@PathVariable String charId) {
        statisticRepository.deleteById(charId);
    }

    // Endpoint to update the Strength of a character
    @PutMapping("/{charId}/strength")
    public void updateStrength(@PathVariable String charId, @RequestParam int newStrength) {
        statisticRepository.updateStrength(charId, newStrength);
    }

    // Additional endpoints to update other abilities can be added as needed...
}
