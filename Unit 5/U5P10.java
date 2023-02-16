public class U5P10 {
    private double amountOfRoach;  //Sets up private vars for methods
    private double sprayRoach;
    private int count = 0;
    public U5P10()
    {
        amountOfRoach = 0;
        sprayRoach = 0;
    }
    public U5P10(double initialRoaches, double sprayRate)
    {
        amountOfRoach = initialRoaches;    //Puts values into private vars to be accessed in methods 
        sprayRoach = sprayRate;
    }
    public void breed()
    {
        amountOfRoach *= 2; //Multiplies amount of roaches by 2 to breed them     
    }
    public void spray()
    {
        amountOfRoach *= (1 - sprayRoach); //Sprays amount of roaches by the amount that the user inputted 
    }
    public void getRoaches()
    {
        count++;
        System.out.println("Amount of roaches left on instance " + count + ": " + amountOfRoach); //Prints amount of roaches and the instance #
    }
}
