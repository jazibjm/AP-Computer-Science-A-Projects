import java.util.Scanner;
public class U4P15D {
    public static void main(String [] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the cannons initial velocity"); //Recieves initial value 
        double iv = sc.nextDouble();
        U4P15 U4 = new U4P15(); 
        U4.sim(iv); //sends initial value to simulation


    }

    
}
