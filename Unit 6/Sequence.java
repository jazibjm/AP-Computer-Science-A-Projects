import java.util.Scanner;

public class Sequence {
    private int[] values;
    Scanner sc = new Scanner(System.in);
    private int size2;
    public Sequence()
    {
        values = new int[0];
        size2 = 0;
    }
    public Sequence(int size) {
        values = new int[size];
        size2 = size;
    }

    public void set(int z) {
        for (int i = 0; i < size2; i++) {
            System.out.println("What is the value for slot #" + i + " in sequence " + z + "?"); // Sets data for sequences
            values[i] = sc.nextInt();
        }
        
    }

    public int get(int i) {
        return values[i]; // Gets value
    }

    public int size() {
        return values.length; // Array length
    }

    public boolean equals(Sequence other) {
        if (this == other) // First check
        {
            return true;
        }

        if (this.values.length != other.values.length) // Second check to see if lengths of the arrays are the same
        {
            return false;
        }

        for (int i = 0; i < values.length; i++) {
            if (this.values[i] != other.values[i]) // Checks if any value doesnt equal another values
            {
                return false;
            }
        }
        return true;
    }
    public void result(boolean check)
    {
        if(check)
        {
            System.out.println("Both sequences/arrays match.");         //Prints 
        }
        else
        {
            System.out.println("Both sequences/arrays do not match.");
        }
    }
}