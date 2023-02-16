public class Daily extends Appointment{
    public Daily(int day, int month, int year, String description)   //4 arg constructor and only uses description 
    {
        super(day, month, year, description);
    }
    public boolean occursOn()        //returns true because its daily 
    {
        return true;
    }
    public String typeOfAppointment()     //returns the type of appointnmetn 
    {
        return "Daily";
    }
}
