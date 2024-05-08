import java.util.ArrayList;
import java.util.List;

// Interface for different room strategies
interface RoomStrategy {
    void enter();
    List<Item> getItems();
}

// Concrete implementation of RoomStrategy for different types of rooms
class NormalRoomStrategy implements RoomStrategy {
    @Override
    public void enter() {
        System.out.println("You entered a normal room.");
    }

    @Override
    public List<Item> getItems() {
        // No items in normal room
        return new ArrayList<>();
    }
}

class TreasureRoomStrategy implements RoomStrategy {
    @Override
    public void enter() {
        System.out.println("You entered a treasure room. You found a chest full of gold!");
    }

    @Override
    public List<Item> getItems() {
        // Generate treasure items
        List<Item> items = new ArrayList<>();
        items.add(new Item("Gold", 5));
        items.add(new Item("Gem", 3));
        return items;
    }
}

class MonsterRoomStrategy implements RoomStrategy {
    @Override
    public void enter() {
        System.out.println("You entered a monster room. Prepare for battle!");
    }

    @Override
    public List<Item> getItems() {
        // Generate items dropped by monster
        List<Item> items = new ArrayList<>();
        items.add(new Item("Sword", 8));
        return items;
    }
}
