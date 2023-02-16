public class Instructor extends Person{
    double salary;
    public Instructor(String name, int yob, double tempSalary)    //3 arg constructor 
    {
        super(name, yob);                     
        salary = tempSalary;
    }
    public String toString()      //Returns string 
    {
        returnStatement = "Name: " + name + ", Year of birth: " + yob + ", Salary: " + salary;        
        return returnStatement;
    }
}
