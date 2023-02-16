import java.util.Scanner;
public class U3E18 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your income?");             //Prompts user for income 
        Double income = sc.nextDouble();
        Double tax = 0.0;
        if(income <= 50000)                                           //Finds tax bracket, then calculates it in each one 
        {
            tax = income * 0.01;
        }
        if(income > 50000 && income <= 75000)
        {
            tax = (income - 50000) * 0.02 + 500;
        }
        if(income > 75000 && income <= 100000)
        {
            tax = (income - 75000) * 0.03 + 1000;
        }
        if(income > 100000 && income <= 250000)
        {
            tax = (income - 100000) * 0.04 + 1750; 
        }
        if(income > 250000 && income <= 500000)
        {
            tax = (income - 250000) * 0.05 + 7750;
        }
        if(income > 500000)
        {
            tax = (income - 500000) * 0.06 + 20250;
        }
        System.out.println("Your income tax is " + tax);      //Prints out the amount of income tax. 
        sc.close();
    }
}
