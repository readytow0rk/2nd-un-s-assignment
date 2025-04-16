import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    private static Map<String, Integer> stock = new HashMap<>();
    private static Map<String, Double> prices = new HashMap<>();
    private static double totalSales = 0;

    public static void addItem(String item, int quantity, double price) {
        stock.put(item, stock.getOrDefault(item, 0) + quantity);
        prices.put(item, price);
        System.out.println(item + " added. Total: " + stock.get(item) + " | Price: £" + price);
    }

    public static void viewStock() {
        System.out.println("=== Current Inventory ===");
        if (stock.isEmpty()) {
            System.out.println("No stock added yet.");
            return;
        }
        for (Map.Entry<String, Integer> entry : stock.entrySet()) {
            String item = entry.getKey();
            int qty = entry.getValue();
            double price = prices.getOrDefault(item, 0.0);
            System.out.println(item + " - Qty: " + qty + ", Price: £" + price);
        }
    }

    public static void remindLowStock() {
        System.out.println("=== Low Stock Reminders ===");
        boolean found = false;
        for (Map.Entry<String, Integer> entry : stock.entrySet()) {
            if (entry.getValue() < 5) {
                System.out.println("⚠️ " + entry.getKey() + " is low on stock! Only " + entry.getValue() + " left.");
                found = true;
            }
        }
        if (!found) {
            System.out.println("All items sufficiently stocked.");
        }
    }

    public static void simulateOrder(String item, int quantity) {
        if (stock.containsKey(item) && stock.get(item) >= quantity) {
            double price = prices.getOrDefault(item, 0.0);
            stock.put(item, stock.get(item) - quantity);
            double sale = price * quantity;
            totalSales += sale;
            System.out.println("✅ " + quantity + " x " + item + " sold. Total: £" + sale);
        } else {
            System.out.println("❌ Not enough " + item + " in stock.");
        }
    }

    public static void showTotalSales() {
        System.out.println("Sales today: £" + totalSales);
    }
}