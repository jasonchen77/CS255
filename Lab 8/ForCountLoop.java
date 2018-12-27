//**********************************************************************
// <Jason Chen> 
//**********************************************************************

import java.util.Scanner;

public class ForCountLoop
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.println("Please enter a positive integer limit.");
      int n = in.nextInt();
      int count;
      int sum = 0;
      for (count = 0; count <= n; count++)
      {
         sum = sum + count;
         
      }
      System.out.println("sum = " + sum);
  
   }
  
}
