import java.util.Scanner;
public class U3P04 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Convert from? (fl. oz, gal, oz, lb, in, ft, mi)");                               //Asks for unit to convert from 
        String convertFrom = sc.next();
        System.out.println("Convert to? (ml, l, g, kg, mm, cm, m, km)");
        String convertTo = sc.next();                                                         //Asks for unit to convert to 
        System.out.println("Value?");                                                   //Asks for the value of the unit you want to convert from 
        Double value = sc.nextDouble();
        Double newValue = 0.0;
        if(convertFrom.equalsIgnoreCase("fl. oz"))                            //Calculates fl. oz to ml and l 
        {
            if(convertTo.equalsIgnoreCase("ml"))
            {
                newValue = value * 29.57353193;
            }
            else if(convertTo.equalsIgnoreCase("l"))
            {
                newValue = value * 0.02957353193;
            }
            else
            {
                System.out.println("Invalid unit!");
            }
        }
        if(convertFrom.equalsIgnoreCase("gal"))                      //Calculates gal to ml and l 
        {
            if(convertTo.equalsIgnoreCase("ml"))
            {
                newValue = value * 3785.40999993543;
            }
            else if(convertTo.equalsIgnoreCase("l"))
            {
                newValue = value * 3.78540999993543;
            }
            else
            {
                System.out.println("Invalid unit!");
            }
        }
        if(convertFrom.equalsIgnoreCase("oz"))                  //Calculates oz to g and kg 
        {
            if(convertTo.equalsIgnoreCase("g"))
            {
                newValue = value * 28.349500000294;
            }
            else if(convertTo.equalsIgnoreCase("kg"))
            {
                newValue = value * 0.028349500000294;
            }
            else
            {
                System.out.println("Invalid unit!");
            }
        }
        if(convertFrom.equalsIgnoreCase("lb"))                     //Calculates lb to g and kg 
        {
            if(convertTo.equalsIgnoreCase("g"))
            {
                newValue = value * 453.59200000470400482;
            }
            else if(convertTo.equalsIgnoreCase("kg"))
            {
                newValue = value * 0.45359200000470401015;
            }
            else
            {
                System.out.println("Invalid unit!");
            }
        }
        if(convertFrom.equalsIgnoreCase("in"))                       //Calculates in to mm, cm, m, and km 
        {
            if(convertTo.equalsIgnoreCase("mm"))
            {
                newValue = value * 25.4;
            }
            else if(convertTo.equalsIgnoreCase("cm"))
            {
                newValue = value * 2.54;
            }
            else if(convertTo.equalsIgnoreCase("m"))
            {
                newValue = value * 0.0254;
            }
            else if(convertTo.equalsIgnoreCase("km"))
            {
                newValue = value * 0.0000254;
            }
            else
            {
                System.out.println("Invalid unit!");
            }
        }
        if(convertFrom.equalsIgnoreCase("ft"))                     //Calculates ft to mm, cm, m, and km 
        {
            if(convertTo.equalsIgnoreCase("mm"))
            {
                newValue = value * 304.8;
            }
            else if(convertTo.equalsIgnoreCase("cm"))
            {
                newValue = value * 30.48;
            }
            else if(convertTo.equalsIgnoreCase("m"))
            {
                newValue = value * 0.3048;
            }
            else if(convertTo.equalsIgnoreCase("km"))
            {
                newValue = value * 0.0003048;
            }
            else
            {
                System.out.println("Invalid unit!");
            }
        }
        if(convertFrom.equalsIgnoreCase("mi"))                     //Calculates mi to mm, cm, m, and km 
        {
            if(convertTo.equalsIgnoreCase("mm"))
            {
                newValue = value * 1609339.9999754899181;
            }
            else if(convertTo.equalsIgnoreCase("cm"))
            {
                newValue = value * 160933.99999754899181;
            }
            else if(convertTo.equalsIgnoreCase("m"))
            {
                newValue = value * 1609.33999997549;
            }
            else if(convertTo.equalsIgnoreCase("km"))
            {
                newValue = value * 1.60934;
            }
            else
            {
                System.out.println("Invalid unit!");
            }
        }
        System.out.println("The converted value is: " + newValue);      //Prints out the converted value 
        sc.close();
    }
}
