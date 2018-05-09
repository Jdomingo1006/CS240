/*
 * James Domingo
 * CS240
 * Assignment 2
 * May 9th 2018
 */

import java.util.Scanner;
public class TaskBDemo 
{
	public static void main(String[] args)
	{
		//Scanner for user input
		Scanner userInput = new Scanner(System.in);
	
		//Create a new object for palindrome checker class
		PalindromeChecker obj = new PalindromeChecker();

		//User input
		System.out.print("Palindrome check: ");
		String palindrome = userInput.nextLine();
		
		//Bonus: Ignores white space, punctuation, etc.
		palindrome = palindrome.toLowerCase().replaceAll("\\W", "");
		
		//Adds a space before userinput word. Easier to format
		String word = ""+ palindrome;
		
		//Prints out from Palindrome Checker class.
		System.out.print("" + obj.checkPalindrome(word)+"\n");
	}
}