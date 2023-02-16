import java.util.Scanner;

public class U7E17Data {
    private int rC;
    private boolean rowOrColumn;
    private double columnRowSum;
    private int rows;
    private int columns;
    private double sv;
    public U7E17Data()
    {
        rC = 0;
        rows = 0;
        columns = 0;
        columnRowSum = 0;
        rowOrColumn = false;
        sv = -1;

    }
    public void getData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows?");
        rows = sc.nextInt();
        System.out.println("How many columns?");
        columns = sc.nextInt();
        U7E17 U7 = new U7E17(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("For row " + (i + 1) + " and column " + (j + 1)
                        + " what would you like the double value to be?");
                double n = sc.nextInt();
                U7.set(i, j, n);
            }
        }
        U7.printArray();
        System.out.println();
        while (sv != 0) {
            System.out.println("Would you like to find a rows sum or a columns sum? Enter 1 for rows or 2 for column.");
            if(sc.nextInt() == 1)
            {
                rowOrColumn = true;
                System.out.println("What is the row you would like to find the overall sum of?");
                rC = sc.nextInt() - 1;
            }
            else
            {
                rowOrColumn = false;
                System.out.println("What is the column you would like to find the overall sum of?");
                rC = sc.nextInt() - 1;
            }
            
            
            columnRowSum = U7.sum(rC, rowOrColumn);
            System.out.println("The row/columns sum is " + columnRowSum);
            System.out.println("Would you like to find another row/columns sum? 0 for no, 1 for yes");
            sv = sc.nextInt();
        }
    }
}
