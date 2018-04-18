/*James Domingo
 * CS240
 * Assignment
 * April 18 2018
 */
public interface PilingInterface
{
	/** Adds a new book to the top of this pile.
		 @param newBook  An object to be added to the pile. */
	public void add(String newBook);

	/** Removes and returns this pile's top book.
		 @return  Either the book at the top of the pile or, if the
				    pile is empty before the operation, null. */
	public String remove();

	/** Retrieves this pile's top book.
		 @return  Either the book at the top of the pile or null if
				    the pile is empty. */
	public String getTopBook();

	/** Detects whether this pile is empty.
		 @return  True if the pile is empty. */
	public boolean isEmpty();

	/** Removes all books from this pile. */
	public void clear();
} // end PileInterface	