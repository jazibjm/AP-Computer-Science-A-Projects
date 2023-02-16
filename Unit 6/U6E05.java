import java.util.Scanner;

public class U6E05 {
    private int[] numbers;
    Scanner sc = new Scanner(System.in);
    public U6E05()                       //Default constructor 
    {
        numbers = new int[0];
    }
    public U6E05(int[] array)                //1 argument constructor 
    {
        numbers = array;
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.println("What is the value for array position #" + i + "(" + (i+1) + ")");
            numbers[i] = sc.nextInt();               //Asks user for the value of each array position 
        }
    }
    public void computeAlternation()
    {
        int sumOne = 0;  
        int sumTwo = 0;
        int overallSum = 0;
        for(int i = 0; i < numbers.length; i++)
        {
            if((i+1)%2 == 0)
            {
                sumOne += numbers[i];                                 //Alternates all the numbers 
            }
            else
            {
                sumTwo += numbers[i];
            }
        }
        overallSum = sumTwo - sumOne;
        System.out.println("After computing the alternations, the result is " + overallSum);          //Prints 
    }
}