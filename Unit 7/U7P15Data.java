import java.util.Random;

public class U7P15Data {

    public void getDataAndRun()
    {
        int[][] heights = new int[10][10];
        Random random = new Random();
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                heights[i][j] = random.nextInt(11);
            }
        }
        U7P15 U7 = new U7P15(heights);
        U7.initialMap();
        U7.floodMap();
    }
    public void spin()
    {
        int num = (int)(((Math.random()  *4) + 1));
        System.out.println(num);
    }
}
