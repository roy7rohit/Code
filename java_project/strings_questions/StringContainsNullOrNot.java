package strings_questions;

import java.util.Scanner;

public class StringContainsNullOrNot {
  
  public static void main(String[] args) {
    
    // Scanner sn = new Scanner(System.in);
    // String str = sn.nextLine();
    // String str1 = sn.nextLine();

    // String str = "hello";
    String str = null;

    if(string_containsOrNOt(str)){

      System.out.println(str + " contain null");
    } 
    else{

      System.out.println(str +" do not contains null");
    }

  }

  public static boolean string_containsOrNOt(String str) {
    

    if(str == null){

      return true;
    }
    return false;
  }
}