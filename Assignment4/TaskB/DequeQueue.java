/*
 * James Domingo
 * CS240
 * June 1 2018
 * Assignment
 */

//I am not sure if this is what is asked for...
public class DequeQueue<T> implements QueueInterface<T>{
   private DLNode firstNode; // References node at front of deque
   private DLNode lastNode;  // References node at back of deque

	public DequeQueue()
	{
		firstNode = null;
		lastNode = null;
	} // end default constructor


    public void enqueue(T newEntry) {
        addToFront(newEntry);
    }


    public T dequeue() {
        return removeFront();
    }

    public void clear()
	{
		firstNode = null;
		lastNode = null;
	} // end clear

	public void addToBack(T newEntry)
	{
		DLNode newNode = new DLNode(lastNode, newEntry, null);

		if (isEmpty())
			firstNode = newNode;
		else
			lastNode.setNextNode(newNode);

		lastNode = newNode;
	} // end addToBack

	public void addToFront(T newEntry)
	{
      DLNode newNode = new DLNode(null, newEntry, firstNode);

      if (isEmpty())
         lastNode = newNode;
      else
         firstNode.setPreviousNode(newNode);

      firstNode = newNode;
	} // end addToFront

	public T getBack()
	{
		if (isEmpty())
			throw new EmptyQueueException();
		else
         return lastNode.getData();
	} // end getBack

	public T getFront()
	{
		if (isEmpty())
			throw new EmptyQueueException();
		else
         return firstNode.getData();
	} // end getFront

	public T removeFront()
	{
      T front = getFront();  // Might throw EmptyQueueException
	   assert (firstNode != null);
      firstNode = firstNode.getNextNode();

      if (firstNode == null)
         lastNode = null;
      else
         firstNode.setPreviousNode(null);

      return front;
	} // end removeFront

	public T removeBack()
	{
		T back = getBack();  // Might throw EmptyQueueException
	   assert (lastNode != null);
      lastNode = lastNode.getPreviousNode();

      if (lastNode == null)
         firstNode = null;
      else
         lastNode.setNextNode(null);

		return back;
	}

	public boolean isEmpty()
	{
		return (firstNode == null) && (lastNode == null);
	}

private class DLNode
	{
		private T      data;  	 // Deque entry
		private DLNode next;  	 // Link to next node
		private DLNode previous; // Link to previous node

		private DLNode(T dataPortion)
		{
			data = dataPortion;
			next = null;
			previous = null;
		} // end constructor

		private DLNode(DLNode previousNode, T dataPortion, DLNode nextNode)
		{
			data = dataPortion;
			next = nextNode;
			previous = previousNode;
		} // end constructor

		private T getData()
		{
			return data;
		} // end getData

		private void setData(T newData)
		{
			data = newData;
		} // end setData

		private DLNode getNextNode()
		{
			return next;
		} // end getNextNode

		private void setNextNode(DLNode nextNode)
		{
			next = nextNode;
		} // end setNextNode

		private DLNode getPreviousNode()
		{
			return previous;
		} // end getPreviousNode

		private void setPreviousNode(DLNode previousNode)
		{
			previous = previousNode;
		} // end setPreviousNode
	} // end DLNode
	
	
	//Display method - interface requirement
	public void display() {
		// TODO Auto-generated method stub
		
	}
	//Splice method - interface requirement
	public void splice(QueueInterface<String> queue2) {
		// TODO Auto-generated method stub
		
	}
}
