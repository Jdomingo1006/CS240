/*
 * James Domingo
 * CS240
 * Assignment 2
 * May 9th 2018
 */
import java.util.EmptyStackException;
/**
    A class of stacks whose entries are stored in an array.
    @author Frank M. Carrano
    @author Timothy M. Henry
    @version 4.0
*/
public final class LinkedStack<T> implements StackInterface<T>
{
	private Node firstNode;    
	private int numberOfEntries;

	public LinkedStack()
	{
		firstNode = null;
		numberOfEntries = 0;
	} 

	//Push method - adds entry
	public void push(T newEntry) 
	{
		Node newNode = new Node(newEntry);
		newNode.next = firstNode;
		firstNode = newNode;
		numberOfEntries++;
	}
	
	//Peek method - returns top item
	public T peek() 
	{
		if(isEmpty())
			throw new EmptyStackException();
		else
			return firstNode.data;
	}
	//Peek2 method - returns 2nd item
	public T peek2()
	{
		if(isEmpty() || numberOfEntries < 2) 
		{
			throw new EmptyStackException();
		}else {
		T item = null;
		item = firstNode.next.data;
		return item;
			}
		}
	//Pop method - Removes top item
	public T pop() 
	{
		T item = peek();
		assert(firstNode != null);
		firstNode = firstNode.next;
		numberOfEntries--;
		return item;
	}
	//isEmpty method - returns True/False if stack is empty
	public boolean isEmpty()
	{
		return numberOfEntries == 0;
	} 
	//getCurrentSize method - returns entry amount
	public int getCurrentSize()
	{
		return numberOfEntries;
	} 
	//clear method - clears entire stack
	public void clear()
	{
		firstNode = null;
		numberOfEntries = 0;
	}
	//display method - displays all items in the LinkedStack
	public void display()
	{
		Node currentNode = firstNode;
		
		while(currentNode != null) {
			String item = ""+ currentNode.data;
			System.out.println(item);
			currentNode = currentNode.next;
		}

	}
	
private class Node{
	  private T    data;
	  private Node next;
	  
		private Node(T dataPortion)
		{
			this(dataPortion, null);
		} 

		private Node(T dataPortion, Node nextNode)
		{
			data = dataPortion;
			next = nextNode;
		}
	} 
} 

