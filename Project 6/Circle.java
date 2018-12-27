//***************************************************************************
//
// Jason Chen
// CMSC 255 Section 901
// Project 6 Circle
// This program will find the diameter, circumference, and area of a circle.
//***************************************************************************
import java.io.*;
import java.util.Scanner;

public class Circle
{

// This program will find the diameter, circumference, and area of a circle.
// 
private static void printHeading(){
String name = "Jason Chen";
System.out.println(name);
System.out.println("CMSC 255 Spring 2014");
System.out.println("Programming Project 6");
System.out.println("Circle");
System.out.println();
}

private double radius;                                    // Radius
private double diameter;                                // Diameter
private double circumference;                  // Circumference
private double area;                        // Area
private String s;

public Circle (double circleRadius)
{
  radius = circleRadius;
}

public double getDiameter()
{
  diameter = 2 * radius;
}
public double getCircumference()
{
  circumference = 2 * Math.PI * radius;
}
public double getArea()
{
  area = Math.PI * Math.pow(radius, 2);
}
//public String toString()
{
//  s = radius.toString();
}

}