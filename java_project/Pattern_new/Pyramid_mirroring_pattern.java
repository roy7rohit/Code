package Pattern_new;

import java.util.Scanner;

public class Pyramid_mirroring_pattern {

  public static void main(String[] args) {
    
    Pyramid_mirroringPattern(5);
    
  }
  public static void Pyramid_mirroringPattern(int rows) {

    
    int row = 1;
    while(row <= rows){

      int spaces = rows - row;
      int space = 1;
      while(space <= spaces){

        System.out.print(" ");

        space++;
      }
      int cols = (2*row) - 1;
      int col = 1;
      int num = 1;
      while(col <= cols){
        
        if(col < (cols/2)+1){
          System.out.print(num);
          num++;
        }else{
          System.out.print(num);
          num--;
        }

        col++;
      }
      System.out.println();
      row++;
    }    
  }
  
}