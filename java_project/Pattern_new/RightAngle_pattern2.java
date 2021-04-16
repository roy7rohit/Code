package Pattern_new;

import java.util.Scanner;

public class RightAngle_pattern2 {
  
  public static void main(String[] args) {

    RightAngle_New_pattern();
    
  }

  public static void RightAngle_New_pattern() {

    Scanner sn = new Scanner(System.in);
    int rows = sn.nextInt();
    
    int row = 1;
    while(row <= rows){

      int stars = (rows/2) - 2 + row;
      int star = 1;
      while(star <= stars){

        System.out.print("*");
        star++;
      }
      System.out.println();
      row++;
    }
  }
}