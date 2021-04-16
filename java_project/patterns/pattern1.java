package patterns;
import java.util.Scanner;

public class pattern1 {
  public static void main(String[] args) {
    
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int row = 1;

    while(row <= n){

      System.out.println("*");

      row++;
      
    }
    System.out.println();
  }

  
}