public class Student extends Person{
    String major;
   
    
    public Student(String name, int yob, String tempMajor)
    {

        super(name, yob);             //2 arg constructor 
        major = tempMajor;
    }
    public String toString()        //Changes to string 
    {
        returnStatement = "Name: " + name + ", Year of birth: " + yob + ", Major: " + major;  
        return returnStatement;
    }
}

