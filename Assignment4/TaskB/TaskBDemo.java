/*
 * James Domingo
 * CS240
 * Assignment 4
 * June 1 2018
 */
public class TaskBDemo {
	public static void main(String[] args) {
		//DequeStack presentation
		StackInterface<String> queue1 = new DequeStack<>();
		queue1.push("Michael");
		queue1.push("Scott");
		queue1.push("Paper");
		queue1.push("Company");
		
		//DequeQueue presentation
		QueueInterface<String> queue2 = new DequeQueue<>();
		queue2.enqueue("Dunder");
		queue2.enqueue("Mifflin");
		queue2.enqueue("Paper");
		queue2.enqueue("Inc");
		
		System.out.println("-------------Deque Stack presentation-------------");
		System.out.println("Front item: "+queue1.peek());
		System.out.println("Removing front item.");
		queue1.pop();
		System.out.println("New front item: "+queue1.peek());
		System.out.println("Clearing stack.");
		queue1.clear();
		System.out.println("Front: "+queue2.getFront());
		
		System.out.println("-------------Deque Queue Presentation-------------");
		System.out.println("Front item: "+queue2.getFront());
		System.out.println("Removing item.");
		queue2.dequeue();
		System.out.println("Front item: "+queue2.getFront());
		System.out.println("Clearing Queue");
		queue2.clear();
		System.out.println("Front: "+queue2.getFront());
	}
}




