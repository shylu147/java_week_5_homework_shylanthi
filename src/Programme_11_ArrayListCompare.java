
import java.util.ArrayList;

/**
 * Declare following two arrylist and compare it.
 ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */
public class Programme_11_ArrayListCompare {
    public static void main(String[] args) {

        Programme_11_ArrayListCompare obj = new Programme_11_ArrayListCompare();
        obj.arrayListCompare();

    }

    private void arrayListCompare() {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        c1.removeAll(c2);

        if (c1.isEmpty()) {
            System.out.println("Both list are equal");
        } else {
            System.out.println("List are not equal");
        }
    }
}
