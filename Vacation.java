import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double neededMoney = Double.parseDouble(scanner.nextLine());
        double ownedMoney = Double.parseDouble(scanner.nextLine());
        int daysCounter = 0;
        int spendingCounter = 0;

        while(ownedMoney < neededMoney && spendingCounter < 5) {
            String command = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            ++daysCounter;
            if ("save".equals(command)) {
                ownedMoney += money;
                spendingCounter = 0;
            } else if ("spend".equals(command)) {
                ownedMoney -= money;
                ++spendingCounter;
                if (ownedMoney < (double)0.0F) {
                    ownedMoney = (double)0.0F;
                }
            }
        }

        if (spendingCounter == 5) {
            System.out.println("You can't save money.");
            System.out.println(daysCounter);
        }

        if (ownedMoney >= neededMoney) {
            System.out.printf("You saved the money for %d days", daysCounter);
        }

    }
}
