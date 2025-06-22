import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int pieces;
        String line;
        for(pieces = width * length; pieces > 0 && !(line = scanner.nextLine()).equals("STOP"); pieces -= Integer.parseInt(line)) {
        }

        if (pieces > 0) {
            System.out.printf("%d pieces are left.%n", pieces);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.%n", Math.abs(pieces));
        }

    }
}
