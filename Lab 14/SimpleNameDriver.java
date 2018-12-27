//******************************************************************
//Jason Chen
//
// SimpleNameDriver application
// This application prompts the user for a name and displays it in 
// two different formats
//******************************************************************
import java.util.Scanner;

public class SimpleNameDriver { 
public static void main(String[] args)  {
    SimpleName testName;       // Declare a name
    
    Scanner keyIn = new Scanner(System.in);
    System.out.print("Enter first name: ");      // Prompt for first name
    String first = keyIn.nextLine();             // Get first name
      
    System.out.print("Enter last name: ");       // Prompt for last name
    String last = keyIn.nextLine();                        // Get last name
      
    System.out.print("Enter middle name: ");     // Prompt for middle name
    String middle = keyIn.nextLine();                      // Get middle name
    
    testName = new SimpleName(first, last, middle);
    
    // First format
    System.out.println("Name in first-last format is " +  testName.getFirstLast());
                                    
    // Second format
    System.out.println("Name in last-first-initial format is " + testName.getLastFirstMI());
    
    // Initial format
    System.out.println("Name in initial format is " + testName.getInitials());
                                   
  }
}