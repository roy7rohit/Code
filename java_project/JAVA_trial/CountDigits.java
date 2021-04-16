package JAVA_trial;

import java.util.Scanner;

public class CountDigits {
  
  public static void main(String[] args) {
    
    Scanner sn = new Scanner(System.in);
    int num = sn.nextInt();

    int temp = num;
    int counter = 0;

    while(temp != 0){

      temp = temp/10;
      counter++;
    }
    System.out.println(counter);

    int div = (int)Math.pow(10, counter - 1);
    while(div != 0){

      int q = num/div;

      System.out.println(q);

      num = num%div;
      div = div/10; 

    }
  }
}