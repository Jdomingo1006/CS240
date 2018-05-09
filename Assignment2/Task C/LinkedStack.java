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
public final class LinkedStack<T> implements StackInterface<T>
{
	private T[] stack;   
	private int topIndex;
   private boolean initialized = false;
	private static final int DEFAULT_CAPACITY = 50;
	private static final int MAX_CAPACITY = 10000;

	public LinkedStack()
	{
      this(DEFAULT_CAPACITY);
 	} // end default constructor

	public LinkedStack(int initialCapacity)
	{
      checkCapacity(initialCapacity);

      @SuppressWarnings("unchecked")
      T[] tempStack = (T[])new Object[initialCapacity];
      stack = tempStack;
		topIndex = -1;
      initialized = true;
	} 

	public void push(T newEntry)
	{
		checkInitialization();
		ensureCapacity();
		stack[topIndex + 1] = newEntry;
		topIndex++;
	}

	public T peek()
	{
		checkInitialization();
		if (isEmpty())
			throw new EmptyStackException();
		else
         return stack[topIndex];
	}

	//Implemented peek2 method.
	public T peek2() {
		//Similar to peek method.
		checkInitialization();
		//throws exception if peek2 method can't be applied
		if(isEmpty() || topIndex <= 1)
			throw new EmptyStackException();
		else
		//returns 2nd top item from the stack
		return stack[topIndex - 1];
		
	}
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

   public boolean isEmpty()
	{
		return topIndex < 0;
	} 

	public void clear()
	{
		checkInitialization();
		while (topIndex > -1)
      {
			stack[topIndex] = null;
         topIndex--;
      }
	} 

   // Throws an exception if this object is not initialized.
   private void checkInitialization()
   {
      if (!initialized)
         throw new SecurityException ("ArrayStack object is not initialized properly.");
   } 

   // Throws an exception if the client requests a capacity that is too large.
   private void checkCapacity(int capacity)
   {
      if (capacity > MAX_CAPACITY)
         throw new IllegalStateException("Attempt to create a stack " +
                                         "whose capacity exceeds " +
                                         "allowed maximum.");
   } 

   // Doubles the size of the array stack if it is full
   // Precondition: checkInitialization has been called.
	private void ensureCapacity()
	{
 	   if (topIndex >= stack.length - 1) 
      {
         int newLength = 2 * stack.length;
         checkCapacity(newLength);
         stack = Arrays.copyOf(stack, newLength);
      } 
	} 
} 
