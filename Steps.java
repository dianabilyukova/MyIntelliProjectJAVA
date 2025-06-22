import java.util.Scanner;

public class Steps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int goal = 10000;

        int totalSteps;
        String line;
        for(totalSteps = 0; totalSteps < 10000; totalSteps += Integer.parseInt(line)) {
            line = scanner.nextLine();
            if (line.equals("Going home")) {
                totalSteps += Integer.parseInt(scanner.nextLine());
                break;
            }
        }

        if (totalSteps >= 10000) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d over the goal! %n", totalSteps - 10000);
        } else {
            System.out.printf("%d more steps to reach goal. %n", 10000 - totalSteps);
        }

        scanner.close();
    }
}
