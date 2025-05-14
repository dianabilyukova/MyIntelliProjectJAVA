import java.util.Scanner;

public class GreetingByName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String name = scanner.nextLine();
        String name_1 = scanner.next();


        //System.out.println("Hello, " + name + "!");
        System.out.println(String.format("Hello, %s!", name_1));
    }
}
