package App.Infrastructure;

import App.Domain.Subclass;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SubclassRepository {

    private Connection connection;

    // Constructor to initialize the database connection
    public SubclassRepository(Connection connection) {
        this.connection = connection;
    }

    // Method to create a new Subclass record in the database
    public void createSubclass(Subclass subclass) throws SQLException {
        String sql = "INSERT INTO Subclass (SUBCLASS_ID, CLASS_ID, SUBCLASS_NAME, DESCRIPTION, LEVEL_REQUIREMENTS, SUBCLASS_FEATURES) " +
                "VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, subclass.getSubclassId());
            stmt.setInt(2, subclass.getClassId());
            stmt.setString(3, subclass.getSubclassName());
            stmt.setString(4, subclass.getDescription());
            stmt.setString(5, subclass.getLevelRequirements());
            stmt.setString(6, subclass.getSubclassFeatures());
            stmt.executeUpdate();
        }
    }

    // Method to get a Subclass by its ID
    public Subclass getSubclassById(int subclassId) throws SQLException {
        String sql = "SELECT * FROM Subclass WHERE SUBCLASS_ID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, subclassId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return mapToSubclass(rs);
                }
            }
        }
        return null;
    }

    // Method to get all Subclass records
    public List<Subclass> getAllSubclasses() throws SQLException {
        List<Subclass> subclasses = new ArrayList<>();
        String sql = "SELECT * FROM Subclass";
        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                subclasses.add(mapToSubclass(rs));
            }
        }
        return subclasses;
    }

    // Method to update an existing Subclass
    public void updateSubclass(Subclass subclass) throws SQLException {
        String sql = "UPDATE Subclass SET CLASS_ID = ?, SUBCLASS_NAME = ?, DESCRIPTION = ?, LEVEL_REQUIREMENTS = ?, SUBCLASS_FEATURES = ? " +
                "WHERE SUBCLASS_ID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, subclass.getClassId());
            stmt.setString(2, subclass.getSubclassName());
            stmt.setString(3, subclass.getDescription());
            stmt.setString(4, subclass.getLevelRequirements());
            stmt.setString(5, subclass.getSubclassFeatures());
            stmt.setInt(6, subclass.getSubclassId());
            stmt.executeUpdate();
        }
    }

    // Method to delete a Subclass by its ID
    public void deleteSubclass(int subclassId) throws SQLException {
        String sql = "DELETE FROM Subclass WHERE SUBCLASS_ID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, subclassId);
            stmt.executeUpdate();
        }
    }

    // Helper method to map a ResultSet row to a Subclass object
    private Subclass mapToSubclass(ResultSet rs) throws SQLException {
        int subclassId = rs.getInt("SUBCLASS_ID");
        int classId = rs.getInt("CLASS_ID");
        String subclassName = rs.getString("SUBCLASS_NAME");
        String description = rs.getString("DESCRIPTION");
        String levelRequirements = rs.getString("LEVEL_REQUIREMENTS");
        String subclassFeatures = rs.getString("SUBCLASS_FEATURES");

        return new Subclass(subclassId, classId, subclassName, description, levelRequirements, subclassFeatures);
    }
}
