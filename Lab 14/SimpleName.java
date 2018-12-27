//******************************************************************
//Jason Chen
//
// This class provides a basic, immutable name object.  A second 
// constructor allows creation of a name from strings. Methods 
// return the name in various formats.
//******************************************************************
import java.io.*;                      // Package for stream readers
import java.util.Scanner;

public class SimpleName {
    private String first;                      // Person's first name
    private String last;                       // Person's last name
    private String middle;                     // Person's middle name
    
    // Gets a name from System.in
    public SimpleName() {
      first = " ";                      
      last = " ";                        
      middle = " ";
    }
    
    // Assigns String parameters to instance variables
    public SimpleName(String firstName, String lastName, String middleName){
      first = firstName;                           // Assign parameters to fields
      last = lastName;
      middle = middleName;
    }
    
    // Returns name in first last format
    public String getFirstLast() {
      return first + " " + last;
    }
    
    // Returns full name in usual format
    public String full() {
      return first + " " + middle + " " + last;
    }
    
    // Returns name as last, first, m.
    public String getLastFirstMI() {
      return last + ", " + first + ", " + middle.substring(0, 1) + ".";
    }
    
    // Return initials
    public String getInitials(){
      return first.substring(0, 1) + middle.substring(0, 1) + last.substring(0, 1);
    }
    
    //returns first name
    public String getFirstName() {
     return first;
    }
    
    //returns last name
    public String getLastName() {
     return last;
    }
    
    //returns middle name
    public String getMiddleName() {
     return middle;
    }
    
 // Tests for equality
    public boolean equals(Object otherName) {
     if(otherName instanceof SimpleName){
      SimpleName other = (SimpleName)otherName;
       return 
     first.equals(other.getFirstName()) &&
     middle.equals(other.getMiddleName()) && 
     last.equals(other.getLastName());
   }   
   else return false;
    }

  }