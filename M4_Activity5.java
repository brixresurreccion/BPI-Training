package M4_Activity5;

public class M4_Activity5 {
    public static void testValidation(String testName, String value) {
    	System.out.println(testName);

        try {
        	AccountValidator.validateAccountNumber(value);
            System.out.println();
        }
        catch (InvalidAccountNumberException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println();
        }
        catch (InvalidAccountFormatException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println();
        }
        catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        System.out.println("--- Account Number Validation Test ---\n");
        testValidation("Test 1: Valid account (1234567890)", "1234567890");
        testValidation("Test 2: Too short (123)", "123");
        testValidation("Test 3: Contains gletters (12345ABC90)", "12345ABCD90");
        testValidation("Test 4: Contains space (1234 567890) ", "1234 567890");
        testValidation("Test 5: Null", null);
        System.out.println("--- ------------------------------ ---");
    }
}
