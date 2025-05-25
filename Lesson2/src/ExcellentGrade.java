import java.util.Scanner;

public class ExcellentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();

        if (grade >= 5 && grade <= 6) {
            System.out.println("Excellent");
        } else if (grade > 2 && grade < 5) {
            System.out.println("Not good");
        } else {
            System.out.println("Bad input");
        }
    }
}
