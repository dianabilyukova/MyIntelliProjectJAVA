import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberOfChickenMenus = scanner.nextDouble();
        double numberOfFishMenus = scanner.nextDouble();
        double numberOfVegetarianMenus = scanner.nextDouble();

        double priceForChickenMenus = numberOfChickenMenus * 10.35;
        double priceForFishMenus = numberOfFishMenus * 12.40;
        double priceForVegetarianMenus = numberOfVegetarianMenus * 8.15;
        double totalPriceForMenus = priceForChickenMenus + priceForFishMenus + priceForVegetarianMenus;
        double priceForDesert = totalPriceForMenus * 20 / 100;
        double deliveryCost = 2.50;
        double totalPrice = totalPriceForMenus + priceForDesert + deliveryCost;

        System.out.println(totalPrice);

    }
}
