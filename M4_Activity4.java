package M4_Activity4;

public class M4_Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountValidator valid = new AccountValidator();
		try {
			valid.validateAccountNumber("1234567890");
		} catch (Exception e) {
			System.out.println("Case 1 Error: " + e.getMessage());
		}
		try {
			valid.validateAccountNumber("123");
		} catch (Exception e) {
			System.out.println("Case 2 Error: " + e.getMessage());
		}
		try {
			valid.validateAccountNumber(null);
		} catch (Exception e) {
			System.out.println("Case 3 Error: " + e.getMessage());
		}
	}

}
