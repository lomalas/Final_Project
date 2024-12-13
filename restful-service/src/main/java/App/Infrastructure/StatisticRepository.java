package App.Infrastructure;

import App.Domain.Statistic;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class StatisticRepository {

    private Map<String, Statistic> statisticDatabase;

    // Constructor initializes an in-memory "database" (HashMap)
    public StatisticRepository() {
        this.statisticDatabase = new HashMap<>();
    }

    // Create or Update a statistic
    public void save(Statistic statistic) {
        statisticDatabase.put(statistic.getCharId(), statistic);
    }

    // Get a statistic by charId
    public Optional<Statistic> findById(String charId) {
        return Optional.ofNullable(statisticDatabase.get(charId));
    }

    // Delete a statistic by charId
    public void deleteById(String charId) {
        statisticDatabase.remove(charId);
    }

    // Get all statistics
    public Map<String, Statistic> findAll() {
        return statisticDatabase;
    }

    // Example method to update a statistic's abilities
    public void updateStrength(String charId, int newStrength) {
        Statistic statistic = statisticDatabase.get(charId);
        if (statistic != null) {
            statistic.setStrength(newStrength);
            save(statistic);  // Save the updated statistic back into the "database"
        }
    }

    // Additional helper methods as needed...
}
