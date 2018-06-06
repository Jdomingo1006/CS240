/*
 * James Domingo
 * CS240
 * June 1 2018
 */

//Interface used by DequeStack
public interface StackInterface<T>{
	//Push method for Stack
   public void push(T newEntry);
   //Pop method for Stack
   public T pop();
   //Peek method for Stack
   public T peek();
   //IsEmpty method for stack
   public boolean isEmpty();
   //Clear method for stack
   public void clear();
}
