import java.util.Calendar;                      //Imports calendar util for this assignment

public class U2P07
{
   public static void main(String [] args)
   {
     Calendar yr = Calendar.getInstance();
     Calendar yr2 = Calendar.getInstance();    
     Calendar yr3 = Calendar.getInstance();            //Creates all the instances for the calendar 
     Calendar yr4 = Calendar.getInstance();
     int currentYear = yr.get(Calendar.YEAR);              //Sets up current year 
     int nextYear = currentYear + 1;                       //Sets up year after current year   
     int nextNextYear = currentYear + 2;                  //Sets up 2 years in advance 
     int nextNextNextYear = currentYear + 3;                //Sets up 3 years in advance 
     yr.set(Calendar.MONTH, 1);
     yr.set(Calendar.YEAR, currentYear);
     yr.set(Calendar.DAY_OF_MONTH, 28+1);
     yr2.set(Calendar.MONTH, 1);
     yr2.set(Calendar.YEAR, nextYear);
     yr2.set(Calendar.DAY_OF_MONTH, 28+1);            //Sets each year to february, adds the 28th by 1, and uses the variables set in previous lines for the year 
     yr3.set(Calendar.MONTH, 1);
     yr3.set(Calendar.YEAR, nextNextYear);
     yr3.set(Calendar.DAY_OF_MONTH, 28+1);
     yr4.set(Calendar.MONTH, 1);
     yr4.set(Calendar.YEAR, nextNextNextYear);
     yr4.set(Calendar.DAY_OF_MONTH, 28+1);
     System.out.println(yr.getTime());
     System.out.println(yr2.getTime());
     System.out.println(yr3.getTime());            //Prints out day after 28th for current and next 3  years 
     System.out.println(yr4.getTime());

     

   }
}