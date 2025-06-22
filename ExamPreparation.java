import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int failedThreshold = Integer.parseInt(scanner.nextLine());
        int failedTimes = 0;
        int solveProblemsCount = 0;
        double gradesSum = (double)0.0F;
        String lastProblem = "";

        boolean isFailed;
        String problemName;
        for(isFailed = true; failedTimes < failedThreshold; lastProblem = problemName) {
            problemName = scanner.nextLine();
            if ("Enough".equals(problemName)) {
                isFailed = false;
                break;
            }

            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4) {
                ++failedTimes;
            }

            gradesSum += (double)grade;
            ++solveProblemsCount;
        }

        if (isFailed) {
            System.out.printf("You need a break, %d poor grades", failedThreshold);
        } else {
            System.out.printf("Average score: %2f%n", gradesSum / (double)solveProblemsCount);
            System.out.printf("Number of problems: %d%n", solveProblemsCount);
            System.out.printf("Last problem: %s", lastProblem);
        }

        scanner.close();
    }
}
