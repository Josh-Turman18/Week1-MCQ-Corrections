/**
 * Executes the commonly missed questions in Unit 5B and explains the solutions
 *
 * @Josh Turman
 * @1.0
 */
public class start_unit5B
{
    
    public start_unit5B()
    {
        
    }

    public void begin()
    {
        System.out.println("\nUnit 5B corrections: ");
        
        U5B_Question4 start_question4 = new U5B_Question4();
        U5B_Question5 start_question5 = new U5B_Question5();
        U5B_Question6 start_question6 = new U5B_Question6();
        U5B_Question8 start_question8 = new U5B_Question8();
        U5B_Question12 start_question12 = new U5B_Question12();
        
        start_question4.go();
        start_question5.go();
        start_question6.go();
        start_question8.go();
        start_question12.go();
    }
}
