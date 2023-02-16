public class ClockTester       //Tester for worldclock and clock classes 
{
   public static void main(String [] args)
   {
   
      Clock clock = new Clock();
      WorldClock world = new WorldClock(3);          //Creates 2 objects of clock and worldclock 
      System.out.println(clock.getHours());
      System.out.println(clock.getMinutes());
      System.out.println(clock.getTime());                    //Runs all required methods 
      world.getHours();
      world.getMinutes();
      System.out.println(world.getTime());
      clock.setAlarm(11, 17);                                  //Sets alarm    
      System.out.println(clock.getTime());
      
   }
}