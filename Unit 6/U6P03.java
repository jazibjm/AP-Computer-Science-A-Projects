public class U6P03 {
    private int largestCount;
    private int count;
    private boolean inRun;
    private boolean[] stall;
    private int stallToChange;
    private int amtOfStalls;                //Starts up variables 
    private int largestLength;
    private int length;

    public U6P03() {            //Constructor 
        amtOfStalls = 20;
        inRun = false;
        largestLength = 0;      //Sets var values 
        largestCount = 0;
        length = 0;
        count = 0;
        stall = new boolean[amtOfStalls];
        for (int i = 0; i < amtOfStalls; i++) {
            stall[i] = false;
        }
    }

    public U6P03(int stalls) {               //1 Arg Constuctor 
        amtOfStalls = stalls;
        inRun = false;
        largestCount = -1;
        largestLength = 0;         //Sets var values 
        length = 0;
        count = -1;
        stall = new boolean[amtOfStalls];
        for (int i = 0; i < amtOfStalls; i++) {
            stall[i] = false;
        }
    }

    public void findStall() {

        for (int i = 0; i < stall.length; i++) {
            if (inRun && stall[i]) {                      //Marks the end of the run and checks if the length of the empty stalls is larger than the largest length of empty stalls
                inRun = false;
                if (length >= largestLength) {
                    largestLength = length;
                    largestCount = count;
                }
            }

            else if (!inRun && !stall[i]) {          //Starts a run if a stall is empty 
                inRun = true;
                count = i;
                length = 1;
            }
            else if (inRun && !stall[i]) {     //Adds to the length if stall is not occupied and is still in a run
                length += 1;
            }
        }

        if (inRun) {
            if (length >= largestLength) {            //Final check to see if in run is still true 

                largestLength = length;
                largestCount = count;
            }
        }

        stallToChange = (largestLength - 1) / 2 + largestCount;
        stall[stallToChange] = true;
        System.out.println();
        for (int x = 0; x < stall.length; x++) {               //Printer 
            if (stall[x] == true) {
                System.out.print("X");
            } 
            else {
                System.out.print("_");
            }
        }
    }



}
