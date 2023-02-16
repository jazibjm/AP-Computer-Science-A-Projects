public class U7E16 {
    private double neighboringAverage;
    private double count;
    private double total;                  //Instance variables 
    private double rows2;
    private double columns2;
    private double[][] values;
    public U7E16()
    {
        total = 0;
        neighboringAverage = 0;
        count = 0;                            //sets vars
        rows2 = 0;
        columns2 = 0;
        values = new double[0][0];
    }
    public U7E16(int rows, int columns) {
        values = new double[rows][columns];
        neighboringAverage = 0;
        count = 0;                                //sets vars
        total = 0;
        columns2 = columns;
        rows2 = rows;
    }
    public void printArray()
    {

        System.out.println();
        System.out.println("Diagram of the array:");
        for(int i = 0; i < rows2; i++)
        {                                                     //Prints out a whole diagram of the array 
            for(int j = 0; j < columns2; j++)
            {
                System.out.print(values[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void set(int i, int j, double n) {
        values[i][j] = n;
    }
    public double neighborAverage(int row, int column)
    {
        total = 0;
        count = 0;
        neighboringAverage = 0;
        if(row > 0)                                  //Computes all the 8 tiles that are neighboring the array value to see if any match
        {
            total += values[row - 1][column];
            count++;
        }
        if(column > 0)
        {
            total += values[row][column - 1];
            count++;
        }
        if(row < rows2 - 1)
        {
            total += values[row + 1][column];
            count++;
        }
        if(column < columns2 - 1)
        {
            total += values[row][column + 1];
            count++;
        }
        if(row > 0 && column > 0)
        {
            total += values[row - 1][column - 1];
            count++;
        }
        if(row < rows2 - 1 && column > 0)
        {
            total += values[row + 1][column - 1];
            count++;
        }
        if(column < columns2 - 1 && row > 0)
        {
            total += values[row - 1][column+1];
            count++;
        }
        if(column < columns2 - 1 && row < rows2 - 1)
        {
            total += values[row + 1][column + 1];
            count++;
        }
        neighboringAverage = total/count;
        return neighboringAverage;                    //Returns final neighboring average
    }
}
