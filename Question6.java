
/**
 * Runs question 6 and explains the solution
 *
 * @Josh Turman
 * @1.0
 */
public class Question6
{
    
    public Question6()
    {
        
    }

    public void original()
    {
        System.out.println("\nQuestion 6: ");
        
        double fact1 = 1 / 2;  // Since 1 and 2 are both ints, it will store
        // 0 into fact1 since using int division for 1/2 results in 0
        
        double fact2 = 3 * 4;
        
        double product = fact1 * fact2;  // product stores 0 since fact1 is
        // also 0 and multiplication with a 0 results in 0
        
        System.out.println("Original code: product = " + product);
    }
    
    public void corrected()
    {
        double fact1 = (double)1 / (double)2;   // This will now store 0.5 in fact1
        // since 1 was casted to a double
        
        double fact2 = 3 * 4;
        
        double product = fact1 * fact2;  // Now product will store 6 since
        // fact1 was now 0.5 and 0.5 * 12 = 6
        
        System.out.println("Correct code: product = " + product);
        
    }
}
