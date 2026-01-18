package M4_Activity6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccount {

	public static final Logger logger = LoggerFactory.getLogger(BankAccount.class);
	
	private double balance= 10000;
	
	public void deposit(double amount) throws InvalidAmountException{
		logger.info("Deposite Requested:  P{}", amount);
		if (amount <= 0 ) {
			logger.error("Invalid Deposit Amount: P{}", amount);
			throw new InvalidAmountException("Deposit amount must be positive");
		}
		if (amount > 50000) {
			logger.warn("Large Deposit Amount: P{}", amount);
		}
		balance += amount;
		logger.info("Deposit Completed: P{}, New Balance: P{}", amount, balance);
	}
	
	public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException{
		logger.info("Withdrawal Requested:  P{}", amount);
		if (amount <= 0 ) {
			logger.error("Invalid Withdraw Amount: P{}", amount);
            throw new InvalidAmountException("Withdrawal amount must be positive");
		}
		if (amount > balance) {
			logger.warn("Insufficient Funds");
			throw new InsufficientFundsException("Insufficient funds for withdrawal", balance, amount);
		}
		balance -= amount;
		logger.info("Withdrawal Completed: P{}, New Balance: P{}", amount, balance);	
	}
	
	public static void runTest(BankTestOperation operation, String operationName){
		try {
			operation.execute();
		}
		catch(InvalidAmountException e) {
			logger.error("InvalidAmountException during: {}, {}", operationName, e.getMessage(), e);
		}
		catch(InsufficientFundsException e) {
			logger.error("InsufficientFundsException during: {}, {}", operationName, e.getMessage(), e);
		}
			//logger.error("Operation Finished: {}", operationName);
	}


}
