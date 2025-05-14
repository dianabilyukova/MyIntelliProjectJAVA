import java.util.Scanner;

public class ArchitectProjects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name_of_architect = scanner.nextLine();
        int number_of_projects = scanner.nextInt();

        double needed_hours = number_of_projects * 3;

        System.out.println(String.format("The architect %s will need %.2f hours to complete %d project/s.", name_of_architect, needed_hours, number_of_projects));
    }
}
