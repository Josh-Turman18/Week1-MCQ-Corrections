
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
        System.out.println("\n\nQuestion4: \nMethod 1:");
        
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
        System.out.println("\n\nMethod 2:");
        
        int x = 8, y = 6;
        
        // This if-else statement will first check to see if y is larger
        // than x. If y is larger that x, it will subtract x from y and
        // output the result to the screen. If y is not larger than x, it
        // will subtract y from x and output the result to the screen.
        // Therefore, like the first method, this method simply prints out
        // the difference of x and y, so the correct answer is A
        if (x < y)
        {
            System.out.print(y - x);
        }
        else
        {
            System.out.print(x - y);
        }
        
        System.out.print("\n");
    }
}
