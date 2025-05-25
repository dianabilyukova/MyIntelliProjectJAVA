import java.util.Scanner;

public class ToysShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceOfTrip = scanner.nextDouble();
        double numberOfPuzzles = scanner.nextDouble();
        double numberOfDolls = scanner.nextDouble();
        double numberOfTeddyBears = scanner.nextDouble();
        double numberOfMinions = scanner.nextDouble();
        double numberOfTrucks = scanner.nextDouble();

        double totalNumberOfToys = numberOfPuzzles + numberOfDolls +
                numberOfTeddyBears + numberOfMinions + numberOfTrucks;
        double totalPriceOfToys = numberOfPuzzles * 2.60 + numberOfDolls * 3 +
                numberOfTeddyBears * 4.10 + numberOfMinions * 8.20 + numberOfTrucks * 2;

        if (totalNumberOfToys >= 50) {
            totalPriceOfToys = totalPriceOfToys * 0.75;
        }

        double rent = totalPriceOfToys * 0.10;
        double profit = totalPriceOfToys - rent;

        if (profit >= priceOfTrip) {
            double moneyLeft = profit - priceOfTrip;
            System.out.printf("Yes! %.2f lv left.%n", moneyLeft);
        } else {
            double neededMoney = priceOfTrip - profit;
            System.out.printf("Not enough money! %.2f lv needed.%n", neededMoney);
        }


    }
}
