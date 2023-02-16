import java.util.Scanner;
public class U4P17D {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the initial value"); //Recieves input from user
        double value = sc.nextDouble();
        U4P17 U4 = new U4P17();
        U4.sim(value); //sends it off to do half life calculations


    }

    
}
