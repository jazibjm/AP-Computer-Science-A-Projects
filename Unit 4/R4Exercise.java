import java.util.Scanner;
import java.lang.Math;
public class R4Exercise
{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
double a = sc.nextDouble();
double b = sc.nextDouble();
double powerAB = Math.pow(a,b);
double maxAB = Math.max(a,b);
double divAB = a/b;
double percentSignAB = a%b;


System.out.println(powerAB);
System.out.println(maxAB);
System.out.println(divAB);
System.out.println(percentSignAB);

}
}