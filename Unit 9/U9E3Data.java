import java.util.Scanner;

public class U9E3Data {

    
    public void run()
    {
        Scanner sc = new Scanner(System.in);
        
        CheckingAccount U9 = new CheckingAccount();    
        U9.transactionFee();
        String input = "";
        outer:
        while (input != "S")              //Loop for depositing, withdrawing, or stop
        {
           System.out.println("Enter D to deposit, W to withdraw, or enter stop to stop");
           input = sc.next();
           switch (input)             //Switch to choose between all 3 cases 
           {
              case "D":
                 System.out.println("Enter deposit amount");
                 double deposit = sc.nextDouble();
                 U9.deposit(deposit);  //Deposit money
                 break;
                 
              case "W":
                 System.out.println("Enter withdraw amount ");
                 double withdraw = sc.nextDouble();    
                 U9.withdraw(withdraw);       //Withdraw money 
                 break;
              case "stop":
                 break outer;  //Breaks out of 2 loops 
                 
           }
        }
        
        U9.deductMonthlyChargeAndPrint();   //Print + deduct the monthly transaction fees
    }
}


