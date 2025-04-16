import java.util.Scanner;

public class RegisterForm {
    public static void startRegister() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Register ===");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        UserStore.addUser(username, password);

        System.out.println("✅ Registered successfully!");
    }
}