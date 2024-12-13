package App.Infrastructure;

import App.Domain.Inventory;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.dao.EmptyResultDataAccessException;

import java.util.List;

public class InventoryRepository {

    private JdbcTemplate databaseConnection;

    // Set the database connection
    public void setDatabaseConnection(JdbcTemplate databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    // Create a new Inventory entry
    public Inventory create(Inventory inventory) {
        String sql = "INSERT INTO INVENTORY (INVENTORY_ID, CHAR_ID, GOLD, ATTUNEMENT_SLOTS, USED_ATTUNEMENT_SLOTS) VALUES (?, ?, ?, ?, ?);";
        this.databaseConnection.update(sql,
                inventory.getInventoryId(),
                inventory.getCharId(),
                inventory.getGold(),
                inventory.getAttunementSlots(),
                inventory.getUsedAttunementSlots());
        return inventory;
    }

    // Retrieve an Inventory by its ID
    public Inventory get(int inventoryId) {
        String sql = "SELECT * FROM INVENTORY WHERE INVENTORY_ID = ?;";
        try {
            return this.databaseConnection.queryForObject(sql,
                    BeanPropertyRowMapper.newInstance(Inventory.class),
                    inventoryId);
        } catch (EmptyResultDataAccessException e) {
            return null; // Handle case where no record is found
        }
    }

    // Retrieve all Inventories for a specific Character ID
    public List<Inventory> getByCharacterId(String charId) {
        String sql = "SELECT * FROM INVENTORY WHERE CHAR_ID = ?;";
        return this.databaseConnection.query(sql,
                BeanPropertyRowMapper.newInstance(Inventory.class),
                charId);
    }

    // Retrieve all Inventories
    public List<Inventory> getAll() {
        String sql = "SELECT * FROM INVENTORY;";
        return this.databaseConnection.query(sql,
                BeanPropertyRowMapper.newInstance(Inventory.class));
    }

    // Update an existing Inventory entry
    public int update(int inventoryId, Inventory inventory) {
        String sql = "UPDATE INVENTORY SET CHAR_ID = ?, GOLD = ?, ATTUNEMENT_SLOTS = ?, USED_ATTUNEMENT_SLOTS = ? WHERE INVENTORY_ID = ?;";
        return this.databaseConnection.update(sql,
                inventory.getCharId(),
                inventory.getGold(),
                inventory.getAttunementSlots(),
                inventory.getUsedAttunementSlots(),
                inventoryId);
    }

    // Delete an Inventory entry
    public boolean delete(int inventoryId) {
        String sql = "DELETE FROM INVENTORY WHERE INVENTORY_ID = ?;";
        int rowsAffected = this.databaseConnection.update(sql, inventoryId);
        return rowsAffected > 0;
    }
}
