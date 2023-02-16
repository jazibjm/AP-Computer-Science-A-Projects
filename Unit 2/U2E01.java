import java.util.Scanner;
import java.awt.Rectangle;

public class U2E01 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a height:");
        int height = sc.nextInt();
        System.out.println("Input a width:");
        int width = sc.nextInt();                                         //Input height and width from user 
        Rectangle r = new Rectangle(width, height, width, height); 
        double areaOfRectangle = r.getWidth() * r.getHeight();                      //Multiply width by height 
        System.out.println("The area of the recatngle is: " + areaOfRectangle);
        System.out.println("The expected area is: " + height*width);                              //Prints out area and expected area of the rectangle.

    }
}
