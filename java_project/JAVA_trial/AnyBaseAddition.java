package JAVA_trial;

import java.util.Scanner;

public class AnyBaseAddition {
    public static void main(String[] args) {
      
      Scanner sn = new Scanner(System.in);
      int base = sn.nextInt();
      int num1 = sn.nextInt();
      int num2 = sn.nextInt();
      
      
      int res = any_Base_Addition(base, num1, num2);

      System.out.println(res);

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