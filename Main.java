import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Welcome to TBRMS ===");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose: ");
            
            String input = scanner.nextLine();
            int choice;

            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("❌ Invalid input. Please choose 1, 2 or 3.");
                continue;
            }

            switch (choice) {
                case 1:
                    RegisterForm.startRegister();
                    break;
                case 2:
                    LoginForm.startLogin();
                    break;
                case 3:
                    System.out.println("👋 Exiting system.");
                    return;
                default:
                    System.out.println("❌ Invalid input. Please choose 1, 2 or 3.");
            }
        }
    }
}