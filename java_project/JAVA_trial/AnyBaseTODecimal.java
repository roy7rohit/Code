package JAVA_trial;

import java.util.Scanner;

public class AnyBaseTODecimal {
  
  public static void main(String[] args) {
    
    Scanner sn = new Scanner(System.in);
    int snum = sn.nextInt();
    int sb = sn.nextInt();

    int res = any_base_to_decimal(snum, sb);
    System.out.println(res);

  }

  public static int any_base_to_decimal(int snum, int sb) {
    
    int ans = 0;
    int mult = 1;
    while(snum != 0){

      int rem = snum%10; 

      ans = ans + (rem * mult); 

      mult = mult * sb;

      snum = snum/10;
    }

    return ans;
  }
}