package JAVA_trial;

import java.util.Scanner;

public class PrimeOrNonPrime {
  
  public static void main(String[] args) {

    Scanner sn = new Scanner(System.in);
    int n = sn.nextInt();
    
    Prime_Or_NonPrime(n);
    System.out.println(n);

  }
  public static void Prime_Or_NonPrime(int n){

    int div = 2;
    boolean flag = true;

    while(div < n){
      if(n%div == 0){

        flag = false;
      }

      div++;
    }
    if(flag == true){

      System.out.println("non prime");
    }
    else{
      System.out.println("prime");
    }

  }
}