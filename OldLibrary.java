import java.util.Scanner;

public class OldLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String targetBook = scanner.nextLine();
        String current = scanner.nextLine();
        int count = 0;

        boolean isFound;
        for(isFound = false; !current.equals("No More Books"); current = scanner.nextLine()) {
            ++count;
            if (current.equals(targetBook)) {
                isFound = true;
                break;
            }
        }

        if (isFound) {
            System.out.printf("You checked %d books and found it.%n", count);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.%n", count);
        }

        scanner.close();
    }
}

