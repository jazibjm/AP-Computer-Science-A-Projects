import java.util.Scanner;
public class U4E04 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a string");
        String string = sc.next();                //Recieves input from user
        String uppercaseCharacters = "";
        for (int i=0;i<string.length();i++)
        {
            char characters = string.charAt(i);
            if (Character.isUpperCase(characters))  //Recieves all uppercase chars and adds on to "char characters"
            {
                uppercaseCharacters += characters;
            }
        }
        String everyTwo = "";
        for (int i=0 ; i<string.length(); i += 2){
            everyTwo += string.charAt(i);
        }

        string = string.replace("a", "_");
        string = string.replace("e", "_"); //Vowel replacement 
        string = string.replace("i", "_");
        string = string.replace("o", "_");
        string = string.replace("u", "_");
        int numberOfVowels = 0;
        for (int i=0 ; i<string.length(); i++){          
            char ch = string.charAt(i);
            if(ch == '_') //Calculates number of vowels
            {
                numberOfVowels++;
            }
        }
        for (int z=0 ; z<string.length(); z++) //Prints out each index of a vowel 
        {
            if(string.charAt(z) == '_') 
            {
                System.out.println("Index # " +z);
                }
            }
         
        System.out.println("Replaced vowels string: " + string);
        System.out.println("The number of vowels: " + numberOfVowels);
        System.out.println("The uppercase characters are " + uppercaseCharacters);
        System.out.print("Every 2 characters = " + everyTwo);
        
        
    }
}