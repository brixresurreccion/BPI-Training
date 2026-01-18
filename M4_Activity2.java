package M4_Activity2;

public class M4_Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=== ATM Withdrawal System ===");
		System.out.println("");
		ATMSystem.processWithdrawal("1", "5000");		
		ATMSystem.processWithdrawal("abc", "5000");
		ATMSystem.processWithdrawal("10", "5000");
		ATMSystem.processWithdrawal("1", "20000");
		System.out.println("");
		System.out.println("=== Program Completed Successfully ===");
	}

}
