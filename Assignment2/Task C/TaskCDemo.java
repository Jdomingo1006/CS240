/*
 * James Domingo
 * CS240
 * Assignment 2
 * May 9th 2018
 */

public class TaskCDemo {
	public static void main(String[] args) {
		
	StackInterface<String> stack = new LinkedStack<String>();
	
	//stack with 4 items
	stack.push("Hello");
	stack.push("Goodbye");
	stack.push("Raikou");
	stack.push("Darkrai");
	
	//Shows total of items in stack
	System.out.println("Total items in stack: "+stack.getCurrentSize());
	
	//Shows top 2 items in stack
	System.out.println("Peeking top item: "+stack.peek());
	System.out.println("Peeking 2nd top item: "+stack.peek2());
	
	//Shows the removal of top book
	System.out.println("\nRemoving top book.\n");
	stack.pop();
	
	//Shows items after removing top item
	System.out.println("Total items in stack: "+stack.getCurrentSize());
	System.out.println("Peeking top item: "+stack.peek());
	System.out.println("Peeking 2nd top item: "+stack.peek2());

	}
}
