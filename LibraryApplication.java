package M2_GroupProject;

/*
 * 1. Upon application start, ask user to create one User
 * 2. Create one Library object
 * 3. Initialize 5 Book objects and add it to all Library slots
 * 4. Display options:
 * 
 * - [1] Display All Books
 * - [2] Display Available Books
 * - [3] Display All Borrowed Books
 * - [4] Borrow Book
 * - [5] Return Book
 * - [6] Exit
 * 
 * - user selects the number of the option
 * ===============================================
 * 
 *	 [1] Display All Books
 * - Display all Books (ID, Title and Author) regardless if there is a Loan existing for that Book.
 *   
 *   [2] Display Available Books
 * - Display Books that do not have a Loan slot
 * 
 *   [3] Display All Borrowed Books 
 * - Display Books that have a Loan equivalent.
 * - Display the Book title and the User name of borrower
 *   
 *	 [4] Borrow Book
 * - Displays all available books and User selects what book to borrow
 * - Create a Loan object, set Loan id set Book and set User to current user
 * 
 * 	 [5] Return Book
 * - Display all Loans, user selects the Loan and removes that from the slot
 * 
 *   [6] Exit
 * - Stops the program  
 * */
import java.util.*;

public class LibraryApplication {
	//private User user;
	//private Library library;
	
	// Main Application Logic, call this in your Main.java
	public void start() {
		String userName;
		int option;
		Scanner input = new Scanner(System.in);
		
		// initial user creation
		User user = new User();
		
		System.out.print("Enter Username: ");
		userName = input.nextLine();
		user.setUserName(userName);
		
		//System.out.println("Username: " + userName);
		//this.user = new User();
		
		
		do {	
			// initial library creation
			//this.library = new Library();
			System.out.println("<----------------------------->");
			System.out.println("[1] Display All Books");
			System.out.println("[2] Display Available Books");
			System.out.println("[3] Display All Borrowed Books");
			System.out.println("[4] Borrow Book");
			System.out.println("[5] Return Book");
			System.out.println("[6] Exit");
			System.out.println("<----------------------------->");
			
			System.out.print("Enter: ");
			option = input.nextInt();
			
			switch(option) {
			case 1:
				System.out.println("[1] Display All Books");
				//display books
				//return option
				break;
			case 2:
				System.out.println("[2] Display Available Books");
				//display available books
				//return option
				break;
			case 3:
				System.out.println("[3] Display All Borrowed Books");
				//display borrowed books
				//return option
				break;
			case 4:
				System.out.println("[4] Borrow Book");
				//borrow a book
				//return option
				break;
			case 5:
				System.out.println("[5] Return Book");
				break;
			default:
				System.out.println("Invalid option");
		}
		} while(option < 5);

		
	}
	}

	// add code here
	


