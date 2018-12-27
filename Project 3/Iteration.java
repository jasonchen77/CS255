//***************************************************************************
//
// Jason Chen
// CMSC 255 Section 901
// Project 3 Iteration
// This program will read and display a file with line number.
// It will prompt for input of file name and display the file.
//***************************************************************************
import java.io.*;
import java.util.Scanner;

public class Iteration
{

// This program will read and display a file with line number.
// 
private static void printHeading(){
String name = "Jason Chen";
System.out.println(name);
System.out.println("CMSC 255 Spring 2014");
System.out.println("Programming Project 3");
System.out.println("Iteration");
System.out.println();
}

public static void main (String[] args) throws IOException
{
printHeading(); 

Scanner in = new Scanner(System.in);

String fileName;                                              // Declare variable
System.out.println("Please input file name.");                // Prompt for input
fileName = in.nextLine();                                     // Input file name

try{                                                        
Scanner inFile = new Scanner(new FileReader(fileName));       
int i = 1;                                                    // Declare and initialize variable

while (inFile.hasNextLine())                                  // While loop condition
{
  
  String line = inFile.nextLine();                            // Declare and initialize variable
  if (line.length() > 5)                                      // Condition
  {
    System.out.printf("%2d %2.2s %20s%n", i , "." , line);    // Output if condition is met
  i++;                                                        // Counter
  }
  else {System.out.println("");}                              // Output if condition not met
  
}
}catch(Exception e){System.out.println(e);};

}
}
