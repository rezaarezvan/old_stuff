import java.io.*;
public class Person implements Serializable
{
    public String namn;
    public String betyg;

    public Person(String n)
    {
        namn = n;
    }
}
