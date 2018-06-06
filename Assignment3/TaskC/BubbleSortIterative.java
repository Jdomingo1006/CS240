/*
 * James Domingo
 * CS240
 * Assignment 3
 * May 18th 2018
 */

public class BubbleSortIterative{
	
	//First method of bubbleSorting
	public static <T extends Comparable<? super T>> void bubbleSorting(T[] a, int n){
		System.out.println("\nStep by step sorting: ");
		for (int index = 0; index < n ; index++)
		{
			bubbleSorting2(a, 0, n);
			//For loop shows each step of the sorting
            for(int i = 0; i < n + 1; i++) {
            	System.out.print(a[i]+ "  ");
            }
            System.out.print("\n");
        }
        System.out.println();
	}
	//Second method of bubbleSorting
	public static <T extends Comparable<? super T>> void bubbleSorting2(T[] a, int first, int last)
	{
		T sort = a[first];
		for (int index = first + 1; index <= last; index++)
		{
			if (a[index].compareTo(sort) < 0)
			{
				swap(a, index, index-1);
				sort = a[index-1];
			}
                sort = a[index];
        }
	} 
	//Swap method
	private static void swap(Object[] a, int i, int j)
        {
            Object temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
}