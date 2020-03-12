
/**
 * Runs Question 5 and explains the solutions
 *
 * @Josh Turman
 * @1.0
 */
public class Question5
{

    /**
     * Constructor for objects of class Question5
     */
    public Question5()
    {

    }

    public void go()
    {
        System.out.println("\nQuestion 5: ");
        double d = 0.25;
        int i = 3;
        double diff = d - i;  // this stores -2.75 into diff as .25 - 3 = -2.75
        // and since diff is a double, this number is stored into it
        
        System.out.print("Result of (int)diff - 0.5: ");
        System.out.println((int)diff - 0.5);   // as stated above, the value
        // in diff is -2.75, but since it is casted to an int, the decimals
        // are truncated, causing the value to be -2 and -2 - 0.5 is -2.5,
        // which is what gets printed to the console
        
        System.out.println("Therefore the answer is B");
    }
}
