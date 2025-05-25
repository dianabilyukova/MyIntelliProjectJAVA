import java.util.Scanner;

public class TimePlus15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();


        int hoursToMinutes = hours * 60;
        int totalTimeInMinutes = hoursToMinutes + minutes;
        int totalTimePlus15 = totalTimeInMinutes + 15;

        int hoursPlus15 = totalTimePlus15 / 60;
        int minutesPlus15 = totalTimePlus15 % 60;


        if (minutesPlus15 < 10) {
            System.out.printf("%d:0%d", hoursPlus15, minutesPlus15);
        } else {
            System.out.printf("%d:%d", hoursPlus15, minutesPlus15);
        }

    }
}
