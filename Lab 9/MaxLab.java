//**********************************************************************
// <Jason Chen> 
//**********************************************************************

import java.io.*;
import java.util.Scanner;

public class MaxLab {
   public static void main(String[] args) throws IOException    {
 String inputLine;
 int number1;
 int number2;
 Scanner in;
 
 in = new Scanner(System.in);
  
 System.out.print("Enter first number:");
 number1 = in.nextInt();
  
 
 System.out.print("Enter second number:");
 number2 = in.nextInt();
  
 // Calls max method inside the parameter of println method call.
 System.out.println("The largest number is " +  max(number1,number2));
 
 }
 
   public static int max(int number1, int number2)
   {
     if (number1 > number2)
     return number1;
   else
     return number2;
   }
}
