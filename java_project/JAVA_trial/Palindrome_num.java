package JAVA_trial;

import java.util.Scanner;

public class Palindrome_num {
  
  public static void main(String[] args) {

    Scanner sn  = new Scanner(System.in);
    int n = sn.nextInt();
    
    palindrome(n); 
  }

  public static int palindrome(int n) {

    int num = n;
    int ans = 0;

    while(num != 0){

      int rem = num%10;
      ans = (ans*10) + rem;
      num = num/10;
    }
    if(ans == n){

      System.out.println(n+" = " + ans +" is palindrome");
    }
    else{

      System.out.println(n+" = " + ans + " is not palindrome");
    }
    return ans;
  }
}