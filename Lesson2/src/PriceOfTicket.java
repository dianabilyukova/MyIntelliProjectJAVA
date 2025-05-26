import java.util.Scanner;

public class PriceOfTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();


        boolean weekDay1 = day.equals("Monday") || day.equals("Tuesday") || day.equals("Friday");

        boolean weekDay2 = day.equals("Wednesday") || day.equals("Thursday");

        boolean weekDay3 = day.equals("Saturday") || day.equals("Sunday");

        if (weekDay1) {
            System.out.println("12");
        } else if (weekDay2) {
            System.out.println("14");
        } else if (weekDay3) {
            System.out.println("16");
        } else {
            System.out.println("error");
        }

    }
}
