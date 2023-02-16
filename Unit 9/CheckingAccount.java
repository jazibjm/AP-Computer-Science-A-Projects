/**
   A checking account has a limited number of free deposits and withdrawals.
*/
public class CheckingAccount extends BankAccount
{
   private int withdrawals;

   /**
      Constructs a checking account with a zero balance.
   */
   public CheckingAccount()
   {
      withdrawals = 0;
   }

   public void withdraw(double amount)
   {
      int overdraftCounter = 0;
      final int FREE_WITHDRAWALS = 3;
      final int WITHDRAWAL_FEE = 1;
      
      super.withdraw(amount);  
      withdrawals++;
      if (withdrawals > FREE_WITHDRAWALS)
      {
         super.withdraw(WITHDRAWAL_FEE);  
      }
      if(super.balance < 0)
      {
         if(overdraftCounter == 0)
         {
            super.withdraw(20);
            overdraftCounter++;
         }
         else
         {
            super.withdraw(30);
            overdraftCounter++;
         }
      }
   }

   public void monthEnd()
   {
      withdrawals = 0;
   }
}

