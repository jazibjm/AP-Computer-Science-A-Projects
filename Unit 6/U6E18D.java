import java.util.Scanner;
public class U6E18D {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers would you like in your array?");    //Prompts user for amount of numbers in array 
        int nums = sc.nextInt();
        int[] array = new int[nums];               //Calls constructor and creates array 
        U6E18 U6 = new U6E18(array);
        U6.barChart();              //Calls bar chart method 
    }
}
