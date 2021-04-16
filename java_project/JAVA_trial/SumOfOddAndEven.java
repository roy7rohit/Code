package JAVA_trial;

import java.util.Scanner;

public class SumOfOddAndEven {
  
  public static void main(String[] args) {
    
    Scanner sn = new Scanner(System.in);
    int num = sn.nextInt();
    int res = SumOf_OddAndEven(num);
    System.out.println(res);
  }

  public static int SumOf_OddAndEven(int num){

    int sum = 0;
    int counter = 1;

    while(counter <= num){

      if(counter % 2 == 0){

        sum = sum + counter;
        System.out.println(sum);
      }
      // else{

      //   sum = sum + counter;
      //   System.out.println(sum);
      // }

      counter++;
    }
    return sum;
  }
}