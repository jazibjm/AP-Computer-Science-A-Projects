import java.util.Scanner;
import java.util.Arrays;

public class U6E10 {
    private int[] numbers;                                 //instance vars 
    Scanner sc = new Scanner(System.in);

    public U6E10() {
        numbers = new int[0];              //Default constructor 
    }

    public U6E10(int[] array) {                         //1 arg constructor 
        numbers = array;
        for (int i = 0; i < numbers.length; i++) {                 //Asks user for each position 
            System.out.println("What is the value for array position #" + i + "(" + (i + 1) + ")");
            numbers[i] = sc.nextInt();
        }
    }

    public void evenElementZero() {
        System.out.println("\n\nSetting the even elements to 0: ");          //Checks and sets the even elements to 0 
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                numbers[i] = 0;
            }
        }
    }

    public void increasingOrder() {
        boolean increasingOrder = true;
        for (int i = 0; i < numbers.length - 1; i++) {                     //Checks if the array is in increasing order 
            if (numbers[i] > numbers[i + 1]) {
                increasingOrder = false;
            }
        }
        if (increasingOrder) {
            System.out.println("\nThe array is in an increasing order.");
        } else {
            System.out.println("\nThe array is not in an increasing order.");          //Prints 
        }
    }

    public void adjacentDuplicates() {
        boolean adjDupes = false;
        for (int i = 0; i < numbers.length - 1; i++) {       //Checks for adjacent dupes 
            if (numbers[i] == numbers[i + 1]) {
                adjDupes = true;
            }
        }
        if (adjDupes) {
            System.out.println("\nThe array contains adjacent duplicate(s).");      //Prints 
        } else {
            System.out.println("\nThe array does not contain adjacent duplicates.");
        }
    }

    public void anyDuplicates() {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {     //Checks for any duplicates in general  
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }
        }
        if (count >= 1) {
            if (count == 1) {
                System.out.println("\nThe array has a duplicate.");    //Prints result 
            } else {
                System.out.println("\nThe array has duplicates.");
            }
        } else {
            System.out.println("\nThe array does not have any duplicates.");
        }
    }

    public void swapFirstAndLast() {
        System.out.println("\n\nSwapping the first and last elements: ");
        int lastValue = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = numbers[0];                             //Swapping the first and last elements in the array 
        numbers[0] = lastValue;

    }

    public void secondLargestElement() {
        int largestElement = numbers[0];
        int secondLargestElement = -2147483648;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largestElement) {                 //Finds the second largest element within the array 
                largestElement = numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > secondLargestElement && numbers[i] != largestElement) {
                secondLargestElement = numbers[i];
            }
        }
        if (secondLargestElement == -2147483648) {
            System.out.println("\n\nThe second largest element is " + largestElement);              //Prints 
        } else {
            System.out.println("\n\nThe second largest element is " + secondLargestElement);
        }
    }

    public void moveEvenToFront() {
        System.out.println("\n\nMoving even numbers to the front: ");          //Moves all the even numbers to the front so that it doesnt disrupt 
        int counter = 0;
        int placeHolder = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                for (int num = i; num > counter; num--) {                             
                    placeHolder = numbers[num - 1];
                    numbers[num - 1] = numbers[num];
                    numbers[num] = placeHolder;
                }
                counter++;
            }
        }
    }

    public void shiftOne() {
        System.out.println("\n\nShifting all elements by 1");
        int last = numbers[numbers.length - 1];                                //Shifts all elements by 1 and the last one goes into the first position 
        System.arraycopy(numbers, 0, numbers, 1, numbers.length - 1);
        numbers[0] = last;
    }

    public void removeMiddleNumbers() {
        System.out.println("\n\nRemoving middle numbers: ");
        int counter = 0;
        int middleOfArray = numbers.length / 2;
        if (numbers.length != 1 && numbers.length != 2) {                    //Removes the middle number(s) using temp arrays
            if (numbers.length % 2 == 0) {
                int[] tempArray = new int[numbers.length - 2];
                for (int i = 0; i < middleOfArray - 1; i++) {
                    tempArray[counter] = numbers[i];
                    counter++;
                }
                for (int i = middleOfArray + 1; i < numbers.length; i++) {
                    tempArray[counter] = numbers[i];
                    counter++;
                }
                numbers = null;
                numbers = tempArray;
            } else {
                int[] tempArray = new int[numbers.length - 1];
                for (int i = 0; i < middleOfArray - 1; i++) {
                    tempArray[counter] = numbers[i];
                    counter++;
                }
                for (int i = middleOfArray; i < numbers.length; i++) {
                    tempArray[counter] = numbers[i];
                    counter++;
                }
                numbers = null;
                numbers = tempArray;

            }
        }
        else
        {
            System.out.println("Only 1 or 2 numbers in array! Abandoned removing middle numbers operation.");        //If theres only 1 or 2 numbers in the arra y
        }
    }

    public void largerTwoNeighbors() {
        System.out.println("\n\nReplacing number with larger of the 2 neighbors: ");        //Replacing number with the larger neighbor 
        int temp;
        for (int i = 1; i < numbers.length - 1; i++) {
            if (numbers[i - 1] > numbers[i + 1]) {
                temp = numbers[i - 1];
                numbers[i - 1] = numbers[i];
                numbers[i] = temp;
            } else {
                temp = numbers[i + 1];
                numbers[i + 1] = numbers[i];
                numbers[i] = temp;
            }
        }

    }

    public void printNewArray() {
        System.out.println("The new array is:");
        for (int i = 0; i < numbers.length; i++) {                                             //Prints the new arrays 
            System.out.print("Index #" + (i) + "(" + (i + 1) + ") " + numbers[i] + " | ");
        }
    }
}