import java.util.Scanner;

public class StudyMaterials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberOfPackagesOfPens = scanner.nextDouble();
        double numberOfPackagesOfMarkers = scanner.nextDouble();
        double litersOfWhiteboardCleaner = scanner.nextDouble();
        double percentageReduction = scanner.nextDouble();

        double priceForPackagePens = numberOfPackagesOfPens * 5.80;
        double priceForPackageMarkers = numberOfPackagesOfMarkers * 7.20;
        double priceForLiterCleaner = litersOfWhiteboardCleaner * 1.20;

        double priceForAllMaterials = priceForPackagePens + priceForPackageMarkers + priceForLiterCleaner;
        double Discount = priceForAllMaterials * percentageReduction / 100;
        double priceWithReduction = priceForAllMaterials - Discount;

        System.out.println(priceWithReduction);



    }
}
