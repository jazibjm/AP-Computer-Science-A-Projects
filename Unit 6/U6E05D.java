import java.util.Scanner;
public class U6E05D {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers would you like in your array?");     //Asks user for amount of numbers  in array 
        int nums = sc.nextInt();          
        int[] array = new int[nums];
        U6E05 U6 = new U6E05(array);         //Constructs 
        U6.computeAlternation();                //Alternation method 
    }
}
