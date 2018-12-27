//**********************************************************************
// <Jason Chen> 
//**********************************************************************

public class StringEqual 
{ 
 public static void main(String[] args) 
 { 
 String str1 = "abcd";                               // Declare and initialize string 1
 String str2 = "abcdefg";                            // Declare and initialize string 2
 String str3 = str1 + "efg";                         // Declare and initialize string 3
 System.out.println("str2 = " + str2);               // Output string 2
 System.out.println("str3 = " + str3);               // Output string 3
 if (str2.equals(str3))                              // If string 2 equals string 3
 System.out.println("The strings are equal");        // Ouput message strings are equal
 else 
 System.out.println("The strings are not equal");    // Output message strings are not equal
 } 
}  