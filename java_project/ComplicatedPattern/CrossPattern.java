package ComplicatedPattern;

import java.util.Scanner;

public class CrossPattern {
  
  public static void main(String[] args) {
    
    Scanner sn = new Scanner(System.in);
    int rows = sn.nextInt();

    pattern(rows);
  }

  public static void pattern(int rows) {
    
    int row  =1;
    while(row <= rows){

      int star = 1;
      while(star <= rows){

        if(star == row || star + row == rows + 1){

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