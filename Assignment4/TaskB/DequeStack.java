/*
 * James Domingo
 * CS240
 * Assignment 4
 * June 1 2018
 */

//I am not sure if this is what is asked for...
    public class DequeStack<T> implements StackInterface<T>
    {
        private DLNode firstNode; // References node at front of deque
        private DLNode lastNode;  // References node at back of deque
        
        //Setting up DequeStack
        public DequeStack()
        {
            firstNode = null;
            lastNode = null;
        } // end default constructor

        //Add item
        public void push(T newEntry) {
            addToFront(newEntry);
        }

        //Removes item
        public T pop() {
            return removeFront();
        }
        //Clears Stack
        public void clear()
        {
            firstNode = null;
            lastNode = null;
        } // end clear
        //Looks at first item
        public T peek(){
            return getFront();
        }
        //Add new item
        public void addToBack(T newEntry)
        {
            DLNode newNode = new DLNode(lastNode, newEntry, null);

            if (isEmpty())
                firstNode = newNode;
            else
                lastNode.setNextNode(newNode);

            lastNode = newNode;
        }
        //Add new item
        public void addToFront(T newEntry)
        {
            DLNode newNode = new DLNode(null, newEntry, firstNode);
            if (isEmpty())
                lastNode = newNode;
            else
                firstNode.setPreviousNode(newNode);
            firstNode = newNode;
        }
        //Gets back item
        public T getBack()
        {
            if (isEmpty())
                throw new EmptyQueueException();
            else
                return lastNode.getData();
        }
        //Gets front item
        public T getFront()
        {
            if (isEmpty())
                throw new EmptyQueueException();
            else
                return firstNode.getData();
        } 
        //Reomved the front item
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
        //Removes back item
        public T removeBack()
        {
            T back = getBack(); 
            assert (lastNode != null);
            lastNode = lastNode.getPreviousNode();

            if (lastNode == null)
                firstNode = null;
            else
                lastNode.setNextNode(null);

            return back;
        } 
        
        //Checks if its empty
        public boolean isEmpty()
        {
            return (firstNode == null) && (lastNode == null);
        } // end isEmpty
//DLNode class
private class DLNode{
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
        } 
}
