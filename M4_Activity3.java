package M4_Activity3;

import M4_Activity2.ATMSystem;

public class M4_Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
        ATMTransaction atm = new ATMTransaction();
        
		System.out.println("=== ATM Balance Inquiry System ===");
		System.out.println("");
		atm.checkBalance("100123456", 15000.00);		
		atm.checkBalance("200987654", 25000.00);
		System.out.println("---Test Case3: Invalid Account Number---");
		atm.checkBalance("ABC12345", 15000.00);
		System.out.println("---Test Case4: Empty Account Number---");
		atm.checkBalance("", 15000.00);
	}

}
