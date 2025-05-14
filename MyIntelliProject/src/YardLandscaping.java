import java.util.Scanner;

public class YardLandscaping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double yard_sqr = scanner.nextDouble();

        double normal_price = yard_sqr * 7.61;
        double discount = normal_price * 18 / 100;
        double final_price = normal_price - discount;

        System.out.println("The final price is: " + final_price + " lv.");
        System.out.println("The discount is: " + discount + " lv.");

    }
}
