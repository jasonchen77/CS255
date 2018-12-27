//**********************************************************************
// <Jason Chen> 
//**********************************************************************

import java.util.Scanner;

public class PrintStrings
{ 

  public static void main(String[] args)
  {

    Scanner in = new Scanner(System.in);
    
    System.out.println("Please enter two words.");       // Prompt for words
    String string1 = in.next();                          // Enter string 1
    String string2 = in.next();                          // Enter string 2
    if (string1.compareTo(string2) < 0)                  // If string 1 is negative compare to string 2
    {
      System.out.println(string1 + " " + string2);       // Display string 1 then string 2
    }
    else
    {
      System.out.println(string2 + " " + string1);       // Display string 2 then string 1
    }
    
      
      
    
  }
}
