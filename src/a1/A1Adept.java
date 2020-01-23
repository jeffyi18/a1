package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int totalItems = scan.nextInt();
		
		// store Item information
		String[] storeItemNames = new String[totalItems];
		double[] storeItemPrices = new double[totalItems];
		
		for (int i = 0; i < totalItems; i++) {
			String itemName = scan.next();
			storeItemNames[i] = itemName;
			double itemPrice = scan.nextDouble();
			storeItemPrices[i] = itemPrice;
		}
		
		
		// customer information
		int totalCustomers = scan.nextInt();
		
		String[] customerNames = new String[totalCustomers];
		// int[] totalCustomerItems = new int[totalCustomers];
		double[] totalSpentByCustomer = new double[totalCustomers];
		
		
		// i = Customer index
		for (int i = 0; i < totalCustomers; i++) {
			
			customerNames[i] = scan.next() + " " + scan.next();
			int totalCustomerItems = scan.nextInt();
					
			// j = customer item index
			for (int j = 0; j < totalCustomerItems; j++) {

				int itemQuantity = scan.nextInt();
				
				String itemName = scan.next();
				
				double itemPrice = findPrice(storeItemNames, storeItemPrices, itemName);
				
				totalSpentByCustomer[i] += itemQuantity * itemPrice;
				
				
			}
		}
		
		scan.close();
		
		biggest(customerNames, totalSpentByCustomer);
		smallest(customerNames, totalSpentByCustomer);
		average(totalSpentByCustomer);
		
		
	}
	
	static double findPrice (String[] storeItemNames, double[] storeItemPrices, String itemName) {
		for( int i = 0; i < storeItemNames.length; i++) {
			if (storeItemNames[i].matches(itemName)) {
				return storeItemPrices[i]; 
			}
		}
		
		
		
		return 0;
		
	}
	
	static void biggest (String[] customerNames, double[] totalSpentByCustomer) {
		double max = 0;
		String maxName = "";
		for ( int i = 0; i < customerNames.length; i++) {
			if (max < totalSpentByCustomer[i]) {
				 max = totalSpentByCustomer[i];
				 maxName = customerNames[i];
			}
		}
		System.out.println("Biggest: " + maxName + " " + "(" + String.format("%.2f", max) + ")" );
}
	static void smallest (String[] customerNames, double[] totalSpentByCustomer) {
	double min = Integer.MAX_VALUE;
	String minName = "";
	for ( int i = 0; i < customerNames.length; i++) {
		if (min > totalSpentByCustomer[i]) {
			 min = totalSpentByCustomer[i];
			 minName = customerNames[i];
		}
	}
	System.out.println("Smallest: " + minName + " " + "(" + String.format("%.2f", min) + ")" );
}
	static void average (double[] totalSpentByCustomer) {
		double average = 0;
		for (int i = 0; i < totalSpentByCustomer.length; i++) {
			average += totalSpentByCustomer[i];
		}
	System.out.println("Average: " + String.format("%.2f", average/totalSpentByCustomer.length));	
	}
	
	

}
