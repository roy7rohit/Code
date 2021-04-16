package ComplicatedPattern;

import java.util.Scanner;

public class NumberValleyPattern {

  public static void main(String[] args) {
    
    Scanner sn = new Scanner(System.in);
    int rows = sn.nextInt();

    pattern(rows);
  }
  public static void pattern(int rows) {

    int row = 1;

    while(row <= rows){
      int num = 1;
      int col = 1;
      while(col <= row){

        System.out.print(num);
        num++;
        col++;
      }

      int spaces = (2*rows) - (2*row) -1;
      int space = 1;

      while(space <= spaces){

        System.out.print(" ");
        space++;
      }
      if(row == rows){

        col--;
        num--;
      }
      int star = 1;
      while(star <= row){
        num--;

        System.out.print(num);
        
        star++;
      }
      System.out.println();
      row++;
    }
    
  }
  
}