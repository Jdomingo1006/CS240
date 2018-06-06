/*
 * James Domingo
 * CS240
 * Assignment 3
 * May 18th 2018
 */
public class TaskCDemo {
	
	//Main method of driver
	public static void main(String[] args) {
		Integer[] array = {5, 7, 4, 9, 8, 5, 6, 3};
		System.out.println("---------Bubble Sorting---------");
		System.out.println("Before Sorting:");
		display(array, array.length);
		BubbleSortIterative.bubbleSorting(array,array.length-1);
		System.out.println("After Sorting:" );
		display(array, array.length);
	}
	
	//Helper method - Displays the current array when its called
	public static void display(Object[] array, int n)
	{
		for (int index = 0; index < n; index++) {
			System.out.print(array[index]+"  ");
		}
		System.out.println();
	} 
}
