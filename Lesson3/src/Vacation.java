import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double budget = scanner.nextDouble();

        String destination = "";
        String accommodation = "";
        double spentMoney = 0.0;

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                accommodation = "Camp";
                spentMoney = budget * 0.30;
            } else if (season.equals("winter")) {
                accommodation = "Hotel";
                spentMoney = budget * 0.70;
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                accommodation = "Camp";
                spentMoney = budget * 0.40;
            } else if (season.equals("winter")) {
                accommodation = "Hotel";
                spentMoney = budget * 0.80;
            }
        } else {
            destination = "Europe";
            accommodation = "Hotel";
            spentMoney = budget * 0.90;
        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f%n", accommodation, spentMoney);
    }
}
