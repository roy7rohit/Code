package JAVA_trial;

import java.util.Scanner;

public class InverseOfANumber {

  public static void main(String[] args) {
    
    Scanner sn = new Scanner(System.in);
    int num = sn.nextInt();

    int res = inverse(num);

    System.out.println(res);

  }

  public static int inverse(int num) {

    int inverse = 0;
    int orig_place = 1;

    while(num != 0){

      int orig_digit = num%10;
      int inverse_digit = orig_place;
      int inverse_palce = orig_digit;

      //make changes in inverse digit and inverse place

      inverse = inverse + inverse_digit*(int)Math.pow(10, inverse_palce - 1);
      num = num/10;

      orig_place++;
    }
    return inverse;
  }
  
}