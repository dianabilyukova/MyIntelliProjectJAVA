import java.util.Scanner;

public class InRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        if (num >= -100 && num <=100 && num != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
