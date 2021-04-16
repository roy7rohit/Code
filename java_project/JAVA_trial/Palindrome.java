package JAVA_trial;

public class Palindrome {
    
  public static void main(String[] args) {
    
    String str = "abababa";

    if(palindrome(str)){

      System.out.println("palindrome");
    }

    else{

      System.out.println("not palindrome");
    }
  }

  public static boolean palindrome(String str){

    int start = 0;
    int end = str.length()-1;

    boolean flag = true;

    while(start <= end){
      if(str.charAt(start) != str.charAt(end)){

        return false;
      }
      start++;
      end--;

    }
    return true;
  }
}