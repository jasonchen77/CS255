//******************************************************************
//Jason Chen
//
// This class provides an employee record object. The provided
// constructor takes the employee name as three strings, and 
// creates a SimpleName data member. It also accepts the pay rate as 
// a double. 
// A class method returns the total pay.
//******************************************************************
import java.text.DecimalFormat;
import java.lang.Double;

class Employee{
  private SimpleName myName;              // Employee name field
  private double rate;                    // Payrate
  static double total = 0.0;          // Total pay for all employees
  private double employeeHours;
  
  public Employee (String first, String last, String middle, double payrate) {
    // Initialize fields
    myName = new SimpleName(first, last, middle);
    rate = payrate;
  }

  // Returns employee name
  public String getName() {
    return myName.getLastFirstMI();
  }
  
  // Calculates and returns employee wages for the given hours
  public double getPay(double hours) {
    employeeHours = hours;
   double wages = (double)((int)(hours * rate * 100.0 + 0.5))/100;
    total = total + wages;
    return wages;
  }
  
  // Returns total wages for all employees
  public static double totalPay() {
    return total;
  }
  
  // Returns hours worked
  public double hoursWorked(){
    DecimalFormat df = new DecimalFormat("#.##");
    String emp=df.format(employeeHours);
    double dEmp = Double.parseDouble(emp);
    return dEmp;
  }
}