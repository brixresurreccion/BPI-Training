package M4_Activity8;

@FunctionalInterface
interface BankTestOperation {
    void execute() throws InvalidAmountException, InsufficientFundsException;
}