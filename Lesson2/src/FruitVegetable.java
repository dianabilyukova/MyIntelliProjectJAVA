import java.util.Scanner;

public class FruitVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();

        boolean fruits = product.equals("banana") || product.equals("apple") || product.equals("kiwi") ||
                product.equals("cherry") || product.equals("lemon") || product.equals("grapes");
        boolean vegetable = product.equals("tomato") || product.equals("cucumber") || product.equals("carrot");

        if (fruits) {
            System.out.println("fruit");
        } else if (vegetable) {
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }
    }
}
