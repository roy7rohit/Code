package Pattern_new;

import java.util.Scanner;

public class Arrow_pattern {
  public static void main(String[] args) {
    
    ArrowPattern();
  }

  public static void ArrowPattern() {
    
    Scanner sn = new Scanner(System.in);
    int rows = sn.nextInt();
    
    int row = 1;
    int k = rows - 1;
    while(row <= rows){
      
      k = 1;
      int star = k;
      while(star <= row){

        System.out.print("*");
        star++;
      }
      System.out.println();
      row++;
    }
  }
}