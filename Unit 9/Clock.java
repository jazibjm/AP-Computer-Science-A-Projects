public class Clock
{
   
   String hrs;
   String mins;
   String totalTime;            //Instance variables 
   int alarmHour;
   int alarmMin;
   
   
   public Clock() //Default constructor
   {  
      totalTime = " ";
      alarmMin = 0;
      hrs = " ";
      mins = " ";
      alarmHour = 0;
   }
   
   public String getHours()   
   {
      hrs = java.time.LocalTime.now().toString().substring(0, 2);  //extracts hour
      int timeChange = Integer.valueOf(hrs);                                   //Converts the amount of hours to a integer
      String num = String.valueOf(timeChange);                            //Converts num to string
       
      if(timeChange < 12)
      {
         hrs = num + "  AM  ";               //Adds AM
      }
      else if(timeChange == 12)
      {
         hrs = num + "  PM  ";                  //Adds PM
      }
      else
      {
         timeChange -= 12;   
         num = String.valueOf(timeChange);
         hrs = num + "  PM   ";                     //Adds PM
      }
      return hrs;  
   }
   
   public String getMinutes()
   {
      mins = java.time.LocalTime.now().toString().substring(3, 5);          //Gets minutes 
      return mins;            //Returns minutes 
   }
   
   public String getTime() 
   {
     String h = hrs.substring(0, 1);
     String m = mins;
     totalTime = h + ":" + m + " " + hrs.substring(3, 6);                   //Adds the hours and minutes in one string 
     
     int hr = Integer.valueOf(h);           //Converts to int
     int mn = Integer.valueOf(m);
     
     if(hr >= alarmHour && mn > alarmMin)                   //Detects if the alarm passed and prints alarm 
     {
         alarmHour = 0;
         alarmMin = 0;
         System.out.println("Alarm");
     }
     
     return totalTime;  
   }
   
   public void setAlarm(int hrs, int mins)         //Sets up the alarm time 
   {
      alarmHour = hrs;   
      alarmMin = mins; 
   }
}