package M3_Activity3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class M3_Activity3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int option;
		String search;
		int price;
		String minProduct = null;
		
		Map<String, Integer> productsMap = new HashMap<>();
		productsMap.put("laptop", 2000);
		productsMap.put("mouse", 79);
		productsMap.put("keyboard", 149);
		productsMap.put("monitor", 599);
		productsMap.put("printer", 499);

		System.out.println("All Products");
		for (Map.Entry<String, Integer> entry : productsMap.entrySet()) {
			System.out.println(entry.getKey() + " - $" + entry.getValue());
		}
		
		do {
			System.out.println();
			System.out.println("1. Search a product ");
			System.out.println("2. Add a product ");
			System.out.println("3. Print all product and count");
			System.out.println("4. Print cheapest product");
			System.out.println("5. exit");
			System.out.print("Select Option: ");
			option = input.nextInt();
	
			switch(option) {
			case 1:
				System.out.print("Enter Product name to search : ");
				search = input.next();
				if (productsMap.containsKey(search)) {
					price = productsMap.get(search);
					System.out.println("Product found: " + search + " - $" + price);
				} else {
					System.out.println("Product not found");
				}
				break;
			case 2:
				System.out.print("Enter Product name to add : ");
				String add = input.next();
				System.out.print("Enter Product price to add : ");
				int addprice = input.nextInt();
				System.out.println("Product Added: " + add);
				productsMap.put(add, addprice);
				break;
			case 3:
				System.out.println();
				System.out.println("All Products");
				for (Map.Entry<String, Integer> entry : productsMap.entrySet()) {
					System.out.println(entry.getKey() + ": $" + entry.getValue());
				}
				System.out.println("Number of Products: "+ productsMap.size());
				break;
			case 4: 
				int minPrice = Integer.MAX_VALUE;
				for (Map.Entry<String, Integer> entry : productsMap.entrySet()) {
					if (entry.getValue() < minPrice) {
						minProduct = entry.getKey();
						minPrice = entry.getValue();
						System.out.println("Cheapest Product: " + minProduct + " - $" + minPrice);
					}
				}
				break;
			case 5:
				System.out.print("Exiting");
			}
		} while(option < 5);
	}

}
