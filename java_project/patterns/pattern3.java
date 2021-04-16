package patterns;

import java.util.Scanner;

public class pattern3 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int nst = 1;

    int row = 1;
    while(row <= n){

      int col = 1;      
      while(col <= nst){

        System.out.print("*");
        col++;
      }
      System.out.println();
      nst++;
      row++;
    }
  }
  
}