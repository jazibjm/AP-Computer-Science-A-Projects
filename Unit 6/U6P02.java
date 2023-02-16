import java.util.Random;
public class U6P02 {
    Random random = new Random();
    private int largestCount;
    private int count;
    private boolean inRun;
    private int[] nums;            //Starts up variables 
    private String numbers;
    private int finalValue;
    private int startingValue;
    private int amountOfDice;
    public U6P02()                             //Default constructor 
    {
        amountOfDice = 20;
        inRun = false;
        largestCount = 0;         //Sets default values 
        count = 0;
        numbers = "";
        nums = new int[amountOfDice];
        for(int i = 0; i < amountOfDice; i++)
        {
            nums[i] = random.nextInt(6) + 1;
            numbers += nums[i];
        }
    }
    public U6P02(int amtOfDice)                  //1 arg constructor
    {
        amountOfDice = amtOfDice;
        inRun = false;
        largestCount = 0;            //Sets values including amount of dice 
        count = 0;
        numbers = "";
        nums = new int[amountOfDice];
        for(int i = 0; i < amountOfDice; i++)
        {
            nums[i] = random.nextInt(6) + 1;
            numbers += nums[i];
        }
    }
    public void longestRun()
    {
        for(int i = 0; i < amountOfDice - 1; i++)
        {
            if(nums[i] == nums[i + 1])              //If the current number equals the next number rolled 
            {
                count++;                           //Add count
                if(count > largestCount)           //If count reaches the point where its more than largest count 
                {
                    largestCount = count;
                    inRun = true;                //Starts a new run 
                }
            }
            else                          //If the number does not equal the next number  rolled 
            {
                count = 0;                  //Stops and resets count 
                if(inRun)                                //If still in a run, set to false and set the  final value
                {
                    inRun = false;
                    finalValue = i;
                }
            }
        }
        startingValue = finalValue - largestCount;   //Get the starting value 
        if(largestCount == 0)                        //If there were no streaks 
        {
            System.out.println(numbers);           //Prints numbers 
        }
        else                                         //If there were streaks 
        {
            if(largestCount == nums.length - 1)                                                                                                         //Rare occurence of the whole array being the same numbers
            {
                System.out.println("(" + numbers + ")");
            }
            else
            {
                System.out.println(numbers.substring(0, startingValue) + "(" + numbers.substring(startingValue, finalValue + 1) + ")" + numbers.substring(finalValue + 1, amountOfDice));  //Prints numbers and longest streak.  
            }
        }
       
    }
    
}
