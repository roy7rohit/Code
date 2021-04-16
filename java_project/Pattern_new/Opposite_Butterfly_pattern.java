package Pattern_new;

import java.util.Scanner;

public class Opposite_Butterfly_pattern {

  public static void main(String[] args) {
    
    Scanner sn = new Scanner(System.in);
    int rows = sn.nextInt();

    OppositeButterfly_pattern(rows);   
  }

  public static void OppositeButterfly_pattern(int rows) {
    
    int row = 1;
    while(row <= rows){

      int stars = 2*(rows) - 1;
      int star  = 1;

      while(star <= stars){

        if(star <= (stars/2)+1-star || star >= (stars/2)-1 + star){

          System.out.print("*");
        }else{

          System.out.print(" ");
        }

        // System.out.print("*");
        star++;
      }
  //     if(row > 1){
  //     int spaces  = 2*(row) - 3;
  //     int space  = 1;
  //     while(space <= spaces){

  //       System.out.print("-");
  //       space++;
  //     } 
  //   }
  //   if(row >= 1){
  //   int Newstars = row;
  //   while(Newstars <= rows){

  //     System.out.print("*");
  //     Newstars++;
  //   }
  // }
      System.out.println();
      row++;
    
  }
  }
  
}