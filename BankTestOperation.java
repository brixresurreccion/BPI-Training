package M4_Activity7;

@FunctionalInterface
interface BankTestOperation {
    void execute() throws InvalidAmountException, InsufficientFundsException;
}