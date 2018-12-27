//******************************************************************
//Jason Chen
//
// Payroll application
// This application computes the pay for three employees 
// and also outputs the total pay
//******************************************************************

import java.util.Scanner;


public class Payroll {     
  public static void main(String[] args){
    // Declare employees
    Employee emp1; 
    Employee emp2;
    Employee emp3;
    Employee emp4;
    
    // Instantiate employees
    emp1 = new Employee("Herman", "Herrmann", "George", 14.95);
    emp2 = new Employee("Clara", "Eames", "Julia", 16.28);
    emp3 = new Employee("Matilda", "Hagen", "Louise", 12.73);
    emp4 = new Employee("Jason", "Chen", "Luke", 15.00);
    
    Scanner in = new Scanner(System.in);
    
    // Prompt and read hours worked for each employee
    System.out.print("Enter hours worked by " + emp1.getName() + ": ");
    // Get hours worked and convert from string to double
    double hours1 = in.nextDouble();          
    System.out.print("Enter hours worked by " + emp2.getName() + ": ");
    double hours2 = in.nextDouble();                   
    System.out.print("Enter hours worked by " + emp3.getName() + ": ");
    double hours3 = in.nextDouble();  
    System.out.print("Enter hours worked by " + emp4.getName() + ": ");
    double hours4 = in.nextDouble();
    
    // Output pay for each employee
    System.out.println("\n This week's payroll is:");
    System.out.println("Pay " + emp1.getName() + " $" + emp1.getPay(hours1) + " " + emp1.hoursWorked());
    System.out.println("Pay " + emp2.getName() + " $" + emp2.getPay(hours2) + " " + emp2.hoursWorked());
    System.out.println("Pay " + emp3.getName() + " $" + emp3.getPay(hours3) + " " + emp3.hoursWorked());
    System.out.println("Pay " + emp4.getName() + " $" + emp4.getPay(hours4) + " " + emp4.hoursWorked());
    
    // Output total pay for all employees
    System.out.println("Total pay is $" + Employee.totalPay());
    
    printAveragePay();
  }
    // Average pay
    public static void printAveragePay()
    {
      double averagePay;
     averagePay = Employee.totalPay() / 4;
      System.out.println("Average pay is: $" + averagePay);
  }
}

