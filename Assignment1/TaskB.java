/*James Domingo
 * CS240
 * Assignment
 * April 10 2018
 */
public class TaskB {

	public static void main(String[] args) {
		
		int count = 0;
		BagInterface<String> vowels = new ResizableArrayBag<String>();
		BagInterface<String> letters  = new ResizableArrayBag<String>();
		
		//Adding letters to letters bag.
		letters.add("a");
		letters.add("e");
		letters.add("i");
		letters.add("k");
		letters.add("u");
		letters.add("a");
		letters.add("g");		
		letters.add("t");
		letters.add("c");
		letters.add("p");

		//Before letters bag is checking for vowels
		System.out.println("Vowel bag: " +vowels.getCurrentSize());
		System.out.println("Letters bag: "+letters.getCurrentSize());
		
		//Adds vowels to vowels bag while removing from letters bag
		while(!letters.isEmpty()) {
			String vowelLetters = letters.remove();
			if(vowelLetters.equals("a") || vowelLetters.equals("e") || vowelLetters.equals("i") || vowelLetters.equals("o") || vowelLetters.equals("u")) 
			{
				vowels.add(vowelLetters);
				count++;
			}
		}
		
		//After letters bag is checking for vowels
		System.out.println("\nVowel bag: "+vowels.getCurrentSize());
		System.out.println("Letters bag: "+letters.getCurrentSize());
		
		//Prints out all the vowels in the vowels bag
		System.out.println("\nA: "+vowels.getFrequencyOf("a"));
		System.out.println("E: "+vowels.getFrequencyOf("e"));
		System.out.println("I: "+vowels.getFrequencyOf("i"));
		System.out.println("O: "+vowels.getFrequencyOf("o"));
		System.out.println("U: "+vowels.getFrequencyOf("u"));


	}
}
