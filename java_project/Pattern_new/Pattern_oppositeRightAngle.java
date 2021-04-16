package Pattern_new;

import java.util.Scanner;

public class Pattern_oppositeRightAngle {
  
  public static void main(String[] args) {

    Opposite_pattern();
    
  }

  public static void Opposite_pattern(){

    Scanner sn = new Scanner(System.in);
    int rows = sn.nextInt();

    int row = 1;
    while (row<=rows){

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