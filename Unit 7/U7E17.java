public class U7E17 {
    
    private double total;
    private double rows2;
    private double columns2;
    private double[][] values;
    public U7E17()
    {
        total = 0;
        rows2 = 0;
        columns2 = 0;
        values = new double[0][0];
    }
    public U7E17(int rows, int columns) {
        values = new double[rows][columns];
        total = 0;
        columns2 = columns;
        rows2 = rows;
        
    }
    public void printArray()
    {

        System.out.println();
        System.out.println("Diagram of the array:");
        for(int i = 0; i < rows2; i++)
        {
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
    public double sum(int rowColumn, boolean rowOrColumn)
    {
        total = 0;
        if(rowOrColumn)
        {
            for(int i = 0; i < columns2; i++)
            {
                total += values[rowColumn][i];
            }
        }
        else
        {
            for(int i = 0; i < rows2; i++)
            {
                total += values[i][rowColumn];
            }
        }
        return total;
    }
}