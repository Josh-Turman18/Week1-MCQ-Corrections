
/**
 * Executes Unit 3 Question 4 and explains the solution
 *
 * @Josh Turman
 * @1.0
 */
public class U3_Question4
{
    
    public U3_Question4()
    {
        
    }

    public void go_option1()
    {
        System.out.println("\n\nQuestion4: ");
        
        int x = 8 , y = 6;
        
        // This method will output the difference of the ints x and y.
        // It checks to see which of the ints is larger, and the subtracts
        // the smaller one from the larger one.
        // If the ints are the same, it will just print out 0.
        int result = 0;
        if (x > y)
        {
            result = x - y;
            System.out.print(result);
        }
        else if (x < y)
        {
            result = y - x;
            System.out.print(result);
        }
        else
        {
            System.out.print(result);
        }
    }
    
    public void go_option2()
    {
        
    }
}