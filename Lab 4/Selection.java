//**********************************************************************
// <Jason Chen> 
//**********************************************************************

import java.util.Scanner;

public class Selection
{ 

  public static void main(String[] args)
  {

    Scanner in = new Scanner(System.in);

   System.out.print("Enter a single letter, and I will tell you what the corresponding digit is on the telephone.");  // Prompt for a letter
   char letter = in.next().charAt(0);                                                                                 // Get letter input
    if (letter == 'A' || letter == 'B' || letter == 'C')                                                              // If input is A,B, or C
   { System.out.println("The digit 2 corresponds to the letter " + letter + " on the telephone.");}                   // Display 2
   else if (letter == 'D' || letter == 'E' || letter == 'F')                                                          // If input is D,E, or F
   { System.out.println("The digit 3 corresponds to the letter " + letter + " on the telephone.");}                   // Display 3
   else if (letter == 'G' || letter == 'H' || letter == 'I')                                                          // If input is G, H, or I
   { System.out.println("The digit 4 corresponds to the letter " + letter + " on the telephone.");}                   // Display 4
   else if (letter == 'J' || letter == 'K' || letter == 'L')                                                          // If input is J, K, or L
   { System.out.println("The digit 5 corresponds to the letter " + letter + " on the telephone.");}                   // Display 5
  else if (letter == 'M' || letter == 'N' || letter == 'O')                                                           // If input is M, N, or O
   { System.out.println("The digit 6 corresponds to the letter " + letter + " on the telephone.");}                   // Display 6
   else if (letter == 'P' || letter == 'Q' || letter == 'R' || letter == 'S')                                         // If input is P, Q, R, or S
   { System.out.println("The digit 7 corresponds to the letter " + letter + " on the telephone.");}                   // Display 7                          
   else if (letter == 'T' || letter == 'U' || letter == 'V')                                                          // If input is T, U, or V
   { System.out.println("The digit 8 corresponds to the letter " + letter + " on the telephone.");}                   // Display 8                          
   else if (letter == 'W' || letter == 'X' || letter == 'Y' || letter == 'Z')                                         // If input is W, X, Y, or Z
   { System.out.println("The digit 9 corresponds to the letter " + letter + " on the telephone.");}                   // Display 9
   else if (letter >= 'a' && letter <= 'z')
   { System.out.println("Uppercase letter only.");}
   else
   {System.out.println("No matching digit for non-alphabetic character.");}                                           // If input is everything else, display this message
                                                
                                          
    
  }
}
