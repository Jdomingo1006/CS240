/*
 * James Domingo
 * Assignment 2
 * CS240
 * May 9th 2018	
 */


public class TaskDDemo {
	public static void main(String [] args) {
		
		//Linked Stack
		StackInterface<String> LinkStack = new LinkedStack<String>();
		LinkStack.push("Michael");
		LinkStack.push("Scott");
		LinkStack.push("Paper");
		LinkStack.push("Company");

		System.out.println("The first item of the link stack is: "+LinkStack.peek()); //Top of linked stack
		System.out.println("The items in the stack are: "); //prints out items in stack
		LinkStack.display(); //shows the LinkedStack display method
		
		//Array stack
		StackInterface<String> ArrayStack = new ArrayStack<String>();
		ArrayStack.push("Dunder");
		ArrayStack.push("Mifflin");
		ArrayStack.push("Paper");
		ArrayStack.push("Company");
		
		System.out.println("\n\nThe first item of the array stack is: "+ArrayStack.peek()); //Top of array stack
		System.out.println("The items in the Array stack are: "); //prints out items in stack
		ArrayStack.display(); //shows the ArrayStack display method
	}
}