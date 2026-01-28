import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();

        System.out.print("Enter interest rate (in %): ");
        double interest = scanner.nextDouble();

        double newBalance = balance + (balance * interest / 100);

        System.out.println("New balance with interest: " + newBalance);
    }
}
