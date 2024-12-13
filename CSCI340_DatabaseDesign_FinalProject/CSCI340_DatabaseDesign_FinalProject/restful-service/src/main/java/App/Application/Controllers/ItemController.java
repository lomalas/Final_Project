package App.Application.Controllers;

import App.Domain.Item;
import App.Infrastructure.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    private final ItemRepository itemRepository;

    // Autowire the ItemRepository into the controller
    @Autowired
    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    // Endpoint to create a new Item
    @PostMapping
    public Item create(@RequestBody Item item) {
        return itemRepository.create(item);
    }

    // Endpoint to retrieve an Item by its ID
    @GetMapping("/{itemId}")
    public Item get(@PathVariable int itemId) {
        return itemRepository.get(itemId);
    }

    // Endpoint to retrieve all Items
    @GetMapping
    public List<Item> getAll() {
        return itemRepository.getAll();
    }

    // Endpoint to retrieve Items by rarity
    @GetMapping("/rarity/{rarity}")
    public List<Item> getByRarity(@PathVariable String rarity) {
        return itemRepository.getByRarity(rarity);
    }

    // Endpoint to retrieve all magic Items
    @GetMapping("/magic")
    public List<Item> getMagicItems() {
        return itemRepository.getMagicItems();
    }

    // Endpoint to update an existing Item
    @PutMapping("/{itemId}")
    public int update(@PathVariable int itemId, @RequestBody Item item) {
        return itemRepository.update(itemId, item);
    }

    // Endpoint to delete an Item by its ID
    @DeleteMapping("/{itemId}")
    public boolean delete(@PathVariable int itemId) {
        return itemRepository.delete(itemId);
    }
}
