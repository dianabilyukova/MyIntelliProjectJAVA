import java.util.Scanner;

public class radiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radians = scanner.nextDouble();
        double degrees = radians * 180 / Math.PI;

        System.out.println(degrees);
    }
}
