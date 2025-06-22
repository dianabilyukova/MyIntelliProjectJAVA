import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = scanner.nextLine();

        for(String input = scanner.nextLine(); !input.equals(password); input = scanner.nextLine()) {
        }

        System.out.printf("Welcome %s! %n", username);
        scanner.close();
    }
}

