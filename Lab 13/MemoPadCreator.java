//**********************************************************************
// <Jason Chen> 
//**********************************************************************

import java.io.*;
import java.util.Scanner;
import java.util.Date;

public class MemoPadCreator
{
   public static void main(String[] args) throws FileNotFoundException
   {
      Date now = new Date();
      Scanner console = new Scanner(System.in);
      System.out.print("Output file: ");
      String filename = console.nextLine();

      PrintWriter out = new PrintWriter(filename);

      boolean done = false;
      while (!done)
      {
         System.out.println("Memo topic (enter -1 to end):");
         String topic = console.nextLine();
         if (topic.equals("-1"))
         {
            done = true;
         }
         else
         {
            System.out.println("Memo text:");
            String message = console.nextLine();
            Date dateStamp = now;      // Create the new date object and obtain a dateStamp
           
            out.println(topic);
            out.println(dateStamp);
            out.println(message);
         }
      }
      out.close();// Close the output file
   }
}
