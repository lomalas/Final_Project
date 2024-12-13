package App.Application.Controllers;

import App.Domain.Inventory;
import App.Infrastructure.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventories")
public class InventoryController {

    private final InventoryRepository inventoryRepository;

    // Autowire the InventoryRepository into the controller
    @Autowired
    public InventoryController(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    // Endpoint to create a new Inventory
    @PostMapping
    public Inventory create(@RequestBody Inventory inventory) {
        return inventoryRepository.create(inventory);
    }

    // Endpoint to retrieve an Inventory by its ID
    @GetMapping("/{inventoryId}")
    public Inventory get(@PathVariable int inventoryId) {
        return inventoryRepository.get(inventoryId);
    }

    // Endpoint to retrieve all Inventories for a specific Character ID
    @GetMapping("/character/{charId}")
    public List<Inventory> getByCharacterId(@PathVariable String charId) {
        return inventoryRepository.getByCharacterId(charId);
    }

    // Endpoint to retrieve all Inventories
    @GetMapping
    public List<Inventory> getAll() {
        return inventoryRepository.getAll();
    }

    // Endpoint to update an existing Inventory
    @PutMapping("/{inventoryId}")
    public int update(@PathVariable int inventoryId, @RequestBody Inventory inventory) {
        return inventoryRepository.update(inventoryId, inventory);
    }

    // Endpoint to delete an Inventory by its ID
    @DeleteMapping("/{inventoryId}")
    public boolean delete(@PathVariable int inventoryId) {
        return inventoryRepository.delete(inventoryId);
    }
}
