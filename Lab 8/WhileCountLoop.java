//**********************************************************************
// <Jason Chen> 
//**********************************************************************

import java.util.Scanner;

public class WhileCountLoop
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.println("Please enter a positive integer limit.");
      int n = in.nextInt();
      int count = 0;
      int sum = 0;
      while (count <= n)
      {
         sum = sum + count;
         count++;
      }
      System.out.println("sum = " + sum);
  
   }
  
}
