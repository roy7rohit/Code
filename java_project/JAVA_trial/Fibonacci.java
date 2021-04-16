package JAVA_trial;

import java.util.Scanner;

import sun.awt.X11.awtImageData;

public class Fibonacci {

  public static void main(String[] args) {
    
    Scanner sn = new Scanner(System.in);
    int n = sn.nextInt();
    int res = fib_no(n);
    System.out.println(res);

  }

  public static int  fib_no(int n) {
    
    int a = 0;
    int b = 1;
    int counter = 1;

    while(counter < n){
      System.out.println(a);
      int sum = a+b;
      a=b;
      b=sum;
      counter++;
    }
    return a;
  }
  
}