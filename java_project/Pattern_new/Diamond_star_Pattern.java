package Pattern_new;

import java.util.Scanner;

public class Diamond_star_Pattern {

  public static void main(String[] args) {
    
    Scanner sn = new Scanner(System.in);
    int rows = sn.nextInt();

    Diamond_Pattern(rows);

  }
  public static void Diamond_Pattern(int rows){

    rows = (2*rows) - 1;
    int row = 1;
    int mirror = 1;
    while(mirror <= rows){

      int spaces = rows - row;
      int space = 1;
      while(space <= spaces){

        System.out.print(" ");
        space++;
      }

      int stars = 2*(row) - 1;
      int star = 1;
      while(star <= stars){

        System.out.print("*");
        star++;
      }
      if(mirror < (rows/2)+1){
        
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