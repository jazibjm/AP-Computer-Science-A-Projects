import java.util.Scanner;
public class U6E10D {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers would you like in your array?");
        int nums = sc.nextInt();                                                 //Prompts user for amount of numbers in array 
        int[] array = new int[nums];
        U6E10 U6 = new U6E10(array);       //Constructs U6
        System.out.println("Original Array:");
        U6.printNewArray();
        U6.swapFirstAndLast();
        U6.printNewArray();
        U6.shiftOne();
        U6.printNewArray();
        U6.evenElementZero();
        U6.printNewArray();
        U6.largerTwoNeighbors();
        U6.printNewArray();
        U6.removeMiddleNumbers();          //Cals all methods and prints arrays 
        U6.printNewArray();
        U6.moveEvenToFront();
        U6.printNewArray();
        U6.secondLargestElement();
        U6.increasingOrder();
        U6.adjacentDuplicates();
        U6.anyDuplicates();

    }
}
