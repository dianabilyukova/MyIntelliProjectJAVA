import java.util.Scanner;

public class FlowersForNewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String kindOfFlower = scanner.nextLine();
        int numberOfFlowers = scanner.nextInt();
        double budget = scanner.nextDouble();

        double pricePerFlower = 0;
        
        switch (kindOfFlower) {
            case "Roses":
                pricePerFlower = 5.00;
                break;
            case "Dahlias":
                pricePerFlower = 3.80;
                break;
            case "Tulips":
                pricePerFlower = 2.80;
                break;
            case "Narcissus":
                pricePerFlower = 3.00;
            case "Gladiolus":
                pricePerFlower = 2.50;
                break;
        }
        
        double totalPrice = numberOfFlowers * pricePerFlower;
        
        if (kindOfFlower.equals("Roses") && numberOfFlowers > 80) {
            totalPrice = totalPrice * 0.90;
        } else if (kindOfFlower.equals("Dahlias") && numberOfFlowers > 90) {
            totalPrice = totalPrice * 0.85;            
        } else if (kindOfFlower.equals("Tulips") && numberOfFlowers >80) {
            totalPrice = totalPrice * 0.85;
        } else if (kindOfFlower.equals("Narcissus") && numberOfFlowers < 120) {
            totalPrice = totalPrice * 1.15;
        } else if (kindOfFlower.equals("Gladiolus") && numberOfFlowers < 80) {
            totalPrice = totalPrice * 1.20;
        }

        double difference = Math.abs(budget - totalPrice);

        if (budget>= totalPrice) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.%n", numberOfFlowers, kindOfFlower, difference);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.%n", difference);
        }
    }
}
