public class Item {
    private String name;
    private int weight; // Additional attribute for demonstration

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    // Setter method for weight
    public void setWeight(int weight) {
        this.weight = weight;
    }
}
