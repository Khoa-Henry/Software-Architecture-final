import java.util.ArrayList;
import java.util.List;

class InventoryManager {
    private static InventoryManager instance;
    private List<Item> items;

    private InventoryManager() {
        items = new ArrayList<>();
    }

    public static InventoryManager getInstance() {
        if (instance == null) {
            instance = new InventoryManager();
        }
        return instance;
    }

    public void addItem(Item item) {
        items.add(item);
        System.out.println("Added " + item.getName() + " to your inventory.");
    }

    public void listItems() {
        System.out.println("Inventory:");
        for (Item item : items) {
            System.out.println("- " + item.getName());
        }
    }
}
