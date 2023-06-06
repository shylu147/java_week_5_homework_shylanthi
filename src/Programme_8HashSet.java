

import java.util.HashSet;
import java.util.Set;

/** Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if else)
 */
public class Programme_8HashSet {
    public static void main(String[] args) {
        Programme_8HashSet hashSetInteger8 = new Programme_8HashSet();
        hashSetInteger8.set();
    }

    private void set() {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);

        for (int i = 0; i < 100; ++i) {
            if(set.contains(i)){
                System.out.println("Number available :" + i);
            }
        }
    }
}
