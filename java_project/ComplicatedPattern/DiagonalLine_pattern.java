package ComplicatedPattern;

import java.util.Scanner;

public class DiagonalLine_pattern {
  
  public static void main(String[] args) {

    Scanner sn = new Scanner(System.in);
    int rows = sn.nextInt();

    pattern(rows);
    System.out.println();
    pattern2(rows);

  }

  public static void pattern(int rows) {

    int row = 1;
    while(row <= rows){

      int star = 1;
      while(star <= rows){

        if(star == row){

          System.out.print("*");
        }
        else{

          System.out.print(" ");
        }
        star++;
      }
      System.out.println();
      row++;
    }
    
  }

  public static void pattern2(int rows) {
  
    int row = 1;

    while(row <= rows){

      int star = 1;

      while(star <= rows){

        if(row + star == rows + 1){

          System.out.print("*");
        }
        else{

          System.out.print(" ");
        }
        star++;
      }
      System.out.println();
      row++;
    }
  }
}