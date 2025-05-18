import java.util.Scanner;

public class Aquarium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = scanner.nextInt();
        double width = scanner.nextInt();
        double height = scanner.nextInt();
        double percentage = scanner.nextInt();

        double aquariumVolume = length * width * height;

        double spaceOccupied = aquariumVolume * percentage / 100;
        double spaceForWater = aquariumVolume - spaceOccupied;
        double inLiters = spaceForWater * 0.001;

        System.out.println(inLiters);
    }
}
