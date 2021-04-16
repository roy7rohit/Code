package JAVA_trial;

import java.util.Scanner;

public class SumOfNNatural {
    
  public static void main(String[] args) {

    Scanner sn = new Scanner(System.in);
    int n = sn.nextInt();
    
    int res = SumOf_N_Natural(n); 
    System.out.println(res);
  }
  public static int SumOf_N_Natural(int n) {

    int counter = 1;
    int sum = 0;
    while(counter <= n){

      sum = sum + counter;
      counter++;
    }
    return sum;
  }
}

