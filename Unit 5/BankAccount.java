public class BankAccount {
    private double wAmount = 0;
    private double dAmount = 0;
    private double bal = 0;
    public BankAccount()
    {
        wAmount = 0;
        dAmount = 0;
        bal = 0;
    }
    public BankAccount(double balance, double withdrawAmount, double depositAmount) 
    {
        wAmount = withdrawAmount;
        dAmount = depositAmount;
        bal = balance;
    }
    public double withdraw(double balance, double withdrawAmount)
    {
        bal = balance;
        wAmount = withdrawAmount;
        bal = bal - wAmount;
        return bal;
    }
    public double deposit(double balance, double depositAmount)
    {
        bal = balance;
        dAmount = depositAmount;
        bal = bal - dAmount;
        return bal;
    }
    
}
