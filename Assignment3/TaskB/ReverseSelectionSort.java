/*
 * James Domingo
 * CS240
 * Assignment 3
 * May 18th 2018
 */
public class ReverseSelectionSort {
    // SELECTION SORT
    /** Sorts the first n objects in an array into ascending order.
     @param a  An array of Comparable objects.
     @param n  An integer > 0. */

    public static <T extends Comparable<? super T>> void reverseSelectionSort(T[] a, int n)
    {
 	   System.out.println("\nStep by step sorting: ");
        for (int index = 0; index < n - 1; index++)
        {
            int indexOfNextGreatest = getIndexOfLargest(a, index, n - 1);

            for(int i = 0; i < n; i++) {
            	System.out.print(a[i]+ "  ");
            }
            System.out.print("\n");

            swap(a, index, indexOfNextGreatest);
            // Assertion: a[0] <= a[1] <= . . . <= a[index] <= all other a[i]
        } // end for
    } // end selectionSort

    // Finds the index of the smallest value in a portion of an array a.
    // Precondition: a.length > last >= first >= 0.
    // Returns the index of the smallest value among
    // a[first], a[first + 1], . . . , a[last].

    private static <T extends Comparable<? super T>> int getIndexOfLargest(T[] a, int first, int last)
    {
        T max = a[last];
        int indexOfMax = last;
        for (int index = last - 1; index >= first; index--)
        {
            if (a[index].compareTo(max) > 0)
            {
                max = a[index];
                indexOfMax = index;
            } // end if
            // Assertion: min is the smallest of a[first] through a[index].
        } // end for

        return indexOfMax;
    } // end getIndexOfSmallest

    private static void swap(Object[] a, int i, int j)
    {
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    } // end swap

}
