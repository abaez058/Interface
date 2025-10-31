import java.util.ArrayList;
import java.util.List;

public class FoodOrder implements Order {
    private List<FoodItem> items;


    public FoodOrder() {
        this.items = new ArrayList<>();
    }


    public void addItem(FoodItem item) {
        items.add(item);
        System.out.println(item.getName() + " added to the order.");
    }


    public double calculateTotal() {
        double total = 0;
        for (FoodItem item : items) {
            total += item.getPrice();
        }
        return total;
    }


    public void displayOrderDetails() {
        System.out.println("\nOrder Details:");
        for (FoodItem item : items) {
            System.out.println(item.getName() + " " + item.getDescription() + ": $" + item.getPrice());
        }
        System.out.println("Total Cost: $" + calculateTotal());
    }
}
