package Pattern_new;

import java.util.Scanner;

public class Pyramid_Const_number_pattern {
  
  public static void main(String[] args) {

    Pyramid_Const_number();
    
  }
  public static void Pyramid_Const_number(){
    
    Scanner sn = new Scanner(System.in);
    int rows = sn.nextInt();
    int num = 1;
    int row = 1;
    while(row <= rows){

      int spaces = rows - row;
      int space = 1;
      while(space <= spaces){

        System.out.print(" ");
        space++;
      }
      int stars = 2*(row) - 1;
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