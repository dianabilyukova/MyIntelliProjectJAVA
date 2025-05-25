import java.util.Scanner;

public class TheSumOfSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeFirst = scanner.nextInt();
        int timeSecond = scanner.nextInt();
        int timeThird = scanner.nextInt();

        int totalTime = timeFirst + timeSecond + timeThird;

        int minutes = totalTime / 60;
        int seconds = totalTime % 60;

        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}
