
/**
 * calls the methods that execute the mehtods that show the unit 2 MCQ
 *
 * @Josh Turman
 * @1.0
 */
public class start_unit2
{
    
    public start_unit2()
    {
        
    }
    
    public static void main(String [] args)
    {
        System.out.print('\u000C');
        begin();
    }

    public void begin()
    {
        System.out.println("\nUnit 2 Corrections: ");
        
        U2_Question2 question2_solution = new U2_Question2();
        U2_Question9 question9_solution = new U2_Question9();
        
        question2_solution.go();
        question9_solution.go();
    }
}
