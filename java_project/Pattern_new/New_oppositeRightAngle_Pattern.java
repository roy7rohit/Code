package Pattern_new;

import java.util.Scanner;

public class New_oppositeRightAngle_Pattern {

  public static void main(String[] args) {
    
    new_oppPattern();
  }

  public static void new_oppPattern(){

    Scanner sn = new Scanner(System.in);
    int rows = sn.nextInt();

    int row = 1;
    while(row <= rows){
      int spaces = row -1;
      int space = 1;
      while(space <= spaces){

        System.out.print(" ");
        space++;
      }

      int star = row;
      while(star <= rows){

        System.out.print("*");
        star++;
      }
      System.out.println();
      row++;
    }
  }
  
}