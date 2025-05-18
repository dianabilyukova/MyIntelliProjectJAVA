import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double AnnualFee = scanner.nextDouble();

        double sneakers = AnnualFee * 0.60;
        double suit = sneakers * 0.80;
        double ball = suit / 4;
        double accessories = ball / 5;

        double totalPrice = AnnualFee + sneakers + suit + ball + accessories;

        System.out.println(totalPrice);

    }
}
