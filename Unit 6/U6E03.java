import java.util.Scanner;

public class U6E03 {
    private int[] numbers;
    Scanner sc = new Scanner(System.in);
    public U6E03()                             //Default constructor 
    {
        numbers = new int[0];
    }
    public U6E03(int[] array)         //1 arg constuctor 
    {
        numbers = array;
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.println("What is the value for array position #" + i + "(" + (i+1) + ")");
            numbers[i] = sc.nextInt();                                                                          //asks for each pos
        }
    }
    public void sumWithoutSmallestValue()
    {
        int sum = 0;
        int smallest = numbers[0];
        for(int i = 0; i < numbers.length; i++)                          //Finds the sum without the smallest value 
        {
            if(smallest > numbers[i])
            {
                smallest = numbers[i];
            }
            sum += numbers[i];
        }
        sum -= smallest;
        System.out.println("The sum without the smallest is " + sum);            //Prints the sum without the smallest value 
    }
}
