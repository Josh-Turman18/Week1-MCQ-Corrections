/**
 * Executes Unit 5B Question 6 and explains the solution
 *
 * @Josh Turman
 * @1.0
 */
public class U5B_Question6
{
    
    public U5B_Question6()
    {
        
    }

    public void go()
    {
        System.out.println("\nQuestion 6: ");
        
        UnitsHandler large = new UnitsHandler(100);  // This creates the object large and
        // sets the variable unitsPerContainer (found in the UnitsHandler class) to 100
        UnitsHandler.update(8);  // This sets the variable containers to 8 and sets the
        // variable totalUnits to 800, thus the correct answer is E
        
        System.out.println("Nothing is printed to the screen for this problem\nit just shows a class that uses static variables and mehtods");
        
    }
}
