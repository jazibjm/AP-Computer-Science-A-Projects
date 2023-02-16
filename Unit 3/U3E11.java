import java.util.Scanner;
public class U3E11 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("C (Celsius) or F (Fahrenheit)?");                                   //Prompts the user for C or F 
        String unit = sc.next();
        if(unit.equals("f")||unit.equals("F")||unit.equals("c")||unit.equals("C"))               //Looks for valid or invalid input 
        {
            System.out.println("What temperature?");                                                           //Prompts user for temp 
            Double temp = sc.nextDouble();
            System.out.println("Meters or Feet?");                                                           //Prompts user for meters or feet 
            String unit2 = sc.next();
            if(unit2.equals("Meters")||unit2.equals("meters")||unit2.equals("Feet")||unit2.equals("feet"))
            {
                System.out.println("What is your altitude?");
                Double altitude = sc.nextDouble();                                                          //Prompts user for altitude 
                if(unit.equals("f")||unit.equals("F")) 
                {
                    temp = temp - 32;
                    temp = temp * 0.5556;                                                                 //Conversion to celsius if fahrenheit 
                
                }
                if(unit2.equals("feet")||unit2.equals("Feet"))
                {
                    altitude = altitude/3.281;                                             //Conversion to meters if feet 
                }
                altitude = altitude/300;
                
                if(temp >= 100 - altitude)                                                  //Calculates if boiling, freezing, or liquid. Boiling temp depends on what your altitude is. If 300 altitude, then 1 centigrade less. 
                {
                    System.out.println("Boiling");
                }
                else if(temp <= 0)
                {
                    System.out.println("Freezing");
                }
                else
                {
                    System.out.println("Liquid");
                }
            }
            else
            {
                System.out.println("Invalid unit! Please try again!");               //Prints if invalid unit 
            }
        }
        else
        {
            System.out.println("Invalid unit! Please try again!");         //Prints if invalid unit. 
        }
        sc.close();

    }
}
