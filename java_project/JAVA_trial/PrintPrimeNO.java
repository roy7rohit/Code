package JAVA_trial;

import java.util.Scanner;

public class PrintPrimeNO {
  
  public static void main(String[] args) {
    
    Scanner sn = new Scanner(System.in);
    int low = sn.nextInt();
    int high = sn.nextInt();

    for(int num=low; num<=high; num++){

      int count = 0;
      for(int div=2; div*div<=num; div++){

        if(num%div == 0){

          count++;
          break;
        }
      }
      if(count == 0){

        System.out.println(num);
      }
    }
  }
}