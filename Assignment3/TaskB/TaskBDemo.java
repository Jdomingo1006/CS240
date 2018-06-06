/*
 * James Domingo
 * CS240
 * Assignment 3
 * May 18th 2018
 */
public class TaskBDemo
{
	public static void main(String[] args)
	{
		
      Integer[] array = {5, 7, 4, 9, 8, 5, 6, 3};
      //Reverse Selection Sort
      System.out.println("---------Reverse Selection Sorting---------");
      System.out.println("Integer Array: ");
      display(array, array.length);	  
      ReverseSelectionSort.reverseSelectionSort(array, array.length);
      System.out.println("Sorted integer Array:");
      display(array, array.length);

	}

	//Display method - displays the array
	public static void display(Object[] array, int n)
	{
		for (int index = 0; index 	< n; index++) {
			System.out.print(array[index]+"  ");
		}
		System.out.println();
	}

}