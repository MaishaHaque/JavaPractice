//Write a Java program that takes a string as input and reverses the order of words in it
//inp--> CSE110 is easy
//output-->easy is CSE110


import java.util.Scanner;

public class ReverseWordString{
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    //String s="CSE110 is easy";
    String word="";
    String reverse="";
    for (int i=0; i<s.length(); i++){
      if (s.charAt(i) != ' '){
        word+=s.charAt(i);
      }
      else{
        reverse=word+' '+reverse;
        word="";
      }
    }
    reverse=word+' '+reverse;
    System.out.println(reverse);
  }
}
