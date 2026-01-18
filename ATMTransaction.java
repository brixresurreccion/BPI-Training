package M4_Activity3;

public class ATMTransaction {
	public void checkBalance(String accountNumber, double balance) {

		
		try{
			int intAccNum = Integer.parseInt(accountNumber);
			char accountType = accountNumber.charAt(0);
			if (accountType == '1') {
				System.out.println("---Test Case1: Valid Savings Account---");
				System.out.println("Processing Balance Inquiry");
				System.out.println("Account Type: Savings");
				System.out.println("Account Number: " + intAccNum);
				System.out.printf("Current balance: ₱" + "%.2f", balance);
				System.out.println("");
				System.out.println("Balance Inquiry Successful");
			} else if (accountType == '2'){
				System.out.println("---Test Case2: Valid Checking Account---");
				System.out.println("Processing Balance Inquiry");
				System.out.println("Account Type: Checking");
				System.out.println("Account Number: " + intAccNum);
				System.out.printf("Current balance: ₱" + "%.2f", balance);
				System.out.println("");
				System.out.println("Balance Inquiry Successful");
			} else {
                System.out.println("Account Type: Unknown");
            }
		}
		catch (NumberFormatException e) {
			System.out.println("Processing Balance Inquiry");
			System.out.println("Error: Invalid account number format! Account number must be numeric");
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("Processing Balance Inquiry");
			System.out.println("Error: Account Number is empty or Invalid");
			}
		finally {
			System.out.println("==============RECEIPT==============");
			System.out.println("Transaction Date: December 08, 2025");
			System.out.println("Transaction Type: Balance Inquiry");
			System.out.println("ATM Location: Main Branch");
			System.out.println("Thank you for banking with us");
			System.out.println("===================================");
			System.out.println("");
			
		}
		

	}
}
