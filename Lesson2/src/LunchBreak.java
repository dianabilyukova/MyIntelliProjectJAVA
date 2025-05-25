import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String seriesName = scanner.nextLine();
        int episodeDuration = scanner.nextInt();
        int breakDuration = scanner.nextInt();

        double lunchTime = breakDuration / 8.0;
        double restTime = breakDuration / 4.0;
        double timeLeft = breakDuration - lunchTime - restTime;

        if (timeLeft >= episodeDuration) {
            double freeTime = Math.ceil(timeLeft - episodeDuration);
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.%n", seriesName, freeTime);
        } else {
            double neededTime = Math.ceil(episodeDuration - timeLeft);
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.%n", seriesName, neededTime);
        }
    }
}
