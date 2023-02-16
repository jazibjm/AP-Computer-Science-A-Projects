public class Person {
    int yob;
    String name;
    String returnStatement;
    public Person(String tempName, int yearOfBirth)      //2 arg constructor 
    {
        name = tempName;
        yob = yearOfBirth;
    }
    public String toString()     //Changes to string 
    {
        returnStatement = "Name: " + name + ", Year of birth: " + yob; 
        return returnStatement;
    }
}
