import java.util.Scanner;

public class SwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSeconds = scanner.nextDouble();
        double distanceInMeters = scanner.nextDouble();
        double timePerMeter = scanner.nextDouble();

        double timeWithoutResistance = distanceInMeters * timePerMeter;
        double slowdowns = Math.floor(distanceInMeters / 15);
        double totalResistanceTime = slowdowns * 12.5;
        double totalTime = timeWithoutResistance + totalResistanceTime;

        if (totalTime < recordInSeconds) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.%n", totalTime);
        } else {
            double diff = totalTime - recordInSeconds;
            System.out.printf("No, he failed! He was %.2f seconds slower.%n", diff);
        }
    }
}
