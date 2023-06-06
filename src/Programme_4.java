import java.util.ArrayList;

public class Programme_4 {
    /**Write a Java program to create a new array list, add some colours (string) and printout the collection
     *  using for each loop.
     */
    int[] a= new int[5];
    public static void main(String[] args) {

        ArrayList<String>colourList=new ArrayList<>();
        colourList.add("Red");
        colourList.add("Green");
        colourList.add("Black");
        colourList.add("Yellow");
        colourList.add("Orange");
        for (int i=0; i<colourList.size();i++){
            System.out.println(colourList.get(i));
        }
    }

}