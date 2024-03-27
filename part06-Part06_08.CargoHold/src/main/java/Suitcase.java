import java.util.ArrayList;

public class Suitcase {

    private int maxWeight;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        int kg = 0;
        for (Item thing : items) {
            kg += thing.getWeight();
        }
        if (kg + item.getWeight() <= maxWeight) {
            items.add(item);
        }
    }

    public void printItems() {

        for (Item item : items) {
            System.out.println(item);
        }

    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item piece : items) {
            totalWeight += piece.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        Item heaviest = items.get(0);

        for (Item piece : items) {
            if (heaviest.getWeight() < piece.getWeight()) {
                heaviest = piece;
            }
        }
        return heaviest;

    }


    public String toString(){

        int currentWeight = 0;
        for (Item piece : items) {
            currentWeight += piece.getWeight();
        }
        if (items.size() == 0) {
            return "no items " + "(0 kg)";
        }
        return items.size() + " item" +  (this.items.size() == 1 ? "" : "s)")
                + " (" + currentWeight + " kg)";
    }
}
