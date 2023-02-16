public class BasicAccount extends BankAccount{
    
    public void withdrawMoney()
    {
        System.out.println("Enter withdraw amount ");
        withdraw = sc.nextDouble();                        //Withdraw method 
      if (withdraw <= balance)
      {            
         balance -= withdraw;  
         counter++; 
         System.out.println("Transaction #: " + counter + " You withdrew $"+ withdraw + " and you account balance is " + balance + " before fees.");
      }
      else
      {
         System.out.println("You don't have enough balance to withdraw!(Fee of 30)");         //Makes fee of 30 
         balance -= 30;
      }
    }
}
