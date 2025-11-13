import java.util.Scanner;

public class OrderSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart();

        System.out.println("🍔 YAPPEE PIZZA CAFE 🍕");
        System.out.println("=========================================");
        System.out.println("1. Burger - ₹120");
        System.out.println("2. Pizza - ₹250");
        System.out.println("3. Sandwich - ₹80");
        System.out.println("4. Pasta - ₹150");
        System.out.println("5. Exit");
        
        while (true) {
            System.out.print("\nEnter your choice (1-5): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    cart.addItem(new FoodItem("Burger", 120));
                    break;
                case 2:
                    cart.addItem(new FoodItem("Pizza", 250));
                    break;
                case 3:
                    cart.addItem(new FoodItem("Sandwich", 80));
                    break;
                case 4:
                    cart.addItem(new FoodItem("Pasta", 150));
                    break;
                case 5:
                    cart.showCart();
                    System.out.println("\nThank you for ordering! 🍽️");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }
}

