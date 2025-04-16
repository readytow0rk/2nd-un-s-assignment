import java.util.HashMap;
import java.util.Map;

public class UserStore {
    private static Map<String, String> users = new HashMap<>();

    public static void addUser(String username, String password) {
        users.put(username, password);
    }

    public static boolean validate(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }
}