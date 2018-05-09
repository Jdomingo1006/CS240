/*
 * James Domingo
 * CS240
 * Assignment 2
 * May 9th 2018
 */

public class TaskCDemo {
	public static void main(String[] args) {
		
	StackInterface<String> stack = new LinkedStack<String>();
	
	//stack with 3 items
	stack.push("Hello");
	stack.push("Goodbye");
	stack.push("Raikou");
	stack.push("Boop");
	
	//Prints out top 2 items
	System.out.println("Peeking top item: "+stack.peek());
	System.out.println("Peeking 2nd top item: "+stack.peek2());
	
	//Removes "Raikou" from the stack
	System.out.println("\nRemoving top item.");
	stack.pop();
	
	//Stack still contains Hello, Goodbye
	System.out.println("\nPeeking top item: "+stack.peek());
	System.out.println("Peeking 2nd top item: "+stack.peek2());
	
	//Removes "Goodbye" from the stack.
	System.out.println("\nRemoving top item.");
	stack.pop();
	
	//Prints out "Hello" and throws an exception
	System.out.println("\nPeeking top item: "+stack.peek());
	System.out.println("Peeking 2nd top item: "+stack.peek2());
	}
}
