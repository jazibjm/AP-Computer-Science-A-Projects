public class U10P1Data {
    public static char[] getKeysForButton(int n) {
        switch (n) {                             //Returns corresponding char array 
            case 0:
                return new char[] { ' ' };
            case 1:
                return new char[] { '.' };
            case 2:
                return new char[] { 'A', 'B', 'C' };
            case 3:
                return new char[] { 'D', 'E', 'F' };
            case 4:
                return new char[] { 'G', 'H', 'I' };
            case 5:
                return new char[] { 'J', 'K', 'L' };
            case 6:
                return new char[] { 'M', 'N', 'O' };
            case 7:
                return new char[] { 'P', 'Q', 'R', 'S' };
            case 8:
                return new char[] { 'T', 'U', 'V' };
            case 9:
                return new char[] { 'W', 'X', 'Y', 'Z' };
        }
        return null;
    }


    public static void enumerateWords(String num, String text) {      //Enumerating words method 

        if (num.length() == 0) {                      

            System.out.println(text);   //Prints once the length of num is 0 
        } 
        else {

            int digit = Integer.valueOf(num.substring(0,1));  //Extracts first digit 
            char letters[] = getKeysForButton(digit); //Gets character array from method using digit 

            if (letters != null) {

                for (int i = 0; i < letters.length; i++) {      //Goes through whole letters array 

                    enumerateWords(num.substring(1), text + letters[i]);    //Recursive method to send next digit with all combinations of the text and letters 

                }

            }

        }

    }

}
