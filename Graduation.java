import java.text.DecimalFormat;
import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String student = scanner.nextLine();
        int grade = 1;
        int fails = 0;
        double sumGrades = (double)0.0F;
        DecimalFormat df = new DecimalFormat("0.00");

        while(grade <= 12) {
            double score = Double.parseDouble(scanner.nextLine());
            if (score < (double)4.0F) {
                ++fails;
                if (fails > 1) {
                    System.out.printf("%s has been excluded at %d grade", student, grade);
                    scanner.close();
                    return;
                }
            } else {
                sumGrades += score;
                ++grade;
            }
        }

        double average = sumGrades / (double)12.0F;
        System.out.printf("%s graduated. Average grade: %s", student, df.format(average));
        scanner.close();
    }
}

