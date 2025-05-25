import java.util.Scanner;

public class SpeedInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num <= 10) {
            System.out.println("slow");
        } else if (num <= 50) {
            System.out.println("average");
        } else if (num <= 150) {
            System.out.println("fast");
        } else if (num <= 1000) {
            System.out.println("ultra fast");
        } else {
            System.out.println("extremely fast");
        }
    }
}
