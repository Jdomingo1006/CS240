/*
 * James Domingo
 * CS240
 * Assignment 2
 * May 9th 2018
 */
/**
   An interface for the ADT stack.
   @author Frank M. Carrano
   @author Timothy M. Henry
   @version 4.0
*/
public interface StackInterface<T>
{
   //Adds new entry
   public void push(T newEntry);

   //Removes the top item
   public T pop();

   //Peeks 1st item
   public T peek();
   
   //Peeks 2nd item
   public T peek2();

   //Checks if stack is empty
   public boolean isEmpty();
   
   //Returns number of items in stack
   public int getCurrentSize();

   //Clears the stack
   public void clear();
} // end StackInterface
