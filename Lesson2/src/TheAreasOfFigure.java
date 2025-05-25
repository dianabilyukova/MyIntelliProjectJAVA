import java.util.Scanner;

public class TheAreasOfFigure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        
        if (input.equals("square")) {
            double a = scanner.nextDouble();
            System.out.printf("%.3f", a * a);
        } else if (input.equals("rectangle")) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            System.out.printf("%.3f", a * b);
        } else if (input.equals("circle")) {
            double r = scanner.nextDouble();
            System.out.printf("%.3f", Math.PI * r * r);
        } else if (input.equals("triangle")) {
            double a = scanner.nextDouble();
            double h = scanner.nextDouble();
            System.out.printf("%.3f", (a * h) / 2);
        } else {
            System.out.println("invalid input");
        }
    }
}
