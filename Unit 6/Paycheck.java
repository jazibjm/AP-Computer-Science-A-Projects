public class Paycheck
{
    public double result(String name, Double salary, Double hours)
    {
        Double result = 0.0;
        if(hours<41)
        {
            Double salaryWithNoOT = salary * hours;
            System.out.println("You made $" + salaryWithNoOT + ", " + name + ".");                          //Caclculates amount of $ if they didnt work OT 
        }
        if(hours>40)
        {
            Double beforeOT = 40 * salary;
            Double afterOT = hours - 40;                                                          //Calculates amount of $ if they did work OT 
            afterOT = afterOT * 1.5 * salary;
            afterOT = afterOT + beforeOT;
            System.out.println("You made $" + afterOT  + ", " + name + ".");
        }
        return result;
    }
   
}


