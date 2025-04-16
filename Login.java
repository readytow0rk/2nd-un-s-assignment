import java.util.Scanner;

public class Login {
    public static void startLogin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Login ===");

        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        // Fake login (for now)
        if (username.equals("admin") && password.equals("123")) {
            System.out.println("Login success.\n");
            OrderMenu.showMenu();  // Proceed to menu after login
        } else {
            System.out.println("Invalid login.\n");
        }
    }
}