import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Hashmap {
    public static void main(String[] args) {

        //Create a HashMap where keys are strings (names) and values are integers (ages).
        //Add, remove, and update key-value pairs.
        //Retrieve the value associated with a specific key.
        //Iterate through the keys and values in the HashMap.
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Nizami", 19);
        map.put("Huseyn", 21);
        map.put("Xeyyam", 22);
        System.out.println(map);

        System.out.println(map.get("Xeyyam"));

        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Iterator<Integer> iterator1 = map.values().iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        map.remove("Huseyn");
        System.out.println(map);
    }
}
