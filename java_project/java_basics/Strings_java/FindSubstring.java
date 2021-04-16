package java_basics.Strings_java;

import java.util.Scanner;

public class FindSubstring {
  
  public static void main(String[] args) {
    
    Scanner sn = new Scanner(System.in);
    String str = sn.nextLine();
    printSubStr(str);
  }

  private static void printSubStr(String str) {

    for(int si=0; si<str.length()-1; si++){
      for(int ei = si+1; ei<str.length(); ei++){

        String str1 = str.substring(si, ei);
        System.out.println(str1);
      }

    }
    
  }
}