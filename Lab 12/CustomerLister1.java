//**********************************************************************
// <Jason Chen> 
// CMSC 255 - 901
//**********************************************************************
import java.util.Arrays;
import java.util.Scanner;

public class CustomerLister1
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
 
      String[] customerName = new String[7];
      customerName[0] = "Chris";
      customerName[1] = "Lois";
      customerName[2] = "Meg";
      customerName[3] = "Peter";
      customerName[4] = "Stewie";
      
      for (String element : customerName)
     {
       System.out.println(element);
     }
      System.out.println("");
      
      int currentSize = 5;
      if (currentSize < customerName.length)
      {
        currentSize++;
        for (int i = currentSize - 1; i > 3; i--)
        {customerName[i] = customerName[i -1];}
        customerName[3] = "Meg";
      }
      currentSize = 6;
      if (currentSize < customerName.length)
      {
        currentSize++;
        for (int i = currentSize - 1; i > 3; i--)
        {customerName[i] = customerName[i -1];}
        customerName[4] = "Brian";
      }
      
      String searchValue = "Meg"; 
      int pos = 0;
      boolean found = false;
      currentSize = 7;
      for (int pos2 = 0; pos < customerName.length && !found; pos++)
      {
      for (pos = 0; pos < customerName.length && !found;)
      {
        if (customerName[pos] == searchValue)
        {found = true;}
        else
        {pos++;}
        if (found)
        {
          for (int i = pos; i < currentSize - 1; i++)
          {customerName[i] = customerName[i + 1];}
          currentSize--;
        }
      }
      }
      searchValue = "Meg"; 
      pos = 0;
      found = false;
      currentSize = 6;
      for (pos = 0; pos < customerName.length && !found;)
      {
        if (customerName[pos] == searchValue)
        {found = true;}
        else
        {pos++;}
        if (found)
        {
          for (int i = pos; i < currentSize - 1; i++)
          {customerName[i] = customerName[i + 1];}
          currentSize--;
        }
      }
        
     for (String element : customerName)
     {
       System.out.println(element);
     }
      
      
   }
}