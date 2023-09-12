import java.util.HashSet;
import java.util.Iterator;

public class HashsetItarate {
    public static void main(String[] args) {
        //Create a HashSet of strings and iterate through its elements using an iterator.
        //Use a for-each loop to iterate through the HashSet.

        HashSet<String> set = new HashSet<>();
        set.add("salam");
        set.add("necesen?");
        set.add("yaxsiyam");
        set.add("yaxsi ol");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
