
/**
 * Runs question 3 and explains the solutions
 *
 * @ Josh Turman
 * @ 1.0
 */
public class Question3
{
    

    /**
     * Constructor for objects of class Question3
     */
    public Question3()
    {
     
    }

   public void go()
   {
       System.out.println("Question 3: ");
       
       int option_I = 2 / 5 % 3;  // This saves 0 into option_I
       // since there are not parentheses, we go left to right, so 2 / 5 
       // results in 0 since it is integer division. Therefore 0 % 3 is 3
       // since 3 is the remainder of 0/3.
       
       int option_II = 2 / (5 % 3);   // This saves 1 into option_II
       // Since there are parentheses, we execute 5 % 3 first, which is 2
       // as that is the remainder of 5/3. Then we execute 2/2 which comes
       // out as 1.
       
       int option_III = 2 / 5 + 1;   // This saves 1 into option_III
       // According to the order of operations, we start with 2/5, which is 
       // 0 since we are using integer division. Then we execute 0+1, which
       // results in one
       
       System.out.println("Option I: 2 / 5 % 3 = " + option_I);
       System.out.println("Option II: 2 / (5 % 3) = " + option_II);
       System.out.println("Option III: 2 / 5 + 1 = " + option_III);
       System.out.println("Therefore both option I and option II result in an\nanswer of 1, so the correct choice is D");
   }
}
