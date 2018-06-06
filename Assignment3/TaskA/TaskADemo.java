/*
 * James Domingo
 * CS240
 * Assignment 3
 * May 18th 2018
 */
public class TaskADemo
{
	public static void main(String[] args)
	{
      Integer[] array = {5, 7, 4, 9, 8, 5, 6, 3};
      Integer[] array2 = {5, 7, 4, 9, 8, 5, 6, 3};

      //Selection Sort
      System.out.println("---------Selection Sorting---------");
      System.out.println("Integer Array: ");
      display(array, array.length);	  
      SelectionSort.selectionSort(array, array.length);
      System.out.println("Sorted integer Array:");
      display(array, array.length);
     
      //Insertion Sort
      System.out.println("\n\n---------Insertion Sorting---------");
      System.out.println("Integer Array2: ");
      display(array2, array2.length);
      InsertionSort.insertionSort(array2, array.length);
      System.out.println("Sorted integer Array:");
      display(array2, array2.length);
     

	} // end testSort

	public static void display(Object[] array, int n)
	{
		for (int index = 0; index < n; index++) {
			System.out.print(array[index]+"  ");
		}
		System.out.println();
	} // end display	

}  // end Driver