package M2_GroupProject;

public class Library {
	   // can contain up to 5 books
	private Book[] books;
	 
	public Library(){
		books = new Book[5];
	}
	public void setAddBook(int index, Book book) {
		this.books[index] = book;
	}
	public Book getBook(int index) {
		return this.books[index];
	}
	public Book[] getBooks() {
		return this.books;
	}
	
	public Library(int id, String title, String author) {
	}
	void displaybooks() {
		
	}
}

