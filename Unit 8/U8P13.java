import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class U8P13 {
    private double largestSale;
    private String bestCustomer;                //Instance variables 
    private ArrayList<String> bestCustomers;
    ArrayList<Customer> customers;
    public U8P13()
    {
        bestCustomers = new ArrayList<>();
        customers = new ArrayList<>();
        largestSale = 0;                        //Default constructor 
        bestCustomer = "N/A";
    }
    public void addSale(String customerName, double amount)                 //Add sale 
    {
        customers.add(new Customer(customerName, amount));  //Adds sale to object 
    }
    public String nameOfBestCustomer()
    {
        largestSale = 0;
        bestCustomer = "N/A";
        for(Customer i : customers)
        {
            if(i.customerSaleValue() > largestSale)          //Finds the customer with the largest sale value 
            {
                largestSale = i.customerSaleValue();
                bestCustomer = i.returnCustomer();                           //Sets the best customer 
            }
        }
        return bestCustomer;            //returns the best customer 
    }
    public ArrayList<String> nameOfBestCustomers(int topN)
    {
        Collections.sort(customers, new MyComparator());     //Uses a comparator to sort sale price 
        if(customers.size() > topN)    //Checks if customer list is smaller or bigger than given top number of customers value 
        {
            for(int i = 0; i < topN; i++)
        {
            bestCustomers.add(customers.get(i).returnCustomer());                            //Scans for top amount of customers 
        }
        }
        else
        {
            for(int i = 0; i < customers.size(); i++)
        {
            bestCustomers.add(customers.get(i).returnCustomer());         
        }
        }
        return bestCustomers;   //Returns best customers 
        



        
    }
    class MyComparator implements Comparator<Customer> {
        @Override
        public int compare(Customer o1, Customer o2) {                   //Changes the place if customer 2 is more than the other or vice versa 
            if (o1.customerSaleValue() > o2.customerSaleValue()) {
                return -1;
            } else if (o1.customerSaleValue() < o2.customerSaleValue()) {
                return 1;
            }
            return 0;
        }

    }
}
