import java.util.Scanner;
public class U6E03D {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers would you like in your array?");
        int nums = sc.nextInt();
        int[] array = new int[nums];                          //Constructor and asks user for amount of numbers in array 
        U6E03 U6 = new U6E03(array);
        U6.sumWithoutSmallestValue();           //Calls method 

    }
}
