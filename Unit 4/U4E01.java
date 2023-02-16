import java.util.Scanner;
public class U4E01 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the interest rate (percent)?");          //Prompts user for interest rate and initial investment 
        Double interestRate = sc.nextDouble() * 0.01;
        System.out.println("What is the initial investment?");
        Double initialInvestment = sc.nextDouble();
        
        Double years = 0.0;
        while(initialInvestment <= 1000000)
        {                                                                             //gets free money 
           initialInvestment += initialInvestment * interestRate;
            years++;
        }
        System.out.println("It will take " + years + " years till your investment reaches $1M.");   //Prints out amount of years 
        sc.close(); 
        
    }
}