// This is the Email class from unit 5B question 12

public class Email
{
    private String username;

    public Email(String u)
    {
        username = u;
    }

    public void printThis()
    {
          System.out.println(this);  // this is a keyword that refers to the current object, in this
          // case the current object is e. Passing e through the println statement will automatically
          // call the toString method, which returns the string "default@example.com", which then gets
          // printed to the screen, thus the answer is D
    }

    public String toString()
    {
        return username + "@example.com";
    }
}
