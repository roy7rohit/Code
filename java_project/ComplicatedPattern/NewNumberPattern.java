package ComplicatedPattern;

import java.util.Scanner;

public class NewNumberPattern {
  
  public static void main(String[] args) {
    
    Scanner sn = new Scanner(System.in);
    int rows = sn.nextInt();

    pattern(rows);

  }

  public static void pattern(int rows) {

    int row = 1;

    while(row <= rows){

      
      int col = 1;
      while(col <= rows){

        int num = 1;

        System.out.print(num);
        num = num * ((row - col)) / (col);

        col++;
      }
      System.out.println();
      row++;
    }
    
  }
}