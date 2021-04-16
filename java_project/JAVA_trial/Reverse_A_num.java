package JAVA_trial;

import java.util.Scanner;

public class Reverse_A_num {
 
  public static void main(String[] args) {
    
    Scanner sn = new Scanner(System.in);
    int num = sn.nextInt();

    int res = reverse_num(num);
    // System.out.println(res);

    reverse_A_num(num);

  }

  public static int reverse_num(int num) {
    

    int sum = 0;
    while(num != 0){

      int rem = num%10;
      sum = (sum*10) + rem;

      num = num/10;
    }
    return sum;
  }
  public static void reverse_A_num(int num) {

    while(num > 0){

      int rem = num%10;
      num = num/10;

      System.out.println(rem);

    }
    
  }
}