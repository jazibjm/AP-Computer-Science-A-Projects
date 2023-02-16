import java.util.Scanner;

public class U6E11D {
    public static void main(String[] args) {
        int sequenceNumber = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many slots in sequence 1?"); // Asks for amount of slots in seq 1
        Sequence seq1 = new Sequence(sc.nextInt());
        System.out.println("How many slots in sequence 2?");      //Asks for amount of slots in seq 2
        Sequence seq2 = new Sequence(sc.nextInt());
        seq1.set(sequenceNumber);
        sequenceNumber++;
        seq2.set(sequenceNumber);

        boolean check = seq1.equals(seq2); // Calls equal method
        seq1.result(check);

    }
}