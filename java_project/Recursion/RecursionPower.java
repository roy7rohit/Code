package Recursion;

import java.util.Scanner;

public class RecursionPower {
  
  public static void main(String[] args) {
     
    Scanner sn = new Scanner(System.in);
    int num = sn.nextInt();
    int pow = sn.nextInt();

    int ans = power(num, pow);
    System.out.println(ans);
  }

  public static int power(int num, int pow) {
    
    if(pow == 0){

      return 1;
    }

    int n = power(num, pow - 1);
    int res = num*n;

    return res;
  }
}