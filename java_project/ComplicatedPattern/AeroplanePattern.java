package ComplicatedPattern;

import java.util.Scanner;

public class AeroplanePattern {
 
  public static void main(String[] args) {
     
    Scanner sn = new Scanner(System.in);
    int rows = sn.nextInt();

    pattern(rows);
  }
  public static void pattern(int rows) {

    int row = 1;
    int m = 1;
    while(m <= rows){

      int spaces = rows/2;
      int space = 1;
      while(space <= spaces){

        if(row == (rows/2)+1){

          System.out.print("*");
        }
        else{
          
          System.out.print(" ");
        }

        space++;
      }

      int star = 1;
      while(star <= row){

        System.out.print("*");
        star++;
      }
      if(m < (rows/2) + 1){

        row++;
      }
      else{

        row--;
      }
      System.out.println();

      m++;
    }
    
  }
}