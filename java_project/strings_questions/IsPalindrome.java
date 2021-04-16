package strings_questions;

import java.util.Scanner;

public class IsPalindrome {
    
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    String str = sn.nextLine();

    // System.out.println(palindrome(str));
    // palindromeSS(str);
    // System.out.println(oddEven(str));
    // System.out.println(strDiff(str));
    // strCompress1(str);
    // strCompress2(str);
    subsequence(str);
  }

  public static boolean palindrome(String str){

    int left = 0;
    int right = str.length() - 1;

    while(left <= right){
      if(str.charAt(left) != str.charAt(right)){
        return false;
      }

      left++;
      right--;
    }

    return true;
  }


  public static void palindromeSS(String str){
    for(int i=0; i<str.length(); i++){
      for(int j=i+1; j<=str.length(); j++){

        String ss = str.substring(i, j);
        boolean palindromic = palindrome(str);
        if(palindromic){
          System.out.println(ss);
        }
      }
    }
  }

  public static String oddEven(String str){
      StringBuilder sb = new StringBuilder(str);
  
      for(int i=0; i<sb.length(); i++){
        char ch = sb.charAt(i);
        if(i % 2 == 0){
  
          ch = (char)(ch - 1);
        }
        else{
          ch = (char)(ch + 1);
        }
  
        sb.setCharAt(i, ch);
      }
      return sb.toString();
    }

  public static String strDiff(String str){

        StringBuilder sb = new StringBuilder(str);
        for(int i=0; i<str.length() - 1; i++){
    
          char ch1 = str.charAt(i);
          char ch2 = str.charAt(i+1);
          int diff = ch2 - ch1;
    
          sb.append(ch1);
          sb.append(diff);
        }
    
        sb.append(str.charAt(str.length() - 1));
        return sb.toString();
    }

  public static void strCompress1(String str){

     for(int i=0; i<str.length() - 1; i++){

        char ch1 = str.charAt(i);
        char ch2 = str.charAt(i+1);

          if(ch1 != ch2){
            System.out.print(ch1);
          }
        }
        System.out.println(str.charAt(str.length() - 1));
  }

  public static void strCompress2(String str){

    int counter = 1;
    for(int i=0; i<str.length() - 1; i++){

      char ch1 = str.charAt(i);
      char ch2 = str.charAt(i+1);

      if(ch1 != ch2){
        System.out.print(ch1);

        if(counter > 1){
          System.out.print(counter);
        }
        counter = 1;
      }

      else{
        counter++;
      }
    }

    System.out.print(str.charAt(str.length() - 1));
    if(counter > 1){
      System.out.println(counter);
    }
  }

  public static void subsequence(String str){

    for(int i=0; i<(1 >> str.length() - 1); i++){

      for(int j=str.length() - 1; j>=0; j++){

        int mask = 1 << j;
        if((i & mask) != 0){
          System.out.println(str.charAt(str.length() - 1 - j));
        }
      }
      System.out.println();
    }
  }

}

