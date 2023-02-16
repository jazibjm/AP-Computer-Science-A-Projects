public class Square
{
   int width;  //Instance vars 
   int height;
   
   public Square(int w)  
   {
      width = w;
      height = w;
   }
   
   public Square(int w, int h)  
   {
      width = w;
      height = h;
   }
   
   public int area() //calls getarea with width and height 
   { 
      return getArea(this.width, this.height);
   }
   
   private int getArea(int w, int h)   //actual method
   {
      if(w == 0)  //Returns 0 once at that stage 
      {
         return 0;
      }
      else
      {
         Square r = new Square(w - 1, h);  //Creates new rect with 1 less width 
         int small = r.area();              //sets small to area
         return 1 * h + small;   
      }
   }
}