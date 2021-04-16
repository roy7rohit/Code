package JAVA_trial;

import java.util.Scanner;

public class Armstrong_no {
  
  public static void main(String[] args) {
    
    Scanner sn = new Scanner(System.in);
    int n = sn.nextInt();

    armstrrong_no(n);
  }

  public static int armstrrong_no(int n) {

    int num = n;
    int len = 0;
    while(num != 0){

      len = len+1;
      num = num/10;
    }

    int num2 = n;
    int arm = 0;
    
    while(num2 != 0){

      int rem = num2%10;
      int mult = 1;
      for(int i=1; i<=len; i++){
        
        mult = mult*rem;
        
      }
    arm = arm + mult;
    num2 = num2/10;
      }

      if(arm == n){

        System.out.println(n + " is armstrong");
      }else{

        System.out.println(n + " is not armstrong");
      }
    
    return arm;
    
  }
}
