import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double change = Double.parseDouble(scanner.nextLine());
        int cents = (int)Math.round(change * (double)100.0F);
        int coins = 0;
        int[] denominations = new int[]{200, 100, 50, 20, 10, 5, 2, 1};

        for(int coin : denominations) {
            if (cents == 0) {
                break;
            }

            coins += cents / coin;
            cents %= coin;
        }

        System.out.println(coins);
    }
}