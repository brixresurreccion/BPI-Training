package M4_Activity5;

public class AccountValidator {
	public static void validateAccountNumber(String accountNumber) throws InvalidAccountNumberException {
		if (accountNumber == null) {
			throw new NullPointerException("Account number cannot be null");
		}
        for (char c : accountNumber.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new InvalidAccountFormatException("Account number must be only digits");
            }
        }
		if (accountNumber.length() != 10) {
			throw new InvalidAccountNumberException ("Account Number must be exactly 10 digits");
		} else {
			System.out.println("Valid Account Number: " + accountNumber);
		}
	}
}
