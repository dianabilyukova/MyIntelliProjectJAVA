import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        for(String line = scanner.nextLine(); !line.equals("Stop"); line = scanner.nextLine()) {
            int num = Integer.parseInt(line);
            if (num > max) {
                max = num;
            }
        }

        System.out.println(max);
        scanner.close();
    }
}
