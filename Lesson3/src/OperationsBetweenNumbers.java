import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        double result = 0.0;
        String evenOrOdd = "";

        switch (operator) {
            case "+":
                result = N1 + N2;
                evenOrOdd = (result % 2 == 0) ? "even" : "odd";
                System.out.printf("%d %s %d = %.0f - %s%n", N1, operator, N2, result, evenOrOdd);
                break;
            case "-":
                result = N1 - N2;
                evenOrOdd = (result % 2 == 0) ? "even" : "odd";
                System.out.printf("%d %s %d = %.0f - %s%n", N1, operator, N2, result, evenOrOdd);
                break;
            case "*":
                result = N1 * N2;
                evenOrOdd = (result % 2 == 0) ? "even" : "odd";
                System.out.printf("%d %s %d = %.0f - %s%n", N1, operator, N2, result, evenOrOdd);
                break;
            case "/":
                if (N2 == 0) {
                    System.out.printf("Cannot divide %d by zero%n", N1);
                } else {
                    result = (double) N1 / N2;
                    System.out.printf("%d / %d = %.2f%n", N1, N2, result);
                }
                break;
            case "%":
                if (N2 == 0) {
                    System.out.printf("Cannot divide %d by zero%n", N1);
                } else {
                    result = N1 % N2;
                    System.out.printf("%d %% %d = %.0f%n", N1, N2, result);
                }
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }
    }
}
