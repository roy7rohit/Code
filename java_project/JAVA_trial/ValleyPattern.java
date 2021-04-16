package JAVA_trial;

import java.util.Scanner;

public class ValleyPattern {
 
  public static void main(String[] args) {

    Scanner sn = new Scanner(System.in);
    int rows = sn.nextInt();

    pattern(rows);
    

  }

  public static void pattern(int rows){

    int row = 1;
    while(row <= rows){

      int star = 1;
      while(star <= row){

        System.out.print("*");
        star++;
      }

      int spaces = (2*rows)-(2*row) - 1;
      int space = 1;
      while(space <= spaces){

        System.out.print(" ");
        space++;
      }

      int star1 = 1;
      if(row == rows){

        star1 = 2;
      }
      while(star1 <= row){

        System.out.print("*");
        star1++;
      }

      System.out.println();
      row++;
    }
  }
}