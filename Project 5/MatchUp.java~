//***************************************************************************
//
// Jason Chen
// CMSC 255 Section 901
// Project 5 MatchUp
// This program will read and display a file with braces numbered.
// It will prompt for input of file name and display the mismatched braces.
//***************************************************************************
import java.io.*;
import java.util.Scanner;

public class MatchUp
{

// This program will display matching braces.
// 
private static void printHeading(){
String name = "Jason Chen";
System.out.println(name);
System.out.println("CMSC 255 Spring 2014");
System.out.println("Programming Project 5");
System.out.println("MatchUp");
System.out.println();
}

public static void main (String[] args) throws IOException
{
printHeading(); 

Scanner in = new Scanner(System.in);

String fileName;                                              // Declare variable
System.out.println("Please input file name.");                // Prompt for input
fileName = in.nextLine();  
printFile(fileName);                                          // Input file name


}
public static void printFile(String fileName){               // Input file method
try{                                                        
Scanner inFile = new Scanner(new FileReader(fileName));       
int j=0;                
boolean containsBrace=false;

while (inFile.hasNextLine()) {                                 // While loop condition{
  String line = inFile.nextLine();                            // Declare and initialize variable
  char brace = 'a';                                           // Declare variable
  for (int i=0; i<line.length(); i++){                        // Read every character by line
    brace = line.charAt(i);
    if (brace == '{'){                                        // If find "{" increment by 1
    j++;
    containsBrace=true;
    
    }
    
    else if (brace == '}'){                                   // If find "}" decrement by 1
      containsBrace=true;
      if(j!=0)
      {j--;}
    }
    
  }
  if(containsBrace)
  System.out.println(line+" "+j);                             // Print line with number of braces
  else 
    System.out.println(line);
  containsBrace=false;
  }
}catch(Exception e){System.out.println(e);};

}





}