// This is the class in unit 5A question 2

public class Q2_Thing
{
    private String str;   // str is private so it can only be used by the
    // class (it is kept internal)

    public Q2_Thing(String s)  // The constructor is public so that objects
    // of the class Q2_Thing can be created outside of the class
    {
        str = s;
    }

    private void helper()  // this method is kept private so it can only
    // be used by the class itself
    {
        System.out.println(str);
    }
}
