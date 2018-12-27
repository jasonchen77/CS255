//**********************************************************************
// <Jason Chen> 
//**********************************************************************

// string1 = apple  string1 = cat   string1 = beer   string1 = beer   string1 = apple  string1 = cat   string1=beer   string1=beer   string1=apple
// string2 = beer   string2 = beer  string2 = apple  string2 = cat    string2 = cat    string2 = apple string2=beer   string2=apple  string2=beer
// string3 = cat    string3 = apple string3 = cat    string3 = apple  string3 = beer   string3 = beer  string3=apple  string3=beer   string3=beer
import java.util.Scanner;

public class MiddleString
{ 

  public static void main(String[] args)
  {

    Scanner in = new Scanner(System.in);
    
    System.out.println("Please enter two words.");       // Prompt for words
    String string1 = in.next();                          // Enter string 1
    String string2 = in.next();                          // Enter string 2
    String string3 = in.next();                          // Enter string 3
    if ((string1.compareTo(string2) < 0) && (string2.compareTo(string3) < 0))                  
    {
      System.out.println(string2);       // Display string 2
    }
    else if ((string2.compareTo(string1) < 0) && (string1.compareTo(string3) < 0))
    {
      System.out.println(string1);       // Display string 1
    }
    else if ((string2.compareTo(string3) < 0) && (string3.compareTo(string1) < 0))
    {
      System.out.println(string3);       // Display string 3
    }
    else if ((string1.compareTo(string2) < 0) && (string3.compareTo(string1) < 0))
    {
      System.out.println(string1);       // Display string 1
    }  
    else if ((string3.compareTo(string2) < 0) && (string2.compareTo(string1) < 0))
    {
      System.out.println(string2);       // Display string 2
    }
      else if ((string1.compareTo(string2) < 0) && (string1.compareTo(string3) < 0))
    {
      System.out.println(string3);       // Display string 3
    }
      else if (string2.equals(string3))
    {
      System.out.println(string2);       // Display string 2
    }
     else if (string1.equals(string3))
    {
      System.out.println(string1);       // Display string 1
    }
      else if (string1.equals(string2))
    {
      System.out.println(string2);       // Display string 2
    }
      
    
  }
}
