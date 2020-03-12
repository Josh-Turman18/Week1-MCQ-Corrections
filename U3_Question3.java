
/**
 * Executes Unit 3 Question 3 and explains the solution
 *
 * @Josh Turman
 * @1.0
 */
public class U3_Question3
{
    
    public U3_Question3()
    {
        
    }

    public void go()
    {
        System.out.println("\nQuestion 3 corrections: ");
        
        int temp = 30;
        String incorrect_weather, correct_weather;
        
        // This is the original if-else (the broken method)
        if (temp <= 31)
        {
            incorrect_weather = "cold";
        }
        else
        {
            incorrect_weather = "cool";
        }
        if (temp >= 51)
        {
            incorrect_weather = "moderate";
        }
        else   // The error is in this line, since 30 is not >= 51, the 
        // weather will be wrongly identified as warm
        {
            incorrect_weather = "warm";
        }
        System.out.println("The original code would print: '" + incorrect_weather + "'\nif 30 was stored into temp");
        
        // This is the fixed if-else (the way the works)
        if (temp <= 31) // This nested if-else statement will fix it since
        // temp is <= 31, the weather will be identified as "cold" and the
        // rest of the loop will not be executed
        {
            correct_weather = "cold";
        }
        else
        {
            if (temp <= 50)
            {
                correct_weather = "cool";
            }
            else
            {
                if (temp <= 70)
                {
                    correct_weather = "moderate";
                }
                else
                {
                    correct_weather = "warm";
                }
            }
        }
        System.out.println("The new code prints : '" + correct_weather + "'\nwhen 30 is stored in temp");
        
    }
}
