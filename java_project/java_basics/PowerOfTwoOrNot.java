package java_basics;

import java.util.Scanner;

public class PowerOfTwoOrNot {
 
  public static void main(String[] args) {
    
    Scanner sn = new Scanner(System.in);
    int num = sn.nextInt();

    while(num % 2 == 0){

      num = num / 2;
      if(num == 1){

        System.out.println("no is 2's power");
      }
    }
    if(num != 1){

      System.out.println("false");
    }
    
  }

  
}