import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * Write a Java program to iterate through all elements in an array list using Iterater.
 */

public class Programme_5 {

    public static void main(String[] args) {
        Programme_5 arrayListIterator5 = new Programme_5();
        arrayListIterator5.arrayIterator();
    }

    private void arrayIterator() {
        List<String> list = new ArrayList<>();
        list.add("Orange");
        list.add("Pink");
        list.add("Blue");
        list.add("Red");
        list.add("Black");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


}




