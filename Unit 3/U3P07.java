import java.util.Scanner;
import java.lang.Math;
public class U3P07 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("A is bottom left, B is top left, C is top right, and D is bottom right.");
        System.out.println("What is the x coordinate of point A");                                         //Gets coords for all 4 corners and convert them into Doubles
        Double aX = sc.nextDouble();
        System.out.println("What is the y coordinate of point A");
        Double aY = sc.nextDouble();
        System.out.println("What is the x coordinate of point B");
        Double bX = sc.nextDouble();
        System.out.println("What is the y coordinate of point B");
        Double bY = sc.nextDouble();
        System.out.println("What is the x coordinate of point C");
        Double cX = sc.nextDouble();
        System.out.println("What is the y coordinate of point C");
        Double cY = sc.nextDouble();
        System.out.println("What is the x coordinate of point D");
        Double dX = sc.nextDouble();
        System.out.println("What is the y coordinate of point D");
        Double dY = sc.nextDouble();
        String quadrilateral = "Nothing";
        Double sideAB = Math.sqrt(Math.pow((bX-aX),2) + Math.pow((bY-aY),2));
        Double sideBC = Math.sqrt(Math.pow((cX-bX),2) + Math.pow((cY-bY),2));
        Double sideCD = Math.sqrt(Math.pow((dX-cX),2) + Math.pow((dY-cY),2));                    //Finds distance for all four sides
        Double sideAD = Math.sqrt(Math.pow((dX-aX),2) + Math.pow((dY-aY),2));
        if(sideAB.equals(sideBC) && sideBC.equals(sideCD) && sideCD.equals(sideAD))                   //Finds if its a rectangle, square, rhombus, or trapezoid by comparing each side. 
        {
            if(aX.equals(bX))
            {
                quadrilateral = "Square";
            }
            else
            {
                quadrilateral = "Rhombus";
            }
        }
        else if(sideAB.equals(sideCD) && sideAD.equals(sideBC))
        {
            quadrilateral = "Rectangle";
        }
        else if(sideAB.equals(sideCD) && sideAD != sideBC)
        {
            quadrilateral = "Trapezoid";
        }
        else if(sideAB != sideCD && sideAD.equals(sideBC))
        {
            quadrilateral = "Trapezoid";
        }
        System.out.println("The quadrilateral is: " + quadrilateral);                 //Prints out what quadrilateral it is 
        sc.close();

    }
}
