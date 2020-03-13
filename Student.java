// This is the class from unit 5B question 8 (broken code)

public class Student
{
    private String firstName;
    private String lastName;
    private int age;

    public Student(String firstName, String lastName, int age)
    {
        firstName = firstName;  // These instances variables will never be initialized.
        lastName = lastName;  // Since the local variables and the instance variables have
        age = age;  // the same identifier, it will only use the local variables.
        // Thus, the code will still compile, but the instance variables will never
        // be initialized, so the answer is E.
    }

    public String toString()
    {
        return firstName + " " + lastName;
    }
}
