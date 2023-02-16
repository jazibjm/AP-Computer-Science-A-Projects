import java.util.Arrays;
import java.util.Random;
public class U6E15 {
    private int maxRanNum;
    Random random = new Random();
    private int[] randomNumbers;

    public U6E15()
    {
        maxRanNum = 10000;                //Default constructor 
        randomNumbers = new int[]{random.nextInt(maxRanNum), random.nextInt(maxRanNum), random.nextInt(maxRanNum), random.nextInt(maxRanNum), random.nextInt(maxRanNum), random.nextInt(maxRanNum),random.nextInt(maxRanNum), random.nextInt(maxRanNum), random.nextInt(maxRanNum), random.nextInt(maxRanNum), random.nextInt(maxRanNum), random.nextInt(maxRanNum), random.nextInt(maxRanNum), random.nextInt(maxRanNum), random.nextInt(maxRanNum), random.nextInt(maxRanNum),random.nextInt(maxRanNum), random.nextInt(maxRanNum), random.nextInt(maxRanNum), random.nextInt(maxRanNum)};
        System.out.println("The initial array is:");
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print("Index #" + (i) + "(" + (i + 1) + ") " + randomNumbers[i] + " | ");       //initial array printer for default constructor 
        }
    }
    public U6E15(int maxRandomNumber)           //1 arg constructor 
    {
        maxRanNum = maxRandomNumber;
        randomNumbers = new int[]{random.nextInt(maxRanNum), random.nextInt(maxRanNum), random.nextInt(maxRanNum), random.nextInt(maxRanNum), random.nextInt(maxRanNum), random.nextInt(maxRanNum),random.nextInt(maxRanNum), random.nextInt(maxRanNum), random.nextInt(maxRanNum), random.nextInt(maxRanNum), random.nextInt(maxRanNum), random.nextInt(maxRanNum), random.nextInt(maxRanNum), random.nextInt(maxRanNum), random.nextInt(maxRanNum), random.nextInt(maxRanNum),random.nextInt(maxRanNum), random.nextInt(maxRanNum), random.nextInt(maxRanNum), random.nextInt(maxRanNum)};
        System.out.println("The initial array is:");
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print("Index #" + (i) + "(" + (i + 1) + ") " + randomNumbers[i] + " | ");           //initial array printer 
        }
    }
    public void sortArrayAndPrint()
    {
        Arrays.sort(randomNumbers);                  //Sorts the array 
        System.out.println("\n\nThe new array is:");
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print("Index #" + (i) + "(" + (i + 1) + ") " + randomNumbers[i] + " | ");          //Array printer 
        }

    }
}
