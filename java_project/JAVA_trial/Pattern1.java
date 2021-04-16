package JAVA_trial;

import java.util.Scanner;

public class Pattern1 {
  
  public static void main(String[] args) {

    Scanner sn = new Scanner(System.in);
    int rows = sn.nextInt();

    pattern(rows);
    
  }
  public static void pattern(int rows) {

    int row = 1;
    int stars = rows/2;
    int spaces = 1;
    while(row <= rows){
    
      int star = 1;
  
      while(star <= stars){

        System.out.print("*");
        star++;
      }

      int space = 1;
      while(space <= spaces){

        System.out.print(" ");
        space++;
      }
      int star1 = 1;
      while(star1 <= stars){

        System.out.print("*");
        star1++;
      }
      System.out.println();
      if(row <= rows/2){
        spaces += 2;
        stars -= 1;
        }
        else{

          spaces -= 2;
          stars += 1;
        }
      row++;

      
    }
    
  }
}