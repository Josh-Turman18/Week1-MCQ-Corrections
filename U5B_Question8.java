/**
 * Executes Unit 5B Question 8 and explains the solution
 *
 * @Josh Turman
 * @1.0
 */
public class U5B_Question8
{
    
    public U5B_Question8()
    {
        
    }

    public void go()
    {
        System.out.println("\nQuestion 8: ");
        
        // This is the original (broken) code
        System.out.println("Nothing is printed with the original code,");
        Student s = new Student("Priya", "Banerjee", -1);
        System.out.println(s);
        
        // This is one way to fix the code
        System.out.println("but when the error is fixed, this is what's printed:");
        Student2 s2 = new Student2("Priya", "Banerjee", -1);
        System.out.println(s2);
    }
}
