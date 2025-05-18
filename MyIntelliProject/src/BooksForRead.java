import java.util.Scanner;

public class BooksForRead {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberOfPages = scanner.nextDouble();
        double pagesByHour = scanner.nextDouble();
        double numberOfDays = scanner.nextDouble();

        double totalTimeForReading = numberOfPages / pagesByHour;
        double neededHours = totalTimeForReading / numberOfDays;

        System.out.println(neededHours);

    }
}
