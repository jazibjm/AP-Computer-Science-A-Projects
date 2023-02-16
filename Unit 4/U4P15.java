import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class U4P15 {
    public void sim(double iv) throws InterruptedException
    {
    final double DELTA_T = 0.01;
    final double gravForce = 9.81; //all final doubles and doubles set up 
    double t = 0;
    double velocity = iv;
    double cannonPos = 0;
    double sim = 0;
    sim += iv * DELTA_T;
    System.out.println("Initial velocity: " + iv); //Prints out the initial value 
    for(int i = 0; i <= 100; i++)
    {
        sim += velocity * DELTA_T;                   //sim calculation 
        velocity -= gravForce * DELTA_T;             //caluclation for velocity
        t = sim/velocity;                          //caluclation for time 
        cannonPos = -0.5 * gravForce * Math.pow(t, 2) + (iv*t); //Caluclation for cannon position
        System.out.println("Velocity: " + velocity);
        System.out.println("Time: " + t);
        System.out.println("Cannon Position: " + cannonPos);       //Print statements
        TimeUnit.SECONDS.sleep(1);                              //Sleep timer 
    }
    }
}