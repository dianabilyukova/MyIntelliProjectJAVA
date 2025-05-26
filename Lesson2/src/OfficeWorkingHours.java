import java.util.Scanner;

public class OfficeWorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int hours = scanner.nextInt();

        boolean workingDay = day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") ||
                day.equals("Thursday") || day.equals("Friday") || day.equals("Saturday");

        boolean workingHours = hours >= 10 && hours <=18;

        if (workingHours && workingDay) {
            System.out.println("open");
        } else {
            System.out.println("closed");
        }
    }
}
