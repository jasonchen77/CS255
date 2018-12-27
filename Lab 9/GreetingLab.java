//**********************************************************************
// <Jason Chen> 
//**********************************************************************

import java.io.*;
import java.util.Scanner;

public class GreetingLab {
   public static void main(String[] args) throws IOException    {
 String title;
 String firstName;
 String lastName;
 Scanner in;
 
 in = new Scanner(System.in);
  
 System.out.print("Enter a title:");
 title = in.next();
 
 System.out.print("Enter your first name:");
 firstName = in.next();
 
 System.out.print("Enter a your last name:");
 lastName = in.next();
 
 greeting(title,firstName,lastName);  // Call to method
 
 }
   public static void greeting(String title, String firstName, String lastName)
   {
     System.out.println(" ");
     System.out.println("Dear " + title + firstName + lastName);
     System.out.println(" ");
      
     
   }

}

