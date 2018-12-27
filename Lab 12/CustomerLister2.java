//**********************************************************************
// <Jason Chen> 
// CMSC 255 - 901
//**********************************************************************
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerLister2
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
 
      ArrayList<String> customerName = new ArrayList<String>();
      customerName.add("Chris");
      customerName.add("Lois");
      customerName.add("Meg");
      customerName.add("Peter");
      customerName.add("Stewie");
      
      
      for (String element : customerName)
     {
       System.out.println(element);
     }
      System.out.println("");
      
     customerName.add(3, "Brian");
     customerName.add(2, "Meg");
     
        
     for (String element : customerName)
     {
       System.out.println(element);
     }
      
     System.out.println("");
      
      String searchValue = "Meg"; 
      int pos = 0;
      boolean found = false;
      
      for (pos = 0; pos < customerName.size() && !found;)
      {
        if (customerName.get(pos).equals(searchValue))
        {found = true;
         customerName.remove(pos);}
        else
        {pos++;}
        if (found)
        {
          customerName.remove(pos);
        }
      }
      
      
       for (String element : customerName)
     {
       System.out.println(element);
     }
      
      
   }
}