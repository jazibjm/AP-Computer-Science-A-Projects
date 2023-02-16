import java.util.Scanner;
public class U4P02 {
    public static void main(String[] args)
    {
        

        Scanner sc = new Scanner(System.in);
        double value;                               //Sets up all the doubles 
        double count= 0;
        double sDev = 0;
        boolean done = false;
        DataSet2 U4 = new DataSet2();         //Data set class               
        do
        {
           System.out.println("Enter input, 0 to quit: ");
           value = sc.nextInt();                               //Inputs all the numbers 
           if (value == 0) // Zero is the sentinel value
           {
              done = true;
              
           }
           else
           {
               U4.add(value);
               count++;
               U4.getAverage(count);                                         //Calls method and recieves vars 
               sDev = U4.getStandardDeviation(count, value);


           }
        }
        while (!done);
        System.out.println("Number of values: " + count);
        System.out.println("Standard deviation: " + sDev);
        
    }
}