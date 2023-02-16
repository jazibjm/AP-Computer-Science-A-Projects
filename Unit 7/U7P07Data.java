import java.util.Scanner;
public class U7P07Data {
    int row;
    int column;
    int price;
    int choice;
    int[][] theTheatre;
    int sv;
    public U7P07Data()
    {
        theTheatre =
        new int[][]{{10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
        { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
        { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
        { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },               //Sets up theatre 
        { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
        { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
        { 20, 20, 30, 30, 30, 30, 30, 30, 20, 20 },
        { 20, 30, 30, 30, 30, 30, 30, 30, 30, 20 },
        { 30, 40, 50, 50, 50, 50, 50, 50, 40, 30 }};
        row = 0;
        column = 0;
        price = 0;
        choice = -1;
    }
    public void getData()
    {
        
        Scanner sc = new Scanner(System.in);
        U7P07 U7 = new U7P07(theTheatre);
        U7.printArray();
        int sv = -1;
        while (sv != 0) {
            System.out.println("Would you like to pick a specific seat or pick a price? Enter 0 for specific seat and enter 1 for a specific price.");
            choice = sc.nextInt();
            if (choice == 0) {
                System.out.println("What row?");
                row = sc.nextInt() - 1;
                System.out.println("What column?");
                column = sc.nextInt() - 1;
                U7.pickASeat(row, column);
                choice = -1;
            } else if (choice == 1) {
                System.out.println("What price would you like?");
                price = sc.nextInt();
                U7.pickAPrice(price);
                choice = -1;
            } else {
                System.out.println("Invalid option. Try again.");
            }
            U7.printArray();
            System.out.println("Pick another seat or seat price? Enter 0 for no and 1 for yes.");
            sv = sc.nextInt();

        }
    }
}
