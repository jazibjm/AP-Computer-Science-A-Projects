public class BankAccountTester {
    public static void main(String [] args){
        double balance = 0;       //balance variable
        double withdrawAmount = 0;      //withdraw variable
        double depositAmount = 0; //deposit variable 
        BankAccount U5 = new BankAccount(balance, withdrawAmount, depositAmount); //Constructor
        depositAmount = 1000;
        balance = U5.deposit(balance, depositAmount);        //Calls deposit method 
        System.out.println("Transaction one: " + balance + " After a deposit of " + depositAmount); //prints new balance
        withdrawAmount = 500; 
        balance = U5.withdraw(balance, withdrawAmount);       //calls withdraw method
        System.out.println("Transaction two: " + balance + " After a withdraw of " + withdrawAmount);             //Prints new balance
        withdrawAmount = 400;
        balance = U5.withdraw(balance, withdrawAmount);           //calls antoher withdraw method
        System.out.println("Transaction three: " + balance + " After a withdraw of " + withdrawAmount);             //prints new balance 
    }
}
