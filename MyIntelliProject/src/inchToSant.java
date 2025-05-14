import java.sql.SQLOutput;
import java.util.Scanner;

public class inchToSant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inch = scanner.nextInt();

        System.out.println(inch * 2.54);
    }
}
