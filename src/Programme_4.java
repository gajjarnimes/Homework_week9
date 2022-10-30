import java.util.ArrayList;

public class Programme_4 {
    public static void main(String[] args) {
        ArrayList<String> colourlist = new ArrayList<>();
        // add colour names
        colourlist.add("Red");colourlist.add("white");colourlist.add("Black");
        colourlist.add("Pink");colourlist.add("Blue");colourlist.add("Orange");
        colourlist.add("Purple");colourlist.add("Brown");colourlist.add("Sky Blue");
        colourlist.add("Burgandy");colourlist.add("Navy Blue"); colourlist.add("Yellow");
        for (String colourName :   colourlist) {
            System.out.println(colourName);

        }
    }
}
