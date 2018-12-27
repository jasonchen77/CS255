//**********************************************************************
// <Jason Chen> 
//**********************************************************************

import java.util.Scanner;

public class NestedCountLoop
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.println("Please enter a positive integer limit.");
      int n = in.nextInt();
      int count = 1;
      int sum = 0;
      int count2 = 1;
      
     
      for (count2 = 1; count2 <= n; count2++)
      {
      for (count = 1; count <= count2; count++)
      {
       
         sum = sum + count;
         
      System.out.println("The sum of the positive integers from 1 to " + count + " is " + sum);
     
      }
      sum = 0;
      }
   }
  
}