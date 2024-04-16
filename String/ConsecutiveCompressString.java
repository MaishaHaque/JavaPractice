//Write a Java program that has a given string and prints a compressed version of the string by counting the consecutive occurrences of each character.
//inp-->aabcccccaaa  output-->a2b1c5a3
//inp-->aArr  output-->a1A1r2
import java.util.Scanner;

public class ConsecutiveCompressString{
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    //String s="aArraa";
    
    for (int i=0; i<s.length(); i++){
      int count=1;
      for (int j=i+1; j<s.length(); j++){
        if (s.charAt(i)==s.charAt(j)){
          count++;
          i++;
        }
        else{
          break;
        }
      }
      System.out.print(s.charAt(i)+""+count);
    }
  }
}