// This is the class from unit 5B question 8 but with the error fixed
// so the class works as intended

public class Student2
{
    private String firstName;
    private String lastName;
    private int age;

    public Student(String ufirstName, String ulastName, int uage)
    {
        firstName = ufirstName;  // Since the instance variables and the local variables
        lastName = ulastName;  // now have different identifiers, the code will work as intended
        age = uage;  
    }

    public String toString()
    {
        return firstName + " " + lastName;
    }
}
