package Pattern_new;

import java.util.Scanner;

public class Opposite_Pyramid_Pattern {

  public static void main(String[] args) {
    Opposite_Pyramid();
    
  }
  public static void Opposite_Pyramid() {

    Scanner sn = new Scanner(System.in);
    int rows = sn.nextInt();

    int row = 1;
    while(row <= rows){
      
      int spaces = (row - 1);
      int space = 1;
      while(space <= spaces){

        System.out.print(" ");
        space++;
      }

      int stars = (2*(rows) - 2*(row) + 1);
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