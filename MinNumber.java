import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;

        for(String line = scanner.nextLine(); !line.equals("Stop"); line = scanner.nextLine()) {
            int num = Integer.parseInt(line);
            if (num < min) {
                min = num;
            }
        }

        System.out.println(min);
        scanner.close();
    }
}
