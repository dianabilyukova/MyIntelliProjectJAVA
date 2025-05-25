import java.util.Scanner;

public class ComputerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = scanner.nextDouble();
        int videoCards = scanner.nextInt();
        int processors = scanner.nextInt();
        int ram = scanner.nextInt();

        double videoCardPrice = 250.00;
        double totalVideoCardPrice = videoCards * videoCardPrice;
        double processorPrice = totalVideoCardPrice * 0.35;
        double ramPrice = totalVideoCardPrice * 0.10;

        double totalProcessorPrice = processors * processorPrice;
        double totalRamPrice = ram * ramPrice;

        double total = totalVideoCardPrice + totalProcessorPrice + totalRamPrice;

        if (videoCards > processors) {
            total = total * 0.85;
        }

        if (budget >= total) {
            System.out.printf("You have %.2f leva left!%n", budget - total);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!%n", total - budget);
        }
    }
}
