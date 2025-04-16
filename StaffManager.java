import java.util.ArrayList;

public class StaffManager {
    private static ArrayList<String> staffList = new ArrayList<>();

    public static void addStaff(String name) {
        staffList.add(name);
        System.out.println("Added staff: " + name);
    }

    public static void viewStaff() {
        System.out.println("== Staff Records ==");
        for (String staff : staffList) {
            System.out.println("- " + staff);
        }
    }
}