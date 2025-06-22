import java.util.Scanner;

public class ReadUntilStop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(String input = scanner.nextLine(); !input.equals("Stop"); input = scanner.nextLine()) {
            System.out.println(input);
        }

        scanner.close();
    }
}