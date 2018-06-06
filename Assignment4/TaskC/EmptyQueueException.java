/*
 * James Domingo
 * CS240
 * Assignment 4
 * June 1 2018
 */
public class EmptyQueueException extends RuntimeException
{
   public EmptyQueueException()
   {
      this(null);
   } // end default constructor

   public EmptyQueueException(String message)
   {
      super(message);
   } // end constructor
} // end EmptyQueueException
