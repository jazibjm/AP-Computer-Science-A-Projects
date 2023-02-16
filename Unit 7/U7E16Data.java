import java.util.Scanner;
public class U7E16Data {
    private int row;
    private int column;
    private Scanner sc = new Scanner(System.in);
    private double neighborsAverage;
    private int rows;
    private int columns;
    private int sv;
    private double n;
    public U7E16Data()
    {
        row = 0;
        column = 0;
        neighborsAverage = 0;
        rows = 0;
        columns = 0;
        sv = 0;
        n = 0;
    }
    public void getData()
    {
       System.out.println("How many rows?");
       rows = sc.nextInt();
       System.out.println("How many columns?");
       columns = sc.nextInt();
       U7E16 U7 = new U7E16(rows, columns);
       for(int i = 0; i < rows; i++)
       {
            for(int j = 0; j < columns; j++)
            {
                System.out.println("For row " + (i+1) + " and column " + (j+1) + " what would you like the double value to be?");
                n = sc.nextInt();
                U7.set(i, j, n);
            }
       }
       U7.printArray();
       System.out.println();
       sv = -1;
       while(sv != 0)                     //Sentinel value while loop 
       { 
           System.out.println("What is the row you would like to find the neighboring average of?");
           row = sc.nextInt() - 1;
           System.out.println("What is the column you would like to find the neighboring average of?");
           column = sc.nextInt() - 1;
           neighborsAverage = U7.neighborAverage(row, column);
           System.out.println("The neighbors average is " + neighborsAverage);
           System.out.println("Would you like to find another neighbors average? 0 for no, 1 for yes");
           sv = sc.nextInt();
       }
    }
}
