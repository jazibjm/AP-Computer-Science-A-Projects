import java.util.Random;
public class U6E01 {
    private int maxRanNum;                               //Instance var 
    Random random = new Random();
    private int[] randomNumbers;

    public U6E01()                              //Default constructor 
    {
        randomNumbers = new int[9];
        maxRanNum = 10000;
        randomNumbers = new int[]{random.nextInt(maxRanNum), random.nextInt(maxRanNum), random.nextInt(maxRanNum), random.nextInt(maxRanNum), random.nextInt(maxRanNum), random.nextInt(maxRanNum),random.nextInt(maxRanNum), random.nextInt(maxRanNum), random.nextInt(maxRanNum), random.nextInt(maxRanNum)};

    }
    public U6E01(int maxRandomNumber)               //1 arg constructor 
    {
        randomNumbers = new int[9];
        maxRanNum = maxRandomNumber;
        randomNumbers = new int[]{random.nextInt(maxRanNum), random.nextInt(maxRanNum), random.nextInt(maxRanNum), random.nextInt(maxRanNum), random.nextInt(maxRanNum), random.nextInt(maxRanNum),random.nextInt(maxRanNum), random.nextInt(maxRanNum), random.nextInt(maxRanNum), random.nextInt(maxRanNum)};
    }
    public void printArray()                 //prints the new array 
    {
        System.out.println("The array:");
        System.out.println("Index #0(1) " + (randomNumbers[0]) + " Index #1(2) " +(randomNumbers[1]) + " Index #2(3) " +(randomNumbers[2]) + " Index #3(4) " +(randomNumbers[3]) + " Index #4(5) " +(randomNumbers[4]) + "Index #5(6) " + (randomNumbers[5]) + " Index #6(7) " +(randomNumbers[6]) + " Index #7(8) " +(randomNumbers[7]) + " Index #8(9) " +(randomNumbers[8]) + " Index #9(10) " +(randomNumbers[9]));

    }
    public void evenIndex()                  //prints the even indexes 
    {
        System.out.println("\nEven indexes:");
        System.out.println("Index #1(2) " + (randomNumbers[1]) + " Index #3(4) " +(randomNumbers[3]) + " Index #5(6) " +(randomNumbers[5]) + " Index #7(8) " +(randomNumbers[7]) + " Index #9(10) " +(randomNumbers[9]));
    }
    public void evenElement()                                    //Prints all the even elements 
    {
        System.out.println("\nEven elements: ");
        for(int i = 0; i <= 9; i++)
        {
            if(randomNumbers[i] % 2 == 0)
            {
                System.out.print("Index #" + (i) + "(" + (i+1) + ") " + randomNumbers[i] + " | ");
            }
        }
    }
    public void printElementsReverse()
    {                                                                                                   //Prints the elements  in reverse 
        System.out.print("\n\nThe elements in reverse are:\n");
        for(int i = 9; i >= 0; i--)
        {
            System.out.print("Index #" + (i) + "(" + (i+1) + ") " + randomNumbers[i] + " | ");
        }
    }
    public void printFirstAndLast()
    {
        System.out.println("\n\nThe first and last elements are:");                                                                     //Prints the first and last numbers 
        System.out.println("Index #0(1) " + randomNumbers[0] + " | " + "Index #9(10) " + randomNumbers[9] + " | ");
    }
}
