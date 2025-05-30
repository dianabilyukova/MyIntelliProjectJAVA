import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double sales = scanner.nextDouble();
        double commission = 0.0;
        boolean isValid = true;

        if (sales < 0) {
            isValid = false;
        } else if (city.equals("Sofia")) {
            if (sales <= 500) {
                commission = sales * 0.05;
            } else if (sales <= 1000) {
                commission = sales * 0.07;
            } else if (sales <= 10000) {
                commission = sales * 0.08;
            } else {
                commission = sales * 0.12;
            }
        } else if (city.equals("Varna")) {
            if (sales <= 500) {
                commission = sales * 0.045;
            } else if (sales <= 1000) {
                commission = sales * 0.075;
            } else if (sales <= 10000) {
                commission = sales * 0.10;
            } else {
                commission = sales * 0.13;
            }
        } else if (city.equals("Plovdiv")) {
            if (sales <= 500) {
                commission = sales * 0.055;
            } else if (sales <= 1000) {
                commission = sales * 0.08;
            } else if (sales <= 10000) {
                commission = sales * 0.12;
            } else {
                commission = sales * 0.145;
            }
        } else {
            isValid = false;
        }

        if (isValid) {
            System.out.printf("%.2f%n", commission);
        } else {
            System.out.println("error");
        }
    }
}



