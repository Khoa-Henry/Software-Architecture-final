import java.util.List;
import java.util.Scanner;

public class Game {
    private Scanner scanner;

    public Game() {
        scanner = new Scanner(System.in);
    }

    public void start() {
        // Singleton instance of InventoryManager
        InventoryManager inventoryManager = InventoryManager.getInstance();

        // Game loop
        while (true) {
            System.out.println("You are in a new room. Choose your action:");
            System.out.println("1. Move to the next room");
            System.out.println("2. Search for treasure");
            System.out.println("3. Fight the monster");
            System.out.println("4. View inventory");
            System.out.println("5. Quit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Moving to the next room...");
                    // Factory Method to create a random room
                    RoomStrategy roomStrategy = RoomFactory.createRoom(getRandomRoomType());
                    roomStrategy.enter();
                    List<Item> itemsInRoom = roomStrategy.getItems();
                    for (Item item : itemsInRoom) {
                        inventoryManager.addItem(item);
                    }
                    break;
                case 2:
                    System.out.println("You can only search for treasure in treasure rooms.");
                    break;
                case 3:
                    System.out.println("You can only fight monsters in monster rooms.");
                    break;
                case 4:
                    inventoryManager.listItems();
                    break;
                case 5:
                    System.out.println("Exiting the game...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method to get a random room type
    private static String getRandomRoomType() {
        String[] roomTypes = {"normal", "treasure", "monster"};
        int index = (int) (Math.random() * roomTypes.length);
        return roomTypes[index];
    }
}
