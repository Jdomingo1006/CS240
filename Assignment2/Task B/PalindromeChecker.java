/*
 * James Domingo
 * CS 240
 * Assignment 2
 * May 9th, 2018
 */
public class PalindromeChecker {
	
	public String checkPalindrome(String passedPalindrome)
	{
		//Creates a stack called userPalindrome
		StackInterface<String> userPalindrome = new ArrayStack<String>();
		
		//For loop to add each letter of the word to userPalindrome stack
		for(int i = 0;i < passedPalindrome.length(); i++)
		{
			String PDrome = ("" + passedPalindrome.charAt(i));
			userPalindrome.push(PDrome);
		}
		
		//Spacing for palindrome checker
		String checkString = "";	
		
		//For loop to add letters from userPalindrome stack to checkString
		for(int i = 0; i < passedPalindrome.length(); i++)
		{
			checkString += userPalindrome.pop();
		}
		
		//If else statement determining if the word is a palindrome or not.
		if(passedPalindrome.equalsIgnoreCase(checkString))
		{
			return "It's a palindrome!";
		}else{
			return "It's not a palindrome.";
		}
	}
}