/**
 * Executes Unit 5B Question 4 and explains the solution
 *
 * @Josh Turman
 * @1.0
 */
public class U5B_Question4
{
    
    public U5B_Question4()
    {
        
    }

    public void go()
    {
        System.out.println("\nQuestion 4: ");
        
        Gadget a = new Gadget();  // creates the object a with a status value of 10
        Gadget.setStatus(3);  // changes the status value of Gadget to 3
        Gadget b = new Gadget();  // creates the object b and changes the value of
        // status back to 10, thus the correct answer is C
        
        System.out.println("No code is printed out for this question\nit just creates objects that contain a static variable");
    }
}
