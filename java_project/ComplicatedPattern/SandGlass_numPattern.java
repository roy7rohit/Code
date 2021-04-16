package ComplicatedPattern;

import java.util.Scanner;

public class SandGlass_numPattern {
  
  public static void main(String[] args) {
    
    Scanner sn = new Scanner(System.in);
    int rows = sn.nextInt();

    sandGlass_numPattern(rows);
  }

  public static void sandGlass_numPattern(int rows) {
   
    // rows = (2*rows) - 1;
    
    int row = 1;
    int mirror =1;
    
    
    while(mirror <= rows){

      int spaces = row - 1;
      int space = 1;
      while(space <= spaces){

        System.out.print(" ");
        space++;
      }

      int star = row;
      int num = 1;
      while(star <= rows){

        System.out.print(num + " ");

        

        star++;
        num++;
      }
     
      
      if(mirror <= (((2*rows)-1)/2)+1){

        row++;
      }
      else{

        row--;
      }
      System.out.println();
      mirror++;
    }
  }
}