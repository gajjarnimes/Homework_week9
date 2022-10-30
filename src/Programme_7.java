import java.util.ArrayList;

public class Programme_7 {
    public static void main(String[] args) {
        ArrayList<String> Undergroundlist = new ArrayList<>();
        System.out.println("Is ArrayList empty?" + isArrayListEmpty(Undergroundlist));
        // add some elements to Arraylist
        Undergroundlist.add("Jubilee");
        Undergroundlist.add("Metropolitan");
        Undergroundlist.add("Bakerloo");
        Undergroundlist.add("Nothern ");
        Undergroundlist.add("Central");
        Undergroundlist.add("Piccadily");
        Undergroundlist.add("District");
        System.out.println("Is Arrylist empty?" + isArrayListEmpty(Undergroundlist));
    }
    private static boolean isArrayListEmpty(ArrayList list) {
        /*
         *Use size method of ArryList to check if ArryList is empty
         */
        return list.isEmpty();


    }
}
