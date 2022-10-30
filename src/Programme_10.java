import java.util.*;

public class Programme_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(("Bakerloo,Central,District,Victoria,Piccadily,Jubilee,Northern,Cirlce"));
        System.out.println("______________");
        System.out.println("Please Enter the train line from above list");
        String london = scanner.nextLine();
        System.out.println("Enter staion name");
        String stationName = scanner.nextLine();

        Programme_10 cityName = new Programme_10();
        cityName.stationName(london);
        scanner.close();

    }
    public void stationName(String London){
        switch (London){
            case "Bakerloo":
                System.out.println("Baker street, Regent's park,Oxford Circus, Charring cross,Embankment");
                break;
            case "Central":
                System.out.println("Qeensway,Lancaster Gate,Holborn,St.pauls,Bank");
                break;
            case "District":
                System.out.println("Gloucester Road,South Kensington,Salone Square,Temple,Blackfriars");
                break;
            case "Victoria":
                System.out.println("Euston Square,Oxford Circus,Green Park,Victoria,Pimlico,Vauxhall");
                break;
            case"Picadilly":
                System.out.println("Knightsbridge,Piccadilly Circus,Covent Garden,Russell Square");
                break;
            case "Jubilee":
                System.out.println("Bond Street,Westminster,Waterloo,Southwark,Londonbridge");
                break;
            case"Northern":
                System.out.println("Euston,Angel,Old street,Moorgate,Tottenham Court Road,Charing cross");
                break;
            case "Circle":
                System.out.println("Paddington, Bayswater,Notting Hill Gate, Cannon street,Tower hill");

            default:
                System.out.println("Station name is correct");


        }

    }
}






