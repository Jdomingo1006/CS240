/*
 * James Domingo
 * CS240
 * June 1 2018
 * Assignment 5
 */
public class TaskADemo {
	public static void main(String[] args) {
		QueueInterface<String> queue1 = new QueueWithSplice<>();
		queue1.enqueue("Michael");
		queue1.enqueue("Scott");
		queue1.enqueue("Paper");
		queue1.enqueue("Company");
		
		QueueInterface<String> queue2 = new QueueWithSplice<>();
		queue2.enqueue("Dunder");
		queue2.enqueue("Mifflin");
		queue2.enqueue("Paper");
		queue2.enqueue("Company");

  
        System.out.println("Before Splice\n");
        System.out.println("First Queue:");
        queue1.display();
        System.out.println("\nSecond Queue:");
        queue2.display();
        queue1.splice(queue2);
        System.out.println("\nAfter Splice");
        queue1.display();



    }
}
