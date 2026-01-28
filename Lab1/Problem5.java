import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your initial balance: ");
        int balance = scanner.nextInt();

        System.out.println("Your current balance is: " + balance);

        System.out.println("How much money do you want to insert?");
        int money = scanner.nextInt();

        balance *= money;

        System.out.println("You inserted " + money + " KZT! Your new balance is " + balance);
    }
}
