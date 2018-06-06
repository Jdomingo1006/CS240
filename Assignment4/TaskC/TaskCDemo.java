/*
 * James Domingo
 * CS240
 * Assignment 4
 * June 1 2018
 */
public class TaskCDemo {
	public static void main(String[] args) {
		//Creating queue1 
		QueueInterface<String> queue1 = new ArrayQueue<>();
		queue1.enqueue("Michael");
		queue1.enqueue("Scott");
		
		//Showing first item
		System.out.println("First item in queue: "+queue1.getFront());
		
	}

}
