import java.util.Scanner;

public class U8P13D {
    public static void main(String[] args)
{
    U8P13 U8 = new U8P13();
    Scanner sc = new Scanner(System.in);   //Scanner
    int sentinel = -1;   //Sent value 
    while(sentinel != 0)
    {
        System.out.println("Customer name (line 1) and price (line 2)?");
        U8.addSale(sc.nextLine(), sc.nextDouble());                                                  //Asks user for name and values
        System.out.println("Would you like to add more customers? -1 for yes, 0 for no");
        sentinel = sc.nextInt();                                                            //Asks user for more customers 
        sc.nextLine();

    }
    System.out.println("How many top customers?");
    int topN = sc.nextInt();                                   //Amount of top customers and then prints 
    System.out.println("The top " + topN + " in descending order are: " + U8.nameOfBestCustomers(topN));

}

}
