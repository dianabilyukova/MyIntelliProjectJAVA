import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String feedback = scanner.nextLine();

        int nights = days - 1;
        double pricePerNight = 0.0;

        switch (roomType) {
            case "room for one person":
                pricePerNight = 18.00;
                break;
            case "apartment":
                pricePerNight = 25.00;
                break;
            case "president apartment":
                pricePerNight = 35.00;
                break;
        }

        double total = nights * pricePerNight;


        if (roomType.equals("apartment")) {
            if (nights < 10) {
                total *= 0.70;
            } else if (nights <= 15) {
                total *= 0.65;
            } else {
                total *= 0.50;
            }
        } else if (roomType.equals("president apartment")) {
            if (nights < 10) {
                total *= 0.90;
            } else if (nights <= 15) {
                total *= 0.85;
            } else {
                total *= 0.80;
            }
        }


        if (feedback.equals("positive")) {
            total *= 1.25;
        } else if (feedback.equals("negative")) {
            total *= 0.90;
        }

        System.out.printf("%.2f%n", total);
    }
}
