import java.util.*;  
public class U8P12 {
    private double largestSale;     //Instance variables 
    private String bestCustomer;
    ArrayList<Customer> customers;
    public U8P12()
    {
        largestSale = 0;
        bestCustomer = "N/A";                           //Default constructor 
        customers = new ArrayList<>();
    }
    public void addSale(String customerName, double amount)    //2 arg constructor 
    {
        customers.add(new Customer(customerName, amount));
        largestSale = 0;
        bestCustomer = "N/A";
        customers = new ArrayList<>();
    }
    public String nameOfBestCustomer()                 
    {
        largestSale = 0;
        bestCustomer = "N/A";
        for(Customer i : customers)
        {
            if(i.customerSaleValue() > largestSale)
            {
                largestSale = i.customerSaleValue();                        //Sets best customer 
                bestCustomer = i.returnCustomer();
            }
        }
        return bestCustomer;           //Returns the name of the best customer 
    }
}
