import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int balance = 0;
		System.out.println("Your current balance is: " + balance);
		System.out.println("Please enter your percentage: ");
		
		Scanner scanner = new Scanner(System.in);
		
		int money = scanner.nextInt();
		balance *= money;
		
		System.out.println("You inserted " + money + "KZT! Your current balance is " + balance);
		
	}

}
