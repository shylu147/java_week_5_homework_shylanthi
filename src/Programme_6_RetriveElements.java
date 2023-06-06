/** Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
import java.util.ArrayList;
import java.util.List;

public class Programme_6_RetriveElements {
    public static void main(String[] args) {
        Programme_6_RetriveElements retrieveElement6 = new Programme_6_RetriveElements();
        retrieveElement6.retrieve();
    }

    private void retrieve() {
        List<String> list = new ArrayList<>();
        list.add("Orange");
        list.add("Green");
        list.add("Blue");
        list.add("Red");
        list.add("Yellow");

        System.out.println(list.get(3));
    }
}
