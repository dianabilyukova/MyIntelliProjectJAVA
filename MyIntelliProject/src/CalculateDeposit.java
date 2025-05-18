import java.util.Scanner;

public class CalculateDeposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double depositSum = scanner.nextDouble();
        double depositMonth = scanner.nextInt();
        double percentageInterest = scanner.nextDouble();

        double calculatePercentage = depositSum * percentageInterest / 100;
        double percentageForMonth = calculatePercentage / 12;
        double totalSum = depositSum + depositMonth * percentageForMonth;

        System.out.println(totalSum);

    }
}
