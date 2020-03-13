
/**
 * Runs each of the questions
 *
 * @ Josh Turman
 * @ 1.0
 */
public class start_unit1
{
    /**
     * Constructor for objects of class Start
     */
    public start_unit1()
    {
        
    }
    
    public static void main(String [] args)
    {
        begin();
    }

    public void begin()
    {
       System.out.println("Unit 1 Corrections: ");
        
       Question3 question3_solution = new Question3();
       Question5 question5_solution = new Question5();
       Question6 question6_solution = new Question6();
       
       question3_solution.go();
       question5_solution.go();
       question6_solution.original();
       question6_solution.corrected();
    }    
}
