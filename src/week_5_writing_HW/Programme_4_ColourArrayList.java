package week_5_writing_HW;

import java.util.ArrayList;

/**Write a Java program to create a new array list, add some colours (string)
* and printout the collection using for each loop.
*/

public class Programme_4_ColourArrayList {
    public static void main(String[] args) {
        ArrayList<String> colourlist = new ArrayList<>();
        colourlist.add("RED");
        colourlist.add("BLUE");
        colourlist.add("GREEN");
        colourlist.add("YELLOW");
        colourlist.add("BLACK");
        colourlist.add("WHITE");
        colourlist.add("ORANGE");
        colourlist.add("PURPLE");
        colourlist.add("CYAN");

        for (String colourList : colourlist){
            System.out.print(colourList + " , ");
        }
    }
}
