package ComplicatedPattern;

import java.util.Scanner;

public class HollowDiamond {
 
  public static void main(String[] args) {
    
    Scanner sn = new Scanner(System.in);
    int rows = sn.nextInt();

    pattern(rows); 

  }

  public static void pattern(int rows) {
    
    int row = 1;
    int m = 1;

    while(m <= rows){

      int space = row - 1;

      while(space  <= rows){

        System.out.print(" ");
        space++;
      }

      int star = 1;
      while(star <= rows){

        if(star == 1 || star == (2*row) - 1){

          System.out.print("*");
        }
        else{

          System.out.print(" ");
        }

        star++;
      }

      if(m < (rows/2)+1){

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