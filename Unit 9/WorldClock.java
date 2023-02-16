public class WorldClock extends Clock
{
  
   int timeChange;                                     //Instance variables and constructor

   public WorldClock()     //Default constructor 
   {
      timeChange = 0;
   }
   public WorldClock(int timeDifference)  //1 argument constructor 
   {
      timeChange = timeDifference;      //Sets instance variable
   }

   public String getHours()   
   {                                                                 //Gets hours and adds timeChange for different time zones
      hrs = java.time.LocalTime.now().toString().substring(0, 2);
      int change = Integer.valueOf(hrs);
      change += timeChange;             
      String value = String.valueOf(change);
      
      
      if(change < 12)
      {
         hrs = value + "  AM  ";          //Adds AM
      }
      else if(change == 12)
      {
         hrs = value + "  PM  ";            //Adds PM
      }
      else
      {
         change -= 12;                    //Subtracts the time if the time is past 12 PM
         value = String.valueOf(change);     //Changes to string 
         hrs = value + "  PM   ";           //Adds PM
      }
      return hrs;              
   }
} 