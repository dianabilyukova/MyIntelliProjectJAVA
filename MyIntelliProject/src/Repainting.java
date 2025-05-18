import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double requiredAmountOfNylon = scanner.nextDouble();
        double requiredAmountOfPaint = scanner.nextDouble();
        double requiredAmountOfThinner = scanner.nextDouble();
        double neededHours = scanner.nextDouble();

        double addedPaint = requiredAmountOfPaint * 10 / 100;

        double priceForProtectiveNylon = (requiredAmountOfNylon + 2) * 1.50;
        double PriceForPaint = (requiredAmountOfPaint + addedPaint) * 14.50;
        double PriceForPaintThinner = requiredAmountOfThinner * 5.00;
        double sumForBags = 0.40;
        double totalSumForMaterials = priceForProtectiveNylon + PriceForPaint + PriceForPaintThinner + sumForBags;

        double priceForOneHourForWorkers = totalSumForMaterials * 30 /100;
        double totalPriceForWorkers = priceForOneHourForWorkers * neededHours;

        double totalSum = totalSumForMaterials + totalPriceForWorkers;

        System.out.println(totalSum);

    }
}
