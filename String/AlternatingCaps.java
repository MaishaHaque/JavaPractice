                        /*
Write a Java program that takes a sentence as user input and displays the sentence in 
    aLtErNaTiNg CaPs format. Note that, you have to ignore spaces and other punctuations while  
    altering the characters. Also, your new sentence will always start with lowercase letters.
inp-->Hello World!
output-->hElLo WoRlD!
inp-->I love Java String Problems. Those are easy.
output-->i LoVe JaVa StRiNg PrObLeMs. ThOsE aRe EaSy.
*/

import java.util.Scanner;

public class AlternatingCaps{
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    //String s="I love Java String Problems. Those are easy";
    String newS="";
    boolean lower=true;
    for (int i=0; i<s.length(); i++){
      if(lower==true){
        if ((int)s.charAt(i)>=65 && (int)s.charAt(i)<=90){
          newS+=(char)((int)s.charAt(i)+32);
        }
        else{
          newS+=s.charAt(i);
        }
        lower=false;
      }
      else{
        if ((int)s.charAt(i)>=97 && (int)s.charAt(i)<=122){
          newS+=(char)((int)s.charAt(i)-32);
        }
        else{
          newS+=s.charAt(i);
        }
        lower=true;
      }
    }
    System.out.print(newS);
  }
}