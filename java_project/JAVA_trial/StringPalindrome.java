package JAVA_trial;

import java.util.Scanner;

public class StringPalindrome {
  
  public static void main(String[] args) {
    
    Scanner sn = new Scanner(System.in);
    String str = sn.nextLine();

    if(stringPalindrome(str)){
          
      System.out.println("yes");
    }
    else{

      System.out.println("no");
    }
    
  }

  public static boolean stringPalindrome(String str) {
    
    boolean flag = true;
    int start = 0;
    int end = str.length()-1;
    
    while(start < end){

      if(str.charAt(start) != str.charAt(end)){

        flag = false;
      }

     start++;
     end--;
    }
    return true;
  
    }
  }
