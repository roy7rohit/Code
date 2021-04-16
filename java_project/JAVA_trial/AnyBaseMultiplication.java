package JAVA_trial;

import java.util.Scanner;

public class AnyBaseMultiplication {

  public static void main(String[] args) {
    
    Scanner sn = new Scanner(System.in);
    int base = sn.nextInt();
    int num1 = sn.nextInt();
    int num2 = sn.nextInt();

    int res = anyBaseMultiplication(base, num1, num2);
    System.out.println(res);

  }

  public static int anyBaseMultiplication(int base, int num1, int num2) {

    int ans = 0;
    int mult = 1;

    while(num2 > 0){

      int rem2 = num2 % 10;
      num2 = num2 / 10;

      int single_prod = anyBaseMultiplicationWith_singleDigit(base, num1, rem2);
      ans = any_Base_Addition(base, ans, single_prod * mult);

      mult = mult * 10;


    }
    return ans;
    
  }

  public static int anyBaseMultiplicationWith_singleDigit(int base, int num1, int rem2) {

    int ans = 0;
    int carry = 0;
    int mult = 1;

    while(num1 > 0 || carry > 0){

      int rem = num1 % 10;
      num1 = num1 / 10;

      int prod = rem * rem2 + carry;
      carry  = prod / base;
      prod = prod % base;

      ans = ans + (prod * mult);
      mult = mult * 10;

    }
    return ans;
    
  }
  public static int any_Base_Addition(int base, int num1, int num2) {
  
    int ans = 0;
    int mult = 1;
    int carry = 0;
    while(num1 > 0 || num2 > 0 || carry > 0){

      int rem1 = num1 % 10;
      int rem2 = num2 % 10;

      num1 = num1 / 10;
      num2 = num2 / 10;

      int sum = rem1 + rem2 + carry;
      carry = sum / base;
      sum = sum % base;

      ans += sum * mult;
      mult = mult * 10;
    }
    return ans;
  }
}
  
