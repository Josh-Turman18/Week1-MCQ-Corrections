
/**
 * Executes Unit 3 Question 6 and explains the solution
 *
 * @Josh Turman
 * @1.0
 */
public class U3_Question6
{
    
    public U3_Question6()
    {
        
    }

    public void go()
    {
        System.out.println("\nQuestion 6:");
        
        int j = 4, k = 4, int m = 8;
        
        if (!((j == k) && (k > m)))     // This is the conditional in the question
        // This compound condtional results in a true statement
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
            
        if ((j != k) || (k <= m))   // This is the conditional of the correct answer
        // (answer A), this compound conditional also results in a true statement
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
