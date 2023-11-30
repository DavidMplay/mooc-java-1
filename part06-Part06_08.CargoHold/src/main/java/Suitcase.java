
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= this.maxWeight) {
            items.add(item);
        }
    }

    public int totalWeight() {
        int total = 0;
        for (Item item : items) {
            total += item.getWeight();
        }
        return total;
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }

    public String toString() {
        if (this.items.size() == 0) {
            return "no items (0 kg)";
        } else if (this.items.size() == 1) {
            return this.items.size() + " item (" + this.totalWeight() + " kg)";

        }
        return this.items.size() + " items (" + this.totalWeight() + " kg)";
    }
    public Item heaviestItem(){
        if(items.isEmpty()){
            return null;
        }
        Item heaviest = this.items.get(0);
        for(Item item : items){
            if (heaviest.getWeight() < item.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }
}
