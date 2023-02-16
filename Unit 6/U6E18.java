import java.util.Scanner;

public class U6E18 {
    private int[] numbers;
    Scanner sc = new Scanner(System.in);            //Scanner 
    public U6E18()                     //Default constructor 
    {
        numbers = new int[0];
    }
    public U6E18(int[] array)                      //1 arg constructor 
    {
        numbers = array;
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.println("What is the value for array position #" + i + "(" + (i+1) + ")");                  //Prompts user for value for each array position 
            numbers[i] = sc.nextInt();
        }
    }
    public void barChart()
    {
        for(int i = 0; i < numbers.length; i++)                          //Checks through the whole array 
        {
            for(int j = 0; j < numbers[i]; j++)              //Prints the astericks 
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}