package twoD_Array;

import java.util.Scanner;

public class TwoDArrayDemo2 {

public static void main(String[] args) {
  
  // int [][]arr = takeInput();

  int [][]arr = {{11,12,13},{21,22,23},{31,32,33}};
  display(arr);
}
private static int[][] takeInput() {
  
  Scanner sn = new Scanner(System.in);
  System.out.println("enter the no of rows");
  int rows = sn.nextInt();
  int [][]arr = new int[rows][];

  for(int row=0;row<rows; row++){

    System.out.println("enter the col for rows "+ row);

    int cols = sn.nextInt();
    arr[row] = new int [cols];
    
    for(int col=0;col<cols; col++){

      System.out.println("enter the value for rows "+ row +" and cols " + col);
      arr[row][col] = sn.nextInt();
    }
  }
  return arr;
}
  private static void display(int [][]arr) {
    for(int row=0; row<arr.length;row++){
      for(int col=0; col<arr[row].length; col++){

        System.out.print(arr[row][col]+ " ");
      }
      System.out.println();
  }
    }
    
}