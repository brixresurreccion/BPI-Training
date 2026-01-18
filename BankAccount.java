package M4_Activity1;


public class BankAccount {

	public static String getAccountName(String accountNumber) {
		if(accountNumber == "ACC-001") {
			return "Juan Dela Cruz";
		} else if (accountNumber == "ACC-002") {
			return "Maria Santos";
		} else {
			return null;
		}
	}
	public static void testCase(String accountNumber) {
		System.out.println("Looking up Account: " + accountNumber);
		try {
			String name = getAccountName(accountNumber);
			String upperCaseName = name.toUpperCase();
			System.out.println("Account Holder: " + upperCaseName);
		} catch (NullPointerException e) {
			System.out.println("Error:  Account not found");
		}
	}
}
