package JAVA_trial;

import java.util.Scanner;

public class NumberFrequency {
  
  public static void main(String[] args) {
    
    Scanner sn = new Scanner(System.in);
    int num = sn.nextInt();
    int digit = sn.nextInt();

    int res = num_frequency(num, digit);
    System.out.println(res);
  }

  public static int num_frequency(int num, int digit) {

    int counter = 0;
    while(num > 0){

      int rem = num % 10;
      num = num/10;

      if(rem == digit){

        counter++;
      }
    }
    return counter;
    
  }
}