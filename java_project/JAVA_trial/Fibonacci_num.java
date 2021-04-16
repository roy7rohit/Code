package JAVA_trial;

import java.util.Scanner;

public class Fibonacci_num {
 
  public static void main(String[] args) {
    
    Scanner sn = new Scanner(System.in);
    int num = sn.nextInt();

    fib_no(num);

  }

  public static void fib_no(int num) {

    int a = 0;
    int b = 1;

    int counter = 1; 
    
   while(counter <= num){

    System.out.println(a);

    int sum = a + b;
    a = b;
    b = sum;

    counter++;
   }
  }
}