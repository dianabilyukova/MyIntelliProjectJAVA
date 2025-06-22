import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int freeSpace;
        int boxes;
        for(freeSpace = width * length * height; freeSpace > 0 && !"Done".equals(scanner.nextLine()); freeSpace -= boxes) {
            boxes = Integer.parseInt(scanner.nextLine());
        }

        if (freeSpace >= 0) {
            System.out.printf("%d Cubic meters left. %n", freeSpace);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.%n", Math.abs(freeSpace));
        }

    }
}
