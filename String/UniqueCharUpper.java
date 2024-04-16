/*Write a Java program that takes two strings (lowercase) as user input. Your task is to concat 
    the two strings except the common characters present in the strings. Then print the modified  
    string (uppercase). You can assume that each string will only contain unique characters; that 
    means there will be no duplicate characters in a particular string.
inp-->abcd
      bdgc
output-->AG
inp-->arose
      rail
output-->OSEIL
*/

import java.util.Scanner;

public class UniqueCharUpper{
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    //String s1="arose";
    //String s2="rail";
    
    String s=s1+s2;
    String newS="";
    for (int i=0; i<s.length(); i++){
      boolean isUnique=true;
      for (int j=0; j<s.length(); j++){
        if ((s.charAt(i)==s.charAt(j)) && i!=j){
          isUnique=false;
        }  
      }
      if (isUnique==true){
        newS+=(char)(((int)s.charAt(i))-32);
      }
    }
    System.out.print(newS);
  }
}