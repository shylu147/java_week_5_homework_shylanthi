

import java.util.HashMap;
import java.util.Map;

/**Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme_9_HashMap {
    public static void main(String[] args) {
        Programme_9_HashMap obj = new Programme_9_HashMap();
        obj.map();

    }

    private void map() {

        Map<String, Integer> people = new HashMap<>();
        people.put("Varun", 26);
        people.put("Vyshu", 33);
        people.put("Rishi", 15);
        people.put("Kushi", 25);
        people.put("Nishi", 35);
        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }
    }

}
