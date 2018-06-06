/*
 * James Domingo
 * CS240
 * Assignment 4
 * June 1 2018
 */
public final class ArrayQueue<T> implements QueueInterface<T>
{
   private T[] queue; // Circular array of queue entries and one unused location
   private int frontIndex; // Index of front entry
   private int backIndex;  // Index of back entry
   private boolean initialized = false;
   private static final int DEFAULT_CAPACITY = 3;
	private static final int MAX_CAPACITY = 10000;

   public ArrayQueue()
   {
      this(DEFAULT_CAPACITY);
   } // end default constructor

   public ArrayQueue(int initialCapacity)
   {
      checkCapacity(initialCapacity);

      @SuppressWarnings("unchecked")
      T[] tempQueue = (T[]) new Object[initialCapacity + 1];
      queue = tempQueue;
      frontIndex = 0;
      backIndex = initialCapacity - 1;
      initialized = true;
   } // end constructor

	public void enqueue(T newEntry)
	{
		checkInitialization();
      ensureCapacity();
      backIndex = (backIndex + 1) % queue.length;
      queue[backIndex] = newEntry;
	} // end enqueue

	public T getFront()
	{
		checkInitialization();
		if (isEmpty())
			throw new EmptyQueueException();
		else
         return queue[frontIndex];
	} // end getFront

	public T dequeue()
	{
		checkInitialization();
		if (isEmpty())
			throw new EmptyQueueException();
		else
      {
         T front = queue[frontIndex];
         queue[frontIndex] = null;
         frontIndex = (frontIndex + 1) % queue.length; // Index of new front of queue
         return front;
      } // end if
	} // end dequeue

	public boolean isEmpty()
	{
	  return frontIndex == ((backIndex + 1) % queue.length);
	} // end isEmpty

	// Question 3, Chapter 11
	public void clear()
	{
		checkInitialization();
		if (!isEmpty())
		{ // deallocates only the used portion
			for (int index = frontIndex; index != backIndex; index = (index + 1) % queue.length)
			{
				queue[index] = null;
			} // end for

			queue[backIndex] = null;
		} // end if

		frontIndex = 0;
		backIndex = queue.length - 1;
	}
   private void checkInitialization()
   {
      if (!initialized)
         throw new SecurityException ("ArrayQueue object is not initialized properly.");
   } 
   
   private void checkCapacity(int capacity)
   {
      if (capacity > MAX_CAPACITY)
         throw new IllegalStateException("Attempt to create a queue " +
                                         "whose capacity exceeds " +
                                         "allowed maximum.");
   } 
   
   private void ensureCapacity()
   {
      if (frontIndex == ((backIndex + 2) % queue.length)) // If array is full,
      {                                                   // double size of array
         T[] oldQueue = queue;
         int oldSize = oldQueue.length;
         int newSize = 2 * oldSize;
         checkCapacity(newSize - 1); 

         @SuppressWarnings("unchecked")
         T[] tempQueue = (T[]) new Object[newSize];
         queue = tempQueue;

         // Number of queue entries = oldSize - 1; index of last entry = oldSize - 2
         for (int index = 0; index < oldSize - 1; index++)
         {
            queue[index] = oldQueue[frontIndex];
            frontIndex = (frontIndex + 1) % oldSize;
        } // end for

         frontIndex = 0;
         backIndex = oldSize - 2;
     } // end if
   } // end ensureCapacity

@Override
public void display() {
	// TODO Auto-generated method stub
	
}

@Override
public void splice(QueueInterface<String> queue2) {
	// TODO Auto-generated method stub
	
}
}  // end ArrayQueue
