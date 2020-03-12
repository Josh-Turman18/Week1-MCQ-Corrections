
/**
 * Runs the whole system
 *
 * @Josh Turman
 * @1.0
 */
public class start
{
   
    public start()
    {
        
    }

    public static void main (String [] args)
    {
        System.out.print('\u000C');
        
        start_unit1 run_unit1 = new start_unit1();
        start_unit2 run_unit2 = new start_unit2();
        start_unit3 run_unit3 = new start_unit3();
        
        run_unit1.begin();
        run_unit2.begin();
        run_unit3.begin();
    }
}
