// This is the class Gadget from question 4

public class Gadget
{
    private static int status = 0;  // since status is a static variable, its value will
    // be the same for every object
    
    public Gadget()
    {
        status = 10;
    }
    
    public static void setStatus(int s)  // since setStatus is public, it can be accessed
    // by another class without directly accessing through an object of Gadget
    {
        status = s;
    }
}
