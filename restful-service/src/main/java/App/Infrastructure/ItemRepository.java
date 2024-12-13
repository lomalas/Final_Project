package App.Infrastructure;

import App.Domain.Item;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.dao.EmptyResultDataAccessException;

import java.util.List;

public class ItemRepository {

    private JdbcTemplate databaseConnection;

    // Set the database connection
    public void setDatabaseConnection(JdbcTemplate databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    // Create a new Item entry
    public Item create(Item item) {
        String sql = "INSERT INTO ITEM (ITEM_ID, ITEM_NAME, WEIGHT, RARITY, TYPE, VALUE, EFFECT, ATTUNEMENT, QUANTITY, MAGIC, DESCRIPTION) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        this.databaseConnection.update(sql,
                item.getItemId(),
                item.getItemName(),
                item.getWeight(),
                item.getRarity(),
                item.getType(),
                item.getValue(),
                item.getEffect(),
                item.getAttunement(),
                item.getQuantity(),
                item.getMagic(),
                item.getDescription());
        return item;
    }

    // Retrieve an Item by its ID
    public Item get(int itemId) {
        String sql = "SELECT * FROM ITEM WHERE ITEM_ID = ?;";
        try {
            return this.databaseConnection.queryForObject(sql,
                    BeanPropertyRowMapper.newInstance(Item.class),
                    itemId);
        } catch (EmptyResultDataAccessException e) {
            return null; // Handle case where no record is found
        }
    }

    // Retrieve all Items
    public List<Item> getAll() {
        String sql = "SELECT * FROM ITEM;";
        return this.databaseConnection.query(sql,
                BeanPropertyRowMapper.newInstance(Item.class));
    }

    // Retrieve Items by rarity
    public List<Item> getByRarity(String rarity) {
        String sql = "SELECT * FROM ITEM WHERE RARITY = ?;";
        return this.databaseConnection.query(sql,
                BeanPropertyRowMapper.newInstance(Item.class),
                rarity);
    }

    // Retrieve magic Items
    public List<Item> getMagicItems() {
        String sql = "SELECT * FROM ITEM WHERE MAGIC = 'true';";
        return this.databaseConnection.query(sql,
                BeanPropertyRowMapper.newInstance(Item.class));
    }

    // Update an existing Item entry
    public int update(int itemId, Item item) {
        String sql = "UPDATE ITEM SET ITEM_NAME = ?, WEIGHT = ?, RARITY = ?, TYPE = ?, VALUE = ?, EFFECT = ?, " +
                "ATTUNEMENT = ?, QUANTITY = ?, MAGIC = ?, DESCRIPTION = ? WHERE ITEM_ID = ?;";
        return this.databaseConnection.update(sql,
                item.getItemName(),
                item.getWeight(),
                item.getRarity(),
                item.getType(),
                item.getValue(),
                item.getEffect(),
                item.getAttunement(),
                item.getQuantity(),
                item.getMagic(),
                item.getDescription(),
                itemId);
    }

    // Delete an Item entry
    public boolean delete(int itemId) {
        String sql = "DELETE FROM ITEM WHERE ITEM_ID = ?;";
        int rowsAffected = this.databaseConnection.update(sql, itemId);
        return rowsAffected > 0;
    }
}
