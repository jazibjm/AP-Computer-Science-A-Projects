import java.util.Scanner;
public class U3E21 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 3 strings in seperate lines");                         //Prompts the user to input 3 strings 
        String String1 = sc.next();                  
        String String2 = sc.next();                    
        String String3 = sc.next();                    
        int sort = String1.compareTo(String2);
        int sort2 = String2.compareTo(String3);
        int sort3 = String3.compareTo(String1);                           //Compares all the strings with eachother to order them. 
        if(sort > 0 && sort2 > 0 && sort3 < 0)
        {
            System.out.println(String3);
            System.out.println(String2);
            System.out.println(String1);                              //Prints out all statements depending on the order of them
        }
        if(sort < 0 && sort2 > 0 && sort3 > 0)
        {
            System.out.println(String1);
            System.out.println(String3);
            System.out.println(String2);
        }
        if(sort > 0 && sort2 < 0 && sort3 < 0)
        {
            System.out.println(String2);
            System.out.println(String3);
            System.out.println(String1);
        }
        if(sort < 0 && sort2 < 0 && sort3 > 0)
        {
            System.out.println(String1);
            System.out.println(String2);
            System.out.println(String3);
        }
        if(sort > 0 && sort2 < 0 && sort3 > 0)
        {
            System.out.println(String2);
            System.out.println(String1);
            System.out.println(String3);
        }
        if(sort < 0 && sort2 > 0 && sort3 < 0)
        {
            System.out.println(String3);
            System.out.println(String1);
            System.out.println(String2);
        }
        
        sc.close();
    }
}
