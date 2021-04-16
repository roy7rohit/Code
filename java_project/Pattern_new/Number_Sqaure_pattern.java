package Pattern_new;

import java.util.Scanner;

public class Number_Sqaure_pattern {

  public static void main(String[] args) {
    
    Scanner sn = new Scanner(System.in);
    int rows = sn.nextInt();

    NumberSqaurePattern(rows);
  }
  
  public static void NumberSqaurePattern(int rows) {

    int row = 1;
    while(row <= rows){

      int num = 1;
      while(num >= rows){

        System.out.print(num);

        rows--;
      }

      System.out.println();
      row++;
    }
    
  }
  
}