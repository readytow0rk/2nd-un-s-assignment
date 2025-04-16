import java.util.ArrayList;
import java.util.Scanner;

public class OrderMenu {
    private static int totalSales = 0;
    private static ArrayList<String> orderHistory = new ArrayList<>();

    public static void showMenu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== Restaurant Menu ===");
            System.out.println("1. View Menu");
            System.out.println("2. Place Order");
            System.out.println("3. Print Bill");
            System.out.println("4. Inventory Reminder");
            System.out.println("5. View Sales");
            System.out.println("6. Logout");
            System.out.println("9. Add Inventory Item");
            System.out.println("10. View Stock");
            System.out.println("11. Send Low Stock Reminders");
            System.out.println("12. View Order History");
            System.out.print("Choose: ");

            String input = sc.nextLine();
            int choice;

            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("❌ Please enter a valid number.");
                continue; // restart loop
            }

            switch (choice) {
                case 1:
                    System.out.println("[Sample Menu] Burger, Pizza, Salad");
                    break;

                case 2:
                    try {
                        System.out.print("Enter order price (£): ");
                        int price = sc.nextInt();
                        sc.nextLine(); // clear buffer
                        totalSales += price;

                        System.out.print("Enter item name: ");
                        String item = sc.nextLine();
                        orderHistory.add(item + " - £" + price);
                        System.out.println("✅ Order placed.");
                    } catch (Exception e) {
                        System.out.println("❌ Invalid price input.");
                        sc.nextLine(); // clear buffer
                    }
                    break;

                case 3:
                    System.out.println("🧾 Bill printed (fake).");
                    break;

                case 4:
                    System.out.println("📢 Reminder sent to chef to restock.");
                    break;

                case 5:
                    System.out.println("💰 Sales today: £" + totalSales);
                    break;

                case 6:
                    System.out.println("👋 Logged out.\n");
                    return;

                case 9:
    try {
        System.out.print("Item name: ");
        String newItem = sc.nextLine();
        System.out.print("Quantity: ");
        int qty = Integer.parseInt(sc.nextLine());
        System.out.print("Price per unit (£): ");
        double pricePerUnit = Double.parseDouble(sc.nextLine());
        InventoryManager.addItem(newItem, qty, pricePerUnit);
    } catch (NumberFormatException e) {
        System.out.println("❌ Invalid input for quantity or price.");
    }
    break;

                case 10:
                    InventoryManager.viewStock();
                    break;

                case 11:
                    InventoryManager.remindLowStock();
                    break;

                case 12:
                    System.out.println("📦 Order History:");
                    for (String o : orderHistory) {
                        System.out.println("- " + o);
                    }
                    break;

                default:
                    System.out.println("❌ Invalid choice.");
            }
        }
    }
}