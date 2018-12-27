//**********************************************************************
// <Jason Chen> 
//**********************************************************************

public class Expressions 
{
  public static void main(String[] args)
  {
    int a = 3;
    int b = 4;
    int c = 5;
    int d = 17;
    
    System.out.println((a + b) / c);   
// 3 and 4 are added with sum 7       
// 7 is divided by 5 with quotient 1 
    
    System.out.println(a + b / c);       
// 4 is divided by 5 with quotient 0       
// 3 is added to 0 with sum 3
    
    System.out.println(a++);                      // 3 increases by 1 will show in next statement, returns 3 in this statement
    System.out.println(a--);                      // 3 decrease by 1, returns 4 from previous assignment
    System.out.println(a + 1);                    // 3 plus 1 equals 4
    System.out.println(d % c);                    // 17 divide by 5 with remainder 2
    System.out.println(d / c);                    // 17 divide by 5 with quotient 3
    System.out.println(d % b);                    // 17 divide by 4 with remainder 1
    System.out.println(d / b);                    // 17 divide by 4 with quotient 4
    System.out.println(d + a / d + b);            // 3 divide by 17 with quotient 0 and plus 17 plus 4 equals 21
    System.out.println((d + a) / (d + b));        // sum of 17 and 3 divide by sum of 17 and 4 with quotient 0
    System.out.println(Math.sqrt(b));             // Squareroot of 4 gives 2
    System.out.println(Math.pow(a, b));           // 3 to 4th power gives 81
    System.out.println(Math.abs(-a));             // Absolute value of -3 equals 3
    System.out.println(Math.max(a, b));           // The larger number of 3 and 4, returns 4
  } 
} 