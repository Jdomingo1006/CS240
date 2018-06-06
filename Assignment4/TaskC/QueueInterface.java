/*
 * James Domingo
 * CS240
 * Assignment 4
 * June 1 2018
 */
//Interface used by DequeQueue
public interface QueueInterface<T>{
  public void enqueue(T newEntry);
  //Dequeue method for Queue
  public T dequeue();
  //getFront method for Queue
  public T getFront();
  //isEmpty method for Queue
  public boolean isEmpty();
  //clear method for Queue
  public void clear();
  //display method for Queue
  public void display();
  //Splice method for Queue - used for TaskA
  public void splice(QueueInterface<String> queue2); 
}
