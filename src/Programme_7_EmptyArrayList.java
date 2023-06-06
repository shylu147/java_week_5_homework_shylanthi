

import java.util.ArrayList;
import java.util.List;
/**
Write a Java program to test if an array list is empty or not.
*/

public class Programme_7_EmptyArrayList {

    public static void main(String[] args) {
        Programme_7_EmptyArrayList obj = new Programme_7_EmptyArrayList();
        obj.arrayListEmpty();
    }

    private void arrayListEmpty() {
        List<String> list = new ArrayList<>();
        list.add("England");
        list.add("France");
        list.add("Germany");
        list.add("Italy");
        list.add("Holland");
        list.add("Brazil");

        System.out.println(list.isEmpty());
    }


}
