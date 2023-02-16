public class enhancedForLoop {
    private int nums[];
    private int sum;
    private int product;
    private int difference;
    public enhancedForLoop()
    {
        sum = 0;
        product = 1;
        difference = 0;
        nums = new int[0];
    }
    public enhancedForLoop(int[] numbers) 
    {
        sum = 0;
        product = 0;
        difference = 0;
        nums = numbers;
    }
    public void add()
    {
        sum = 0;
        for(int i : nums)
        {
            sum+= i;
        }
        System.out.println("Sum: " + sum);
    }
    public void difference()
    {
        difference = 0;
        for(int i : nums)
        {
            difference -= i;
        }
        System.out.println("Difference: " + difference);

    }
    public void product()
    {
        product = 1;
        for(int i : nums)
        {
            product *= i;
        }
        System.out.println("Product: " + product);
    }
    
}
