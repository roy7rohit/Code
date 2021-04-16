package JAVA_trial;

import java.util.Scanner;

public class GcdAndLCM {
  
  public static void main(String[] args) {

    Scanner sn = new Scanner(System.in);
    int divident = sn.nextInt();
    int divisor = sn.nextInt();

    gcd_and_lcm(divident, divisor); 
    
  }

  public static void gcd_and_lcm(int divident, int divisor) {

    int num1 = divident;
    int num2 = divisor;
 
    while(divident % divisor != 0){

      int rem = divident % divisor;
      divident = divisor;
      divisor = rem;
    }
    int gcd = divisor;
    System.out.println(gcd);

    int lcm = (num1*num2)/gcd;
    System.out.println(lcm);
  }
}