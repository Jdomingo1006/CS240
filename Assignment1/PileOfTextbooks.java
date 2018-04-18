/*James Domingo
 * CS240
 * Assignment
 * April 18 2018
 */
import java.util.Arrays;

public class PileOfTextbooks implements PilingInterface{
	private String[] books; 
	private int numberOfBooks;
	private boolean initialized = false;
	private static final int DEFAULT_CAPACITY = 25; 
	private static final int MAX_CAPACITY = 10000;
	
	//Sets the capacity to 25
	public PileOfTextbooks() {
		this(DEFAULT_CAPACITY);
	} 

	//Sets the initial capacity
	public PileOfTextbooks(int initialCapacity){
		checkCapacity(initialCapacity);
		books = new String[initialCapacity];
		numberOfBooks = 0;
		initialized = true;
	} 
	
	//Checks if array is full
	private boolean isArrayFull() {
		return numberOfBooks >= books.length;
	}
	
	//Adds new books
	public void add(String newBook) {
		checkInitialization();
		if(isArrayFull()) {
			doubleCapacity();
		}
		books[numberOfBooks] = newBook;
		numberOfBooks++;
	}
	//Removes book
	public String remove() {
		checkInitialization();
		if(numberOfBooks == 0) {
			return null;
		}
		String result = books[numberOfBooks -1];
		books[numberOfBooks] = null;
		numberOfBooks--;
		return result;
	}
	//Clear the bag
	public void clear() {
		while(!isEmpty()) {
			remove();
		}
	}
	//Gets the top book
	public String getTopBook() {
		if(numberOfBooks == 0) {
			return null;
		}
		return books[numberOfBooks - 1];
	}
	//True = empty, False = not empty
	public boolean isEmpty() {
		return numberOfBooks == 0;
	}
	//Returns book count
	public int getCurrentSize() {
		return numberOfBooks;
	}
	//Doubles bag capacity
	private void doubleCapacity() {
		int newLength = 2*books.length;
		checkCapacity(newLength);
		books = Arrays.copyOf(books, newLength);
	}
	//Checks if bag size is over 10000
	private void checkCapacity(int capacity) {
		if(capacity > MAX_CAPACITY)
			throw new IllegalStateException("Exceeding maximum capacity for bag");
	}
	//Helps secure the code without it breaking
	private void checkInitialization() {
		if(!initialized)
			throw new SecurityException("Uninitialized object used to call an ArrayBook method");
	}
}
