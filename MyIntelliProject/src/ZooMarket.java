import java.util.Scanner;

public class ZooMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dog_food = scanner.nextInt();
        int cat_food = scanner.nextInt();

        double cost_dog_food = dog_food * 2.50;
        double cost_cat_food = cat_food * 4;

        double total_cost = cost_dog_food + cost_cat_food;

        System.out.println("Total sum is: " + total_cost + "lv.");

    }
}
