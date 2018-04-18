import java.util.Scanner;

/*James Domingo
 * CS240
 * Assignment
 * April 10 2018
 */
public class TaskCDriver {
    public static void main(String[] args){
        PileOfTextbooks booksTest = new PileOfTextbooks(10);
        
        //Adding 6 different books.
        booksTest.add("Looking for Alaska");
        booksTest.add("Physics");
        booksTest.add("Java");
        booksTest.add("An Abundance of Katherines");
        booksTest.add("Chemistry");
        booksTest.add("Night");
                
        //Demonstrates the initial top book and bag size
        System.out.println("Current size of our bag: "+booksTest.getCurrentSize());
        System.out.println("The top book is: "+booksTest.getTopBook());
        
        //Demonstrates remove method
        System.out.println("Removing the top book.");
        booksTest.remove();
        
        //Demonstrates a new book on top and new bag size
        System.out.println("The top book should now be: "+booksTest.getTopBook());
        System.out.println("Current size of our bag: "+booksTest.getCurrentSize());
        
        //Demonstrates clear method and new bag size
        System.out.println("Clearing bag.");
        booksTest.clear();
        System.out.println("Bag has been cleared. \nCurrent size of our bag: "+booksTest.getCurrentSize());
        
        //Demonstrates isEmpty method
        if(booksTest.isEmpty()) {
        	System.out.println("The bag is empty!");
        }else {
        	System.out.println("The bag is not empty.");
        }
        
        //Demonstrates different methods when bag is at 0
        System.out.println(booksTest.remove());
        System.out.println(booksTest.getCurrentSize());
        System.out.println(booksTest.getTopBook());
    }
}