import java.util.Scanner;
public class U4E10 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Input one word."); //recieves input from user 
        System.out.println();
        String str = sc.next();
        int strLength = str.length();       //int string length
        int i = strLength - 1; 
        int counter = 0;
        while(i > counter - 1)   //Prints word in reverse
        {
            System.out.print(str.charAt(i - counter));
             counter++;
        }
        sc.close();
    }
}
