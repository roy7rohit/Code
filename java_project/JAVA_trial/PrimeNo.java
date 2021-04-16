package JAVA_trial;

import java.util.Scanner;

public class PrimeNo {
    
  public static void main(String[] args) {

    Scanner sn = new Scanner(System.in);
    int num = sn.nextInt();

    int temp = 0;
    for(int i=1; i<=num; i++){
      
      
      for(int j=2; j<=i-1; j++){
        

        if(i % j==0){
          temp++;
          
        }
      }
      if(temp == 0){
        System.out.println(i);
      }
      else{

        temp = 0;
      }
    }
}

}