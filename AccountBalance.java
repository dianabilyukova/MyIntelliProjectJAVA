import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = (double)0.0F;
        DecimalFormat df = new DecimalFormat("0.00");

        for(String line = scanner.nextLine(); !line.equals("NoMoreMoney"); line = scanner.nextLine()) {
            double amount = Double.parseDouble(line);
            if (amount < (double)0.0F) {
                System.out.println("Invalid operation!");
                break;
            }

            total += amount;
            PrintStream var10000 = System.out;
            String var10001 = df.format(amount);
            var10000.println("Increase: " + var10001);
        }

        PrintStream var8 = System.out;
        String var9 = df.format(total);
        var8.println("Total: " + var9);
        scanner.close();
    }
}