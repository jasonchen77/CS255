//***************************************************************************
//
// Jason Chen
// CMSC 255 Section 901
// Project 2 Selection
// This program will calculate the diameter, circumference, or area of a circle.
//***************************************************************************
import java.util.Scanner;

public class Selection
{

// This program will calculate the diameter, circumference, or area of a circle.
// 
private static void printHeading(){
String name = "Jason Chen";
System.out.println(name);
System.out.println("CMSC 255 Spring 2014");
System.out.println("Programming Project 2");
System.out.println("Selection");
System.out.println();
}

public static void main (String[] args){
printHeading(); 


    Scanner in = new Scanner(System.in);
    
    double radius = 0;
    double diameter = 0;
    double circumference = 0;
    double area = 0;
  
    
    System.out.println("Please enter a radius in floating-point form.");                                   // Prompt for radius
    if (in.hasNextDouble())
    {
    radius = in.nextDouble();                                                                              // Enter radius
    System.out.println("Please enter D, C, or A for Diameter, Circumference, or Area.");                   // Prompt for type
    if (in.hasNext())
    {
    String type = in.next();                                                                               // Enter D, C, or A
    if (type.equals("D"))                                                                                  // If type is D
    {
      diameter = 2 * radius;                                                                               // Formula for diameter
      System.out.println("The diameter of a circle with radius " + radius + " is " + diameter);            // Display radius and diameter
    }
    else if (type.equals("C"))                                                                             // If type is C
    {
      circumference = 2 * Math.PI * radius;                                                                // Formula for circumference
      System.out.println("The circumference of a circle with radius " + radius + " is " + circumference);  // Display radius and circumference
    }
    else if (type.equals("A"))                                                                             // If type is A
    {
      area = Math.PI * Math.pow(radius, 2);                                                                // Formula for area
      System.out.println("The area of a circle with radius " + radius + " is " + area);                    // Display radius and area
    }
    else 
    {
      System.out.println("Input needs to D, C, or A.");
    }
    }
    
    else { System.out.println("Needs to be a String.");}
}
    else { System.out.println("Needs to be a floating-point number.");}




}
}