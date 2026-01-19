package M4_Activity9_1;

public class InvalidTransferException extends Exception {
	
    public InvalidTransferException(String message) {
        super(message);
    }
    
    public InvalidTransferException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
