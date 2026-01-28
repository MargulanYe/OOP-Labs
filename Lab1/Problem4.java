import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a, b, c:");
        
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double D = b * b - 4 * a * c;

        if (D < 0) {
            System.out.println("Error: Discriminant is negative");
        } else {
            double sqrtD = Math.sqrt(D);

            double x1 = (-b + sqrtD) / (2 * a);
            double x2 = (-b - sqrtD) / (2 * a);

            System.out.println("Root 1: " + x1);
            System.out.println("Root 2: " + x2);
        }
    }
}
