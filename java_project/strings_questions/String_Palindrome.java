package strings_questions;

import java.util.Scanner;

public class String_Palindrome {

  public static void main(String[] args) {

    Scanner sn = new Scanner(System.in);
    String str = sn.nextLine();

    if(isPalindrome(str)){
      System.out.println("yes");
    }
    else{
      System.out.println("no");
    }
    
  }

  public static boolean isPalindrome(String str){

    int start = 0;
    int end = str.length() - 1;

    while(start < end){

      if (str.charAt(start) != str.charAt(end)){

        return false;

      }
 
      start++;
      end--;
      
    }
    return true;
     
  
}
}