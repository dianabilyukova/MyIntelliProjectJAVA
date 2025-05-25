import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = scanner.nextDouble();
        double statists = scanner.nextDouble();
        double pricePerStatist = scanner.nextDouble();

        double decor = budget * 0.10;
        double clothing = statists * pricePerStatist;

        if (statists > 150) {
            clothing = clothing * 0.90;
        }

        double total = decor + clothing;

        if (total > budget) {
            double needed = total - budget;
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.%n", needed);
        } else {
            double left = budget - total;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.%n", left);
        }
    }
}
