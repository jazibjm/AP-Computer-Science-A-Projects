import java.util.Scanner;

public class U6E06 {
    private int[] numbers;
    Scanner sc = new Scanner(System.in);
    public U6E06()               //Default constructor 
    {
        numbers = new int[0];
    }
    public U6E06(int[] array)                                 //1 arg constructor 
    {  
        numbers = array;
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.println("What is the value for array position #" + i + "(" + (i+1) + ")");                 //Asks user  for each value 
            numbers[i] = sc.nextInt();
        }
    }
    public void reverseArray()
    {
        System.out.println("The original array is:");
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.print("Index #" + (i) + "(" + (i+1) + ") " + numbers[i] + " | ");         //Prints out the original array 
        }
        System.out.println("\n\nThe reverse array is:");
        int counter = 0;
        int[] reverse = new int[numbers.length];
        for(int i = numbers.length - 1; i >= 0; i--)                                                          //Reverses array and prints using a new array 
        {
            reverse[i] = numbers[counter];
            counter++;
        }
        for(int i = 0; i < reverse.length; i++)
        {
            System.out.print("Index #" + (i) + "(" + (i+1) + ") " + reverse[i] + " | ");                               
        }
    }   
}