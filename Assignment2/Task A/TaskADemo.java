/*
 * James Domingo
 * CS240
 * Assignment 2
 * May 4th, 2018
 */


import java.util.Arrays;

public class TaskADemo {
	public static void main(String[] args) {
		int counter = 1;
		
		//Creating two stacks
		StackInterface<String> stack = new ArrayStack<String>();
		StackInterface<String> tempStack = new ArrayStack<String>();
		
		//Adding items to first stack
		stack.push("Articuno");
		stack.push("Zapdos");
		stack.push("Moltres");
		stack.push("Raikou");
		stack.push("Pikachu");
		
		//While loop to add items from stack to tempStack
		while(!stack.isEmpty())
		{
			tempStack.push(stack.pop());
			System.out.println("Item #"+counter+": "+tempStack.peek());
			counter++;
		}
		//Corrects counter and prints the items in stack are being deleted.
		counter--;
		System.out.println("Now deleting items in stack");
		
		//While loop that pop items off of tempStack
		while(!tempStack.isEmpty())
		{
			System.out.println("Item #"+counter+ ":"+ tempStack.pop());
			counter--;
		}
		
		//Prints once stack is empty.
		System.out.println("Stack is now empty.");
	}
}