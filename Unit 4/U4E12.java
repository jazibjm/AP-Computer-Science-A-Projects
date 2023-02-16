import java.util.Scanner;
public class U4E12 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);                                //Gets a word input from user. 
        String input = sc.next();
        for (int first = 0; first < input.length(); first++)                  //Changes first letter after done going through all possible combos starting from that letter
        {
            for (int last = first+1; last <= input.length(); last++)                          
            {
                System.out.println(input.substring(first, last));                  //Prints out each line of the possible combinations 
            }
        }
        sc.close();
    }
}