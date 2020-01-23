package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int countCustomers = scan.nextInt();
		
		for (int i = 0; i < countCustomers; i++) {
		
		String firstName = scan.next();
		
		String lastName = scan.next();
		
		int totalItems = scan.nextInt();
		
		/* System.out.println(firstName.charAt(0)+ "." + lastName + ":");
		 * 
		 */
		
		double totalCost = 0;
		
			for (int j = 0; j < totalItems; j++) {
				
				int itemQuantity = scan.nextInt();
				
				String itemName = scan.next();
				
				double itemPrice = scan.nextDouble();
				
				totalCost += itemQuantity * itemPrice;
				
			}
			
			System.out.println(firstName.charAt(0) + "." + lastName + ": " + String.format("%.2f", totalCost));
		
		}
		scan.close();
		
	}

	private static void print() {
		// TODO Auto-generated method stub
		
	}
}
