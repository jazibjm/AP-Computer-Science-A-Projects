public class U7P07 {
    
    private int rows;
    private int columns;
    private boolean seatFound;
    private int[][] theatre;
    public U7P07()
    {
        rows = 10;
        columns = 10;
        theatre = new int[0][0];
    }
    public U7P07(int[][]theTheatre) {
        theatre = theTheatre;
        rows = 9;
        columns = 10;
    }
    public void printArray()
    {

        System.out.println();
        System.out.println("Theatre:");
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                if(theatre[i][j] == 0)
                {
                    System.out.print(" " + theatre[i][j] + " ");
                }
                else
                {
                    System.out.print(theatre[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    public void pickAPrice(int price)
    {
        seatFound = false;
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                if(theatre[i][j] == price && theatre[i][j] != 0 && seatFound == false)
                {
                    System.out.println("Seat found!");
                    theatre[i][j] = 0;
                    System.out.println("Your seat is at row " + (i+1) + " and column " + (j+1));
                    seatFound = true;
                }
            }
            
        }
        if(!seatFound)
        {
            System.out.println("Please try again! A seat with that price couldn't be found!");
        }
    }
    public void pickASeat(int row, int column)
    {
        if(theatre[row][column] != 0)
        {
            System.out.println("Seat successfully taken!\nYou have to pay " + theatre[row][column] + " for the seat.");
            theatre[row][column] = 0;
        }
        else
        {
            System.out.println("That seat is taken! Try again!");
        }
    }
    
}