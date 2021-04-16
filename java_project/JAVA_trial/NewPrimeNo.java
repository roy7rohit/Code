package JAVA_trial;

import java.util.Scanner;

public class NewPrimeNo {
 
  public static void main(String[] args) {
    
    Scanner sn = new Scanner(System.in);
    int n = sn.nextInt();

    for(int i=0; i<n; i++){

      int num = sn.nextInt();
   
      int count = 0;
        for(int div=2; div * div<=num; div++){

          if(num % div == 0){

            count++;
            break;

          }
        }
      
      
        if(count == 0){

          System.out.println("no is prime");
        }
        else{

          System.out.println("no is not prime");
        }
      }
    }
  }


    
  
  
