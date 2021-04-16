package Pattern_new;

import java.util.Scanner;

public class Pattern_RightAngle {
 
  public static void main(String[] args) {
    

    pattern();
    
  }
  public static void pattern(){

    Scanner sn = new Scanner(System.in);
    int rows = sn.nextInt();
     
    int row = 1;
    while(row <= rows){
      int star = 1;
      while(star <= row){

        System.out.print("*");
        star++;
         
      }
      System.out.println();
       
      row++;

 
    }
  }
}