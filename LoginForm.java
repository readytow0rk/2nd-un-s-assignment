import java.util.Scanner;

public class LoginForm {
    public static void startLogin() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Login ===");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (UserStore.validate(username, password)) {
            System.out.println("✅ Login successful!");
            OrderMenu.showMenu();
        } else {
            System.out.println("❌ Invalid login.");
        }
    }
}