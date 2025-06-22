import java.util.Scanner;

public class SumUntilTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum;
        int currentNum;
        for(sum = 0; sum < n; sum += currentNum) {
            currentNum = scanner.nextInt();
        }

        System.out.println(sum);
        scanner.close();
    }
}