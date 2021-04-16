package Pattern_new;

import java.util.Scanner;

public class New_RightAngle_pattern {

  public static void main(String[] args) {
    
    new_rightAngle();
  }
  public static void new_rightAngle(){

    Scanner sn = new Scanner(System.in);
    int rows = sn.nextInt();

    int row = 1;
    while(row <= rows){

      int spaces = rows - row;
      int space = 1;
      while(space <= spaces){

        System.out.print(" ");
        space++;
      }
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