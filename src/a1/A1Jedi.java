package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int totalItems = scan.nextInt();
		
		// store Item information
		String[] storeItemNames = new String[totalItems];
		int[] storeItemsBought = new int[totalItems];
		int[] storeCustomersBoughtItem = new int[totalItems];
		
		for (int i = 0; i < totalItems; i++) {
			String itemName = scan.next();
			storeItemNames[i] = itemName;
			double a = scan.nextDouble();
		}
		
		
		
		// customer information
		int totalCustomers = scan.nextInt();
		
		for(int i = 0; i < totalCustomers; i++) {
			String b = scan.next();
			String c = scan.next();
			int totalCustomerItems = scan.nextInt();
			for (int j = 0; j < totalCustomerItems; j++) {
				int totalItemBought = scan.nextInt();
				String itemBought = scan.next();
				for (int k = 0; k < totalItems; k++) {
					if (storeItemNames[k].matches(itemBought)) {
						
						storeItemsBought[k] += totalItemBought;
						storeCustomersBoughtItem[k] += 1;
						
							
						}
				}
				
			}
		}
		
		
				
		
		scan.close();
		
		for ( int i = 0; i < totalItems; i++) {
			if (storeCustomersBoughtItem[i] == 0) {
				System.out.println("No Customers bought " + storeItemNames[i]);
			} else {
				System.out.println(storeCustomersBoughtItem[i] + " customers bought " + storeItemsBought[i] + " " + storeItemNames[i]);
			}
		}
		
	}
}
