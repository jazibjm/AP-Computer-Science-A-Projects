import java.util.Scanner;
public class U6E06D {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers would you like in your array?");
        int nums = sc.nextInt();                                //Asks user for amount of numbers in the array 
        int[] array = new int[nums];
        U6E06 U6 = new U6E06(array);                          //Constructs 
        U6.reverseArray();                                //Reverses the array 
    }
}
