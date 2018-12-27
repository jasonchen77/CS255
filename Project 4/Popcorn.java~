//***************************************************************************
//
// Jason Chen
// CMSC 255 Section 901
// Project 4 Popcorn
// This program will read and display a file with line number.
// It will prompt for input of file name and display the file and a bar chart.
//***************************************************************************
import java.io.*;
import java.util.Scanner;

public class Popcorn
{

// This program will display a bar chart.
// 
private static void printHeading(){
String name = "Jason Chen";
System.out.println(name);
System.out.println("CMSC 255 Spring 2014");
System.out.println("Programming Project 4");
System.out.println("Popcorn");
System.out.println();
}

public static void main (String[] args) throws IOException
{
printHeading(); 

Scanner in = new Scanner(System.in);

String fileName;                                              // Declare variable
System.out.println("Please input file name.");                // Prompt for input
fileName = in.nextLine();  
printFile(fileName);                                          // Input file

System.out.printf("%50s\n", "Popcorn Co-op");                 // Print title and header
System.out.printf("%70s\n", "Production in Hundreds");
System.out.printf("%70s\n", "of Pint Jars per Acre");
System.out.printf("%1s", "Farm Name"); 
System.out.printf("%70s\n", "   1   2   3   4   5   6");
System.out.printf("%55s", "");
for (int i=1; i<19; i++)
{System.out.printf("-");
  if (i%3==0)
  {System.out.print("|");}
}

System.out.println("");                                     // Output data
data("Orville's Acres", 114.8, 43801);
data("Hoffman's Hills", 77.2, 36229);
data("Jiffy Quick Farm", 89.2, 24813);
data("Jolly Good Plantation", 183.2, 104570);
data("Organically Grown Inc.", 45.5, 14683);




}

public static void printFile(String fileName){                // Print file method
try{                                                        
Scanner inFile = new Scanner(new FileReader(fileName));       
                                                  

while (inFile.hasNextLine())                                  // While loop condition
{
  
  String line = inFile.nextLine();                            // Declare and initialize variable
  System.out.println(line);
}
}catch(Exception e){System.out.println(e);};                  // Catch exception

}

public static void data(String farmName, double acres, int jars){  // Print chart method
  
  Scanner in = new Scanner(System.in);
  
  
  
  int stars = jars/(int)acres/25;                                  // Calculate number of stars
  System.out.printf("%-30.30s %-24.24s", farmName, "");
  
  for(int i=0;i<stars;i++)                                        // Loop
  {  
    System.out.print("*");
    
    if (i==18)
    {  System.out.print("#");}                                    // Print # if greater than 20
  }
    if (stars<19)                                                 // Print | at 5 mark
    {
      System.out.print("\t");
      System.out.printf("%3s", "|");
    }
 System.out.println("");
}



}