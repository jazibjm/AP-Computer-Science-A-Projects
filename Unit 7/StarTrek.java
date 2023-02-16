public class StarTrek {
    private int[][]starTrek;
    private int rows;
    private int[] sums;
    private char[] characters;
    private int columns;                 //Instance variables 
    private String starT2;
    private String starT;
    public StarTrek()
    {
        characters = new char['.'];
        rows = 0;
        columns = 0;
        starT2 = "";                 //Setting values to instance vars in default constructor 
        starT = "";
        starTrek = new int[0][0];
        sums = new int[rows];
    }
    public StarTrek(int[][]sT, char[]chars)
    {
        characters = chars;
        rows = 19;
        columns = 5;
        starTrek = sT;                 //Setting values to instance vars in 2 arg constructor 
        starT2 = "";
        starT = "";
        sums = new int[rows];
    }
    public void sumNumbersByRow()
    {
        for(int i = 0; i < rows; i ++)                        //Sums up the rows 
        {
            for(int j = 0; j < columns; j++)
            {
                sums[i] += starTrek[i][j]; 
            }
        }
    }
    public void finalCalc()
    {
        for(int i = 0; i < sums.length; i++)
        {
            sums[i] = sums[i]%100;
            for(int z = 0; z < characters.length; z++)                      //Finds each character using the character array 
            {
                if(sums[i] == z)
                {
                    starT += characters[z];
                }
            }
        }
        starT2 = starT;             //Sets up punctuated line 
        starT2 = starT2.substring(0, 3) + characters[8] + starT2.substring(3, 13) + characters[8] + starT2.substring(13, 15) + characters[8] + starT2.substring(15, 19) + characters[0];
        
    }
    public void finalPrint()
    {
        System.out.println(starT);          //Prints final values 
        System.out.println(starT2);
    }
    

}
