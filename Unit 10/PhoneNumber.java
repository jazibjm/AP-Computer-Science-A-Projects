public class PhoneNumber {
    private String name; 
    private int number;           //instance vars 
    public PhoneNumber(String n, int num)
    {
        name = n;
        number = num;          //sets name and number 
    }
    public String getName()   {      //returns name 
        return name;
    }
    public int getNum()      //returns the number 
    {
        return number;
    }
}
