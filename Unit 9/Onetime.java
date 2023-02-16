public class Onetime extends Appointment{
    public Onetime(int day, int month, int year, String description)          //Creates one time appointment 
    {
        super(day,month,year,description);
    } 
    public String typeOfAppointment()         //Returns the type of appointment 
    {
        return "Onetime";
    }
    
}
