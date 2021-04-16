package Pattern_new;

import java.util.Scanner;

public class Pyramid_newStyle_Pattern {
 
  
  public static void main(String[] args) {

    Scanner sn = new Scanner(System.in);
    int rows = sn.nextInt();

    PyramidNewStylePattern(rows);
    
  }

  public static void PyramidNewStylePattern(int rows){

    int row = 1;
    while(row <= rows){

      int spaces = rows - row;
      int space = 1;
      while(space <= spaces){

        System.out.print(" ");
        space++;
      }

      int stars = 2*(row) - 1;
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