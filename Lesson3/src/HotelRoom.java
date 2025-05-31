import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double studioPricePerNight = 0.0;
        double apartmentPricePerNight = 0.0;

        switch (month) {
            case "May":
            case "October":
                studioPricePerNight = 50;
                apartmentPricePerNight = 65;
                break;
            case "June":
            case "September":
                studioPricePerNight = 75.20;
                apartmentPricePerNight = 68.70;
                break;
            case "July":
            case "August":
                studioPricePerNight = 76;
                apartmentPricePerNight = 77;
                break;
        }

        double totalStudioPrice = studioPricePerNight * nights;
        double totalApartmentPrice = apartmentPricePerNight * nights;

        // Discounts
        if ((month.equals("May") || month.equals("October"))) {
            if (nights > 14) {
                totalStudioPrice *= 0.70;
            } else if (nights > 7) {
                totalStudioPrice *= 0.95;
            }
        } else if ((month.equals("June") || month.equals("September"))) {
            if (nights > 14) {
                totalStudioPrice *= 0.80;
            }
        }

        if (nights > 14) {
            totalApartmentPrice *= 0.90;
        }

        System.out.printf("Apartment: %.2f lv.%n", totalApartmentPrice);
        System.out.printf("Studio: %.2f lv.%n", totalStudioPrice);
    }
}
