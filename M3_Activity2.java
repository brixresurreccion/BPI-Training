package M3_Activity2;


import java.util.*;

public class M3_Activity2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int option;
		
		Set<String> products = new HashSet<>();
		products.add("laptop");
		products.add("mouse");
		products.add("keyboard");
		products.add("monitor");
		products.add("printer");

		System.out.println("All Products");
		for (String product : products) {
			System.out.println(product);
		}
		
		do {
			System.out.println();
			System.out.println("1. Search a product ");
			System.out.println("2. Add a product ");
			System.out.println("3. Print all product and count");
			System.out.println("4. exit");
			System.out.print("Select Option: ");
			option = input.nextInt();
	
			switch(option) {
			case 1:
				System.out.print("Enter Product name to search : ");
				String search = input.next();
				if (products.contains(search)) {
					System.out.println("Product found: " + search);
				} else {
					System.out.println("Product not found");
				}
				break;
			case 2:
				System.out.print("Enter Product name to add : ");
				String add = input.next();
				System.out.println("Product Added: " + add);
				products.add(add);
				break;
			case 3:
				System.out.println();
				System.out.println("All Products");
				for (String product : products) {
					System.out.println(product);
				}
				System.out.println("Number of Products: "+ products.size());
				break;
			case 4:
				System.out.print("Exiting");
			}
		} while(option < 4);

		
	}





}
