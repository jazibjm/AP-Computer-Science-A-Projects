public class U1E01
{
   public static void main(String [] args)
   {
   final double paperWidth = 8.5;  //Makes int for paper width and length
   final double paperLength = 11;
   final double millimeterperInch = 25.4;
   final double paperWidthMM = paperWidth * millimeterperInch;       //transforms paper length and width from inches to millimeters
   final double paperLengthMM = paperLength * millimeterperInch;
   System.out.println("The paper width in millimeters is " + paperWidthMM);       //prints out the final answers
   System.out.println("The paper length in millimeters is " + paperLengthMM);

   }
}