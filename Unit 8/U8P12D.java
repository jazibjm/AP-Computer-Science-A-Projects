import java.util.Scanner;

public class U8P12D {
    public static void main(String[] args)
{
    U8P12 U8 = new U8P12();
    Scanner sc = new Scanner(System.in);          //SCanner 
    int sentinel = -1;
    while(sentinel != 0)       //Sentinetel valuje 
    {
        System.out.println("Customer name (line 1) and price (line 2)?");                  //Prompts user for customer name and value 
        U8.addSale(sc.nextLine(), sc.nextDouble());
        System.out.println("Would you like to add more customers? -1 for yes, 0 for no");        //asks user for more customers 
        sentinel = sc.nextInt();
        sc.nextLine();

    }
    System.out.println(U8.nameOfBestCustomer());    //Prints best customer 

}

}
