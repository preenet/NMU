package Map;
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Create a Map
        Map<String, Integer> map = new HashMap<>();

        // Add key-value pairs to the map
        map.put("apple", 10);
        map.put("banana", 5);
        map.put("orange", 7);

        // Retrieve values based on keys
        int appleCount = map.get("apple");
        System.out.println("Number of apples: " + appleCount);

        // Check if a key exists
        boolean containsKey = map.containsKey("banana");
        System.out.println("Contains banana: " + containsKey);

        // Remove a key-value pair
        map.remove("orange");

        // Iterate over the key-value pairs
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }
}