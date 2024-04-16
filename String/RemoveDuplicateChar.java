/*Write a Java program to remove duplicate characters from a given string that appeared in  
    another given string. 

Given String 1: The patient had died before the doctor came.
Given String 2: hospital
Output-->e en d ded befre e dcr cme.

Given String 1: THERE is no EEE LAB in 9 th Floor.
Given String 2: Table
Output-->HR is no   in 9 h Foor.
*/
import java.util.Scanner;

public class RemoveDuplicateChar{
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    //String s1="The patient had died before the doctor came.";
    //String s2="hospital";
   
    String newS="";
    for (int i=0; i<s1.length(); i++){
      boolean isUnique=true;
      
      char c1=s1.charAt(i);
      if ( (int)c1>= 65 && (int)c1 <= 90){
          c1=(char)((int)c1+32);
        }
      
      for (int j=0; j<s2.length(); j++){
        char c2=s2.charAt(j);
        if ( (int)c2>= 65 && (int)c2 <= 90){
          c1=(char)((int)c1+32);
        }
        if (c1==c2){
          isUnique=false;
          break;
        }  
      }
      if (isUnique==true){
        newS+=s1.charAt(i);
      }
    }
    System.out.print(newS);
  }
}