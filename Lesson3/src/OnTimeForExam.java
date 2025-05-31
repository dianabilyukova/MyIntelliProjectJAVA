import java.util.Scanner;

public class OnTimeForExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinute = Integer.parseInt(scanner.nextLine());

        int examTime = examHour * 60 + examMinute;
        int arrivalTime = arrivalHour * 60 + arrivalMinute;

        int diff = arrivalTime - examTime;

        if (diff > 0) {
            System.out.println("Late");
            if (diff < 60) {
                System.out.printf("%d minutes after the start%n", diff);
            } else {
                int hours = diff / 60;
                int minutes = diff % 60;
                System.out.printf("%d:%02d hours after the start%n", hours, minutes);
            }
        } else if (diff >= -30) {
            System.out.println("On time");
            if (diff != 0) {
                System.out.printf("%d minutes before the start%n", Math.abs(diff));
            }
        } else {
            System.out.println("Early");
            if (Math.abs(diff) < 60) {
                System.out.printf("%d minutes before the start%n", Math.abs(diff));
            } else {
                int hours = Math.abs(diff) / 60;
                int minutes = Math.abs(diff) % 60;
                System.out.printf("%d:%02d hours before the start%n", hours, minutes);
            }
        }
    }
}
