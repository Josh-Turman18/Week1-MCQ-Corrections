
/**
 * Executes Unit 3 Question 7 and explains the solution
 *
 * @Josh Turman
 * @1.0
 */
public class U3_Question7
{
    
    public U3_Question7()
    {
        
    }

    public void go()
    {
        System.out.println("\nQuestion 7: ");
        
        String first = new String("duck");
        String second = new String("duck");
        String third = new String("goose");

        if (first == second) // This will evaluate to false becaus the ==
        // operator is not comparing what the Strings first and second store
        // but rather they are comparing the object references, which are not
        // the same (if it was first == first it would evaluate to true because
        // they are the same object reference).
        {
            System.out.print("A");
        }
        else if (second == third) // also evalutates to false for the same
        // reason as above and the content of the two strings are even the same
        {
            System.out.print("B");
        }
        else if (first.equals(second))  // This is the first conditional that
        // will evaluate to true because .equals() is a string method that will
        // compare the content of two strings. Since the Strings first and second
        // have the same content, this will evaluate to true, making the 
        // answer C
        {
            System.out.print("C");
        }
        else if (second.equals(third))
        {
            System.out.print("D");
        }
        else
        {
            System.out.print("E");
        }
    }
}