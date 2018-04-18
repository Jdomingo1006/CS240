/*James Domingo
 * CS240
 * Assignment
 * April 10 2018
 */
public class TaskA{
	public static void main(String[] args) {
	
	BagInterface<String> groceryBag = new ResizableArrayBag<String>();
	groceryBag.add("soup");
	groceryBag.add("tomato");
	groceryBag.add("garlic");
	groceryBag.add("salt");
	groceryBag.add("pepper");
	groceryBag.add("soup");
	groceryBag.add("onion");
	groceryBag.add("salmon");
	groceryBag.add("soup");
	groceryBag.add("steak");
	
	//Displays soup count before removing from the bag
	System.out.println("Soup count: "+groceryBag.getFrequencyOf("soup"));
	
	//Counter for soup
	int counter = 0;
	while(groceryBag.contains("soup")) {
		groceryBag.remove("soup");
		counter++;
		}
	//Displays counter for number of soup in the bag
	System.out.println("Soup counted in the bag: "+counter);
	
	//Displays soup count after removing from the bag
	System.out.println("Soup count: "+groceryBag.getFrequencyOf("soup"));
	}	
}