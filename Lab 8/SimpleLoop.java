//**********************************************************************
// <Jason Chen> 
//**********************************************************************

public class SimpleLoop
{
   public static void main(String[] args)
   {
      int i = 6;                               // Declare and initialize i
      int limit = 99;                          // Declare and initialize limit
      while (i < limit)                        // While i is less than limit
      {
         System.out.println("i = " + i);       // Output
         i = i + 2;                            // i is increase by 1 each time it go through the loop
      }
   }
}
