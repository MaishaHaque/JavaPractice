/*Write a Java program that will take two Strings as user input and print the number of times the 
    second String occurs in the first String.

*/

import java.util.Scanner;

public class SubstringCount{
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    //String s1="Fox ran over the box.";
    //String s2="ox";
    
    int count=0;
    for (int i=0; i<s1.length(); i++){
      boolean isUnique=false;
      String newS="";
      if (s1.charAt(i) ==s2.charAt(0)){
        int newi=i;
        for (int j=0; j<s2.length(); j++){
          newS+=s1.charAt(newi);
          newi++;
        }
        if (newS.equals(s2)){
          count++;
        }
        
      }  
    }
    System.out.print("Occurrence: "+ count);
  }
}