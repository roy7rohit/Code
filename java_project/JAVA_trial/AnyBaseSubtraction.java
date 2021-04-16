package JAVA_trial;

import java.util.Scanner;

public class AnyBaseSubtraction {
  
  public static void main(String[] args) {
    
   Scanner sn = new Scanner(System.in);
   int base = sn.nextInt();
   int num1 = sn.nextInt();
   int num2 = sn.nextInt();

   int res = any_baseSubtraction(base, num1, num2);

   System.out.println(res);

  }

  public static int any_baseSubtraction(int base, int num1, int num2) {
    
    int ans = 0;
    int mult = 1;
    int borrow = 0;

    while(num2 > 0){

      int rem1 = num1 % 10;
      int rem2 = num2 % 10;

      num1 = num1 / 10;
      num2 = num2 / 10;
      
      int subtract = 0;

      rem2 = rem2 + borrow;

      if(rem2 >= rem1){

        borrow = 0;
        subtract = rem2 - rem1;
      }
      else{

        borrow = -1;
        subtract = rem2 + base - rem1;
      }

      ans = ans + (subtract * mult);

      mult = mult * 10;

    }

    return ans;
  }
}