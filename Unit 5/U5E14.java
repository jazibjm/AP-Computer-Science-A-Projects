public class U5E14 {
    private String fromP;     //Sets up private variables
    private String toP;
    public U5E14()                         //Default constructor 
    {
        fromP = "";
        toP = "";
    }
    public U5E14(String from, String to)                          //2-Argument constructor 
    {
        fromP = from;          //Sets up variables to be used in other methods 
        toP = to;
    }
    public String addLine(String line, String wholeText)
    {
        wholeText = wholeText.concat("\n" + line);         //Adds lines 
        return wholeText;
    }
    public void LetterPrinter(String wholeText)
    {
        System.out.println();
        System.out.print("Dear ".concat(toP + "," + "\n" + wholeText +"\n \n" + "Sincerely, " + fromP)); //Prints out whole letter 
    }


    

}
