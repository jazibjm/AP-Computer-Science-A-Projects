import java.util.Scanner;
public class U4E3 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Print value 1");         //Recieves multiple inputs from user
        int v1 = sc.nextInt();
        System.out.println("Print value 2");
        int v2 = sc.nextInt();
        System.out.println("Print value 3");
        int v3 = sc.nextInt();
        System.out.println("Print value 4");
        int v4 = sc.nextInt();
        System.out.println("Print value 5");
        int v5 = sc.nextInt();
        double maxValue = Math.max(v1, Math.max(v2, Math.max(v3, Math.max(v4, v5)))); //Min and max values 
        double minValue = Math.min(v1, Math.max(v2, Math.max(v3, Math.max(v4, v5))));
        System.out.println("The largest value is " + maxValue);          //Prints both large amd min values
        System.out.println("The smallest value is " + minValue);
        int numberOfOdd = 0;
        int numberOfEven = 0;
        if(v1%2 == 0) //Odd or even calculation 
        {
            numberOfEven++;
        }
        if(v2%2 == 0)
        {
            numberOfEven++;
        }
        if(v3%2 == 0)
        {
            numberOfEven++;
        }
        if(v4%2 == 0)
        {
            numberOfEven++;
        }
        if(v5%2 == 0)
        {
            numberOfEven++;
        }
        if(v1%2 != 0)
        {
            numberOfOdd++;
        }
        if(v2%2 != 0)
        {
            numberOfOdd++;
        }
        if(v3%2 != 0)
        {
            numberOfOdd++;
        }
        if(v4%2 != 0)
        {
            numberOfOdd++;
        }
        if(v5%2 != 0)
        {
            numberOfOdd++;
        }
        System.out.println("The number of even values is " + numberOfEven); //print odd and even 
        System.out.println("The number of odd values is " + numberOfOdd);
        System.out.println("Cumulative totals: " + v1 + " " + (v1 + v2) + " " + (v1 + v2 + v3) + " " + (v1 + v2 + v3 + v4) + " " + (v1 + v2 + v3 + v4 + v5)); //Prints cumulative totals 
        System.out.println("Adjecent duplicates: ");
        if(v1 == v2 && v2 != v3)                 //Calculates all adjacent duplicates and prints it 
        {
           System.out.print(v1 + " ");
        }
        if(v2 == v3 && v3 != v4 && v1 != v2)
        {
            System.out.print(v2 + " ");
        }
        if(v3 == v4 && v2 != v3 && v4 != v5)
        {
            System.out.print(v3 + " ");
        }
        if(v4 == v5 && v3 != v4)
        {
            System.out.print(v4 + " ");
        }
        if(v1 == v2 && v2 == v3 && v3 != v4)
        {
            System.out.print(v1 + " ");
        }
        if(v2 == v3 && v3 == v4 && v4 != v5 && v1 != v2)
        {
            System.out.print(v2 + " ");
        }
        if(v3 == v4 && v4 == v5 && v3 != v2)
        {
            System.out.print(v3 + " ");
        }
        if(v1 == v2 && v2 == v3 && v3 == v4 && v4 != v5)
        {
            System.out.print(v1 + " ");
        }
        if(v2 == v3 && v3 == v4 && v4 == v5 && v1 != v2)
        {
            System.out.print(v2 + " ");
        }
        if(v1 == v2 && v2 == v3 && v3 == v4 && v4 == v5)
        {
            System.out.print(v1 + " ");
        }
        sc.close();
        
    }
    
}