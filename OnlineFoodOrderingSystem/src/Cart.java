import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<FoodItem> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public void addItem(FoodItem item) {
        items.add(item);
        System.out.println(item.getName() + " added to cart.");
    }

    public double calculateTotal() {
        double total = 0;
        for (FoodItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void showCart() {
        System.out.println("\nYour Cart:");
        for (FoodItem item : items) {
            System.out.println("- " + item.getName() + " : ₹" + item.getPrice());
        }
        System.out.println("Total: ₹" + calculateTotal());
    }
}
