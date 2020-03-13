// This is the UnitsHandler class found in unit 5B question 6

public class UnitsHandler
{
    private static int totalUnits = 0;
    private static int containers = 0;
    private static int unitsPerContainer = 0;

    public UnitsHandler(int containerSize)  // sets the value of
    // unitsPerContainer based on the argument containerSize
    {
        unitsPerContainer = containerSize;
    }

    public static void update(int c)  // This is a static method so it can only access
    // and update static variables
    {
        containers = c;
        totalUnits = unitsPerContainer * containers;
    }
}
