public class Appointment {
    int day;
    int month;
    int year;
    String description;
    public Appointment(int dayt, int montht, int yeart, String descriptiont)
    {
        day = dayt;         //4 arg constructor and set vars
        month = montht;
        year = yeart;
        description = descriptiont;
    }
    public int returnDay()          //Returns the day 
    {
        return day;
    }
    public int returnMonth()        //returns month
    {
        return month;
    }
    public int returnYear()//returns year 
    {
        return year;
    }
    public String returnDescription()  //Returns dessc 
    {
        return description;
    }
    public boolean occursOn(int day, int month, int year)   //Occurs on 
    {
        if(year == returnYear())
        {
            if(month == returnMonth())
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
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
    public String typeOfAppointment()
    {
        return "N/A";
    }
}
