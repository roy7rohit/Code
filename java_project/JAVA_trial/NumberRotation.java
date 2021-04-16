package JAVA_trial;

import java.util.Scanner;

public class NumberRotation {
  
  public static void main(String[] args) {
    
    Scanner sn = new Scanner(System.in);
    int num = sn.nextInt();
    int k = sn.nextInt();//how much value i want to rotate

    num_rotation(num, k);

    System.out.println(num);


  }

  public static void num_rotation(int num, int k) {

    int temp = num;
    int counter = 0;

    while(temp > 0){

      temp = temp/10;
      counter++;
    }

    k = k % counter;
    if(k < 0){

      k = k + counter;
    }


    int div = 1;
    int mult = 1;

    int count = 1;
    for(int i=1; i<= counter; i++){

      if(i <= k){

        div = div * 10;
      }
      else{

        mult = mult * 10;
      }

      int quotient = num/div;
      int rem = num % div;

      int rotation = rem * mult + quotient;

      System.out.println(rotation);
    }
  }
}