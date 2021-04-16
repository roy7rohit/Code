package JAVA_trial;

import java.util.Scanner;

public class GCd_HCF {
 
  public static void main(String[] args) {

    Scanner sn = new Scanner(System.in);
    int divident = sn.nextInt();
    int divisor = sn.nextInt();
    
    int ans = hcf(divident, divisor);
    System.out.println(ans);
  }

  public static int hcf(int divident, int divisor) {
    
    while(divident % divisor != 0){

      int rem = divident % divisor;
      divident = divisor;
      divisor = rem;
    }
    return divisor;
  }
}