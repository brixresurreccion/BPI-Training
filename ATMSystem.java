package M4_Activity2;

public class ATMSystem {
	static double [] accounts = {10000, 15000, 20000};
	
	public static void processWithdrawal(String accountIndex, String amountInput) {
		try {
			int accIndex = Integer.parseInt(accountIndex);
			double pesoAmountInput = Double.parseDouble(amountInput);
			double balance = accounts[accIndex];

			if(pesoAmountInput > balance) {
				System.out.println("--- Test 4: Insufficient Funds ---");
				System.out.println("Account= " + accountIndex + ", Amount= " +  amountInput);
				System.out.printf("Current balance: ₱" + "%.2f", balance);
				System.out.println("");	
				System.out.printf("Withdrawal: ₱" + "%.2f", pesoAmountInput);
				System.out.println("");
				System.out.printf("Insufficient fund! Cannot withraw ₱" + "%.2f", pesoAmountInput);
				System.out.println("");
			}else {
				accounts[accIndex] = balance - pesoAmountInput;
				System.out.println("--- Test 1: Valid Withdrawal ---");
				System.out.println("Account= " + accountIndex + ", Amount= " +  amountInput);
				System.out.printf("Current balance: ₱" + "%.2f", balance);
				System.out.println("");
				System.out.printf("Withdrawal: ₱" + "%.2f", pesoAmountInput);
				System.out.println("");
				System.out.printf("New balance: ₱" + "%.2f", (accounts[accIndex]));
				System.out.println("");
				System.out.println("Withdrawal sucessful!");
				System.out.println("");
			}
		}
		catch (NumberFormatException e) {
			System.out.println("--- Test 2: Invalid Account Index ---");
			System.out.println("Account= " + accountIndex + ", Amount= " + amountInput);
			System.out.println("Error: Invalid input!");
			System.out.println("Please enter valid numbers.");
			System.out.println("");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("--- Test 3: Account Not Found ---");
			System.out.println("Accounts= " + accountIndex + ", Amount= " + amountInput);
			System.out.println("Error: Account not found!");
			System.out.println("Invalid account index.");
			System.out.println("");
		}
		catch (Exception e) {
			System.out.println("Transaction failed.");
			System.out.println("");
		}
			
		
	
	}
}
