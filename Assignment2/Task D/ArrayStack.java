/*
 * James Domingo
 * CS240
 * Assignment 2
 * May 9th 2018
 */
import java.util.Arrays;
import java.util.EmptyStackException;
/**
    A class of stacks whose entries are stored in an array.
    @author Frank M. Carrano
    @author Timothy M. Henry
    @version 4.0
*/
public final class ArrayStack<T> implements StackInterface<T>
{
	private T[] stack;    // Array of stack entries
	private int topIndex; // Index of top entry
   private boolean initialized = false;
	private static final int DEFAULT_CAPACITY = 50;
	private static final int MAX_CAPACITY = 10000;
	
	//ArrayStack constructor - creates a default size stack
	public ArrayStack()
	{
      this(DEFAULT_CAPACITY);
 	} 

	//ArrayStack constructor - creates new stack with user input size
	public ArrayStack(int initialCapacity)
	{
      checkCapacity(initialCapacity);

      // The cast is safe because the new array contains null entries
      @SuppressWarnings("unchecked")
      T[] tempStack = (T[])new Object[initialCapacity];
      stack = tempStack;
		topIndex = -1;
      initialized = true;
	}

	//push method - adds item to stack
	public void push(T newEntry)
	{
		checkInitialization();
		ensureCapacity();
		stack[topIndex + 1] = newEntry;
		topIndex++;
	}
	//peek method - checks top item of stack
	public T peek()
	{
		checkInitialization();
		if (isEmpty())
			throw new EmptyStackException();
		else
         return stack[topIndex];
	} 
	//peek2 method - checks 2nd item of stack
	public T peek2() {
		checkInitialization();
		if(isEmpty() || topIndex < 2)
			throw new EmptyStackException();
		else
			return stack[topIndex - 1];
	}
	//pop method - removes top item of the stack
	public T pop()
	{
		checkInitialization();
		if (isEmpty())
			throw new EmptyStackException();
		else
		{
			T top = stack[topIndex];
			stack[topIndex] = null;
			topIndex--;
         return top;
		} 
   } 
	//isEmpty method - checks if array is empty
   public boolean isEmpty()
	{
		return topIndex < 0;
	} 

   //getCurrentSize method - returns number of items in stack
   public int getCurrentSize() {
		return topIndex;
	}
   //clear method - clears all item in array stack
	public void clear()
	{
		checkInitialization();
		while (topIndex > -1)
      {
			stack[topIndex] = null;
         topIndex--;
      }
	} 
	
	//checkInitialization method - checks if array stack has been initialized
   private void checkInitialization()
   {
      if (!initialized)
         throw new SecurityException ("ArrayStack object is not initialized properly.");
   } 

   //checkCapacity method - checks user input array size is under max cap
   private void checkCapacity(int capacity)
   {
      if (capacity > MAX_CAPACITY)
         throw new IllegalStateException("Attempt to create a stack " +
                                         "whose capacity exceeds " +
                                         "allowed maximum.");
   }
   
   //ensureCapacity - doubles array size
	private void ensureCapacity()
	{
 	   if (topIndex >= stack.length - 1)
      {
         int newLength = 2 * stack.length;
         checkCapacity(newLength);
         stack = Arrays.copyOf(stack, newLength);
      } 
	}
	
	//Display method - displays all items of the array stack
	public void display() {
		int temp = topIndex;
		if(!isEmpty()) {
			while(temp > -1) {
				String item =""+ stack[temp];
				System.out.println(item);
				temp--;
			}
		}else {
			System.out.print("No items. The stack is empty.");
		}

	}
} 
