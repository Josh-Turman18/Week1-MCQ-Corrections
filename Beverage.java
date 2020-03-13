// This is the Beverage class for unit 5B question 5

public class Beverage
{
    private int numOunces;
    private static int numSold = 0;

    public Beverage(int numOz)
    {
        numOunces = numOz;
    }

    public static void sell(int n)  // since sell is a static method, it can only access and
    // update static variables (like numSold), but not instance variables (like numOunces).
    // Thus the correct answer is E.
    {
        /* implementation not shown */
    }
}
