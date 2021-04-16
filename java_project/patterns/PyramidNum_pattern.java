package patterns;

import java.util.Scanner;

public class PyramidNum_pattern {

  public static void main(String[] args) {

    Scanner sn  = new Scanner(System.in);
    int rows = sn.nextInt();

    PyramidNum(rows);
    
  }
  public static void PyramidNum(int rows){
    
    int num = 1;
    int row = 1;
    while(row <= rows){

      int spaces = rows - row;
      int space = 1;
      while(space <= spaces){

        System.out.print(" ");
        space++;
      }

      int stars = 2*(row) -1;
      int star = 1;
      while(star <= stars){

        System.out.print(num);
        num++;

        star++;
      }

      System.out.println();
      row++;
    }
  }
  
}