package projectdavid;

import java.util.Scanner;
import java.util.Random;

public class MyClass {

	public static void main(String[] args) throws InterruptedException {		
        
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		String choice = "yes";
		
		while (choice.equalsIgnoreCase("yes")){
			
			int dice1 = random.nextInt(6) + 1;
			int dice2 = random.nextInt(6) + 1;
			
			int sum = dice1 + dice2;
			
			System.out.println("Dice 1: " + dice1);
			Thread.sleep(1000);
			System.out.println("Dice 2: " + dice2);
			Thread.sleep(1000);
			System.out.println("Sum: " + sum);
			Thread.sleep(1000);
			
			System.out.println("Do you want to roll again? (Yes/No): ");
			choice = scanner.next();			
		}
		
		System.out.println("Ending program.");
		scanner.close();
	}
}



