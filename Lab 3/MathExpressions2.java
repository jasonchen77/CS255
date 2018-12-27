//**********************************************************************
// <Jason Chen> 
//**********************************************************************

import java.util.Scanner;

public class MathExpressions2
{ 

  public static void main(String[] args)
  {

    Scanner in = new Scanner(System.in);

   System.out.print("Please enter the temperature in Celsius: ");             // Prompt for temperature in Celsius
   int celsius = in.nextInt();                                                // Get temperature in Celsius
   double fahrenheit = (((double)9/(double)5) * celsius) + 32;                // Conversion to Fahrenheit
   System.out.println("Temperature in Celsius is: " + celsius);               // Display temperature in Celsius
   System.out.printf("Temperature in Fahrenheit is: " + "%.2f", fahrenheit);  // Display temperature in Fahrenheit
    
    
  }
}
