import java.util.Scanner;
public class U5E14D {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Who would you like to send it to?");      //Asks user who to send to 
        String to = sc.nextLine();
        System.out.println("What is your name?");         //Asks user for their name 
        String from = sc.nextLine();
        U5E14 U5 = new U5E14(from, to);
        System.out.println("How many lines in the body paragraph would you like to include?");    //Asks user for amount of lines 
        int amountOfLines = sc.nextInt();
        int counter = 1;
        String wholeText = "";
        String line = sc.nextLine();
        while(amountOfLines > 0)
        {
            System.out.println("Insert the text for line #" + counter);
            line = sc.nextLine(); 
            wholeText = U5.addLine(line, wholeText);                //Asks user for line 
            counter++;
            amountOfLines--;
        }
        U5.LetterPrinter(wholeText); 
        //Prints the whole letter
        
    }
}

