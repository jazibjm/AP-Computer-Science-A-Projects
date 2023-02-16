

public class Monthly extends Appointment{              
    public Monthly(int day, int month, int year, String description)    //Makes monthly constructor 
    {
        super(day, month, year, description);
    }
    public boolean occursOn(int day, int month, int year)              //Checks if it occurs on the day 
    {
        if(day == returnDay())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public String typeOfAppointment()         //Returns the type of appointment 
    {
        return "Monthly";
    }
}
