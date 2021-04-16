package JAVA_trial;

import java.util.Scanner;

public class CountOfNum {
  
  public static void main(String[] args) {
    
    Scanner sn = new Scanner(System.in);
    int num = sn.nextInt();

    int counter = 0;
    while(num != 0){
      
      num = num/10;
      counter++;
    }

    System.out.println(counter);
  }
}