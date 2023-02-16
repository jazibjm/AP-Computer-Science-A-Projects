import java.util.Random;

public class U7P15 {
    Random random = new Random();
    int floodLevel;
    int[][]heights;
    public U7P15()
    {
        floodLevel = 0;
        heights = new int[0][0];
    }
    public U7P15(int[][]map)
    {
        floodLevel = 0;
        heights = map;
    }
    public void initialMap()
    {
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                System.out.print(heights[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void floodMap()
    {
        floodLevel = random.nextInt(11);
        
        System.out.println("The flood level is " + floodLevel);
        System.out.println();
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                if(heights[i][j] <= floodLevel)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
