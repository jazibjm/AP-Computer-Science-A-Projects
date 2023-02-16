public class Customer {
    String customerName;      //Instance variables 
    double amount;
    public Customer()                //Default constructor 
    {
        customerName = "";
        amount = 0;
    }
    public Customer(String cName, double amt)         //2 arg constructor 
    {
        customerName = cName;
        amount = amt;
    }
    public double customerSaleValue()  //Returns the customer sale value 
    {
        return amount;
    }
    public String returnCustomer() //Returns the name of the customer
    {
        return customerName;
    }
}
