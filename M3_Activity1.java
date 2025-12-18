package M3_Activity1;
import java.util.*;

public class M3_Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input  = new Scanner(System.in);
		
		List<String> product = new ArrayList<>();
		product.add("Laptop");
		product.add("Mouse");
		product.add("Keyboard");
		product.add("Monitor");
		product.add("Printer");
		
		System.out.println("All Products");
		
		for (int i = 0; i < product.size(); i++) {
			System.out.println(product.get(i));
		}
		product.remove(1);
		product.add("Webcam");
		System.out.println();
		
		System.out.println("New List");
		for (int a = 0; a < product.size(); a++) {
			System.out.println(product.get(a));
		}
		System.out.println();
		
		System.out.println("Enter Product name to search: ");
		String search = input.next();
		
		if (product.contains(search)) {
			System.out.println("Product found: " + search);
		} else {
			System.out.println("Product not found");
		}
		
		
	}

}
