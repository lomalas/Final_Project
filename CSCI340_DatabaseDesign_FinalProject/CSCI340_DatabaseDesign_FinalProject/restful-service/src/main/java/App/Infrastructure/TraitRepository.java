package App.Infrastructure;

import App.Domain.Trait;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TraitRepository {

    private Connection connection;

    // Constructor to initialize the database connection
    public TraitRepository(Connection connection) {
        this.connection = connection;
    }

    // Method to create a new Trait record in the database
    public void createTrait(Trait trait) throws SQLException {
        String sql = "INSERT INTO Trait (TRAIT_ID, RACE, NAME, DESCRIPTION) " +
                "VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, trait.getTraitId());
            stmt.setString(2, trait.getRace());
            stmt.setString(3, trait.getName());
            stmt.setString(4, trait.getDescription());
            stmt.executeUpdate();
        }
    }

    // Method to get a Trait by its ID
    public Trait getTraitById(int traitId) throws SQLException {
        String sql = "SELECT * FROM Trait WHERE TRAIT_ID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, traitId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return mapToTrait(rs);
                }
            }
        }
        return null;
    }

    // Method to get all Trait records
    public List<Trait> getAllTraits() throws SQLException {
        List<Trait> traits = new ArrayList<>();
        String sql = "SELECT * FROM Trait";
        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                traits.add(mapToTrait(rs));
            }
        }
        return traits;
    }

    // Method to update an existing Trait
    public void updateTrait(Trait trait) throws SQLException {
        String sql = "UPDATE Trait SET RACE = ?, NAME = ?, DESCRIPTION = ? WHERE TRAIT_ID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, trait.getRace());
            stmt.setString(2, trait.getName());
            stmt.setString(3, trait.getDescription());
            stmt.setInt(4, trait.getTraitId());
            stmt.executeUpdate();
        }
    }

    // Method to delete a Trait by its ID
    public void deleteTrait(int traitId) throws SQLException {
        String sql = "DELETE FROM Trait WHERE TRAIT_ID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, traitId);
            stmt.executeUpdate();
        }
    }

    // Helper method to map a ResultSet row to a Trait object
    private Trait mapToTrait(ResultSet rs) throws SQLException {
        int traitId = rs.getInt("TRAIT_ID");
        String race = rs.getString("RACE");
        String name = rs.getString("NAME");
        String description = rs.getString("DESCRIPTION");

        return new Trait(traitId, race, name, description);
    }
}
