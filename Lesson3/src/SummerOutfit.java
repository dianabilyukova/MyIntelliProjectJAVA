import java.sql.Time;
import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String TimeOfDay = scanner.nextLine();
        int degree = scanner.nextInt();

        String Outfit = "";
        String Shoes = "";

        if (10 <= degree && degree <= 18) {
            if (TimeOfDay.equals("Morning")) {
                Outfit = "Sweatshirt";
                Shoes = "Sneakers";
            } else if (TimeOfDay.equals("Afternoon")) {
                Outfit = "Shirt";
                Shoes = "Moccasins";
            } else if (TimeOfDay.equals("Evening")) {
                Outfit = "Shirt";
                Shoes = "Moccasins";
            }

        } else if (18 < degree && degree <= 24) {
            if (TimeOfDay.equals("Morning")) {
                Outfit = "Shirt";
                Shoes = "Moccasins";
            } else if (TimeOfDay.equals("Afternoon")) {
                Outfit = "T - Shirt";
                Shoes = "Sandals";
            } else if (TimeOfDay.equals("Evening")) {
                Outfit = "Shirt";
                Shoes = "Moccasins";
            }
        } else if (degree >= 25) {
            if (TimeOfDay.equals("Morning")) {
                Outfit = "T - Shirt";
                Shoes = "Sandals";
            } else if (TimeOfDay.equals("Afternoon")) {
                Outfit = "Swim Suit";
                Shoes = "Barefoot";
            } else if (TimeOfDay.equals("Evening")) {
                Outfit = "Shirt";
                Shoes = "Moccasins";
            }
        } else {
            System.out.println("Error");
        }
        System.out.printf("It's %d degrees, get your %s and %s.", degree, Outfit, Shoes);
    }
}
