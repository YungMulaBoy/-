import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 10);
        int v = map.get("Alice");
        map.remove("Alice");
    }
}