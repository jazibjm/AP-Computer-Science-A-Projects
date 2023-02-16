import java.util.Scanner;
public class U3E25 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the cost of your groceries: ");
        Double cost = sc.nextDouble();                                      //Input for cost of groceries 
        if(cost < 10)
        {
            System.out.println("You get no coupon");                //If less than 10 spent then you get no coupon 
        }
        if(cost >= 10)                              //Finds coupon value depending on how much spend at the grocery store 
        {
            Double coupon = 0.0;
            int couponPercentage = 0;
            if(cost <= 60)                       //If less than or equal to 60 spent 
            {
                couponPercentage = 8;
                coupon = cost * 0.08;
            }
            if(cost > 60 && cost <= 150)                         //if less than or equal to 150 spend but more than 60 
            {
                couponPercentage = 10;
                coupon = cost * 0.10;
            }
            if(cost > 150 && cost <= 210)                          //if less than or equal to 210 spent but more than 150 
            {
                couponPercentage = 12;
                coupon = cost * 0.12;
            } 
            if(cost > 210)                             //If more than $210 spent 
            {
                couponPercentage = 14;
                coupon = cost * 0.14;
            }
            System.out.println("You win a discount coupon of $" + coupon + "." + " (" + couponPercentage + "% of your purchase)");        //Prints out final statement after finding coupon value 
        }

    }
}