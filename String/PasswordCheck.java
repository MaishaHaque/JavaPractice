/*Write a Java program that takes a string as input and determines whether the string qualifies as 
    a strong password. A strong password is defined by the following criteria:

The password must be at least 8 characters long.
The password must contain characters at least one - 
Uppercase letters (A-Z)
Lowercase letters (a-z)
Digits (0-9)
Special characters (e.g., !, @, #, $, etc.)
   Print ‘True’ if the password is strong, and ‘False’ otherwise. You may consider any character 
   excluding the alphabet, digit, and space as special characters.
   
input-->StrongPass123!
output-->True
input-->Weak123
output-->False
*/

import java.util.Scanner;

public class PasswordCheck{
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    //String s = sc.nextLine();
    String s="Weak123";
    boolean length=true, upper=false,lower=false,digit=false,special=false;
    if (s.length()<8){
      length=false;
    }
    else{
      for (int i=0; i<s.length(); i++){
        if (((int)s.charAt(i)>=65 && (int)s.charAt(i)<=90) && upper==false){
          upper=true;
        }
        else if (((int)s.charAt(i)>=97 && (int)s.charAt(i)<=122) && lower==false){
          lower=true;
        }
        else if (((int)s.charAt(i)>=30 && (int)s.charAt(i)<=39) && digit==false){
          digit=true;
        }
        else if (s.charAt(i) != ' ' && special==false){
          special=true;
        }
      }
    }
    
    if ( length==true && upper==true && lower==true && digit==true && special==true){
      System.out.print("Strong");
    }
    else{
      System.out.print("Weak");
    }
  }
}