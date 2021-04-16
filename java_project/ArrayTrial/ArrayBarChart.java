package ArrayTrial;

import java.util.Scanner;

public class ArrayBarChart {
  
  public static void main(String[] args) {
    
    Scanner sn = new Scanner(System.in);
    int size = sn.nextInt();
    
    int[] arr = new int[size];

    for(int i=0; i<arr.length; i++){

      arr[i] = sn.nextInt();
    }
    barChart(arr); 
  }
  public static void barChart(int []arr) {
    
    int max = arr[0];
    for(int i=1; i<arr.length; i++){

      if(arr[i] > max){

        max = arr[i];
      }
    }
    for(int bar=max; bar >= 1; bar--){
      for(int i=0; i<arr.length; i++){
        
        if(arr[i] >= bar){

          System.out.print("**\t");
        }
        else{
          System.out.print("\t");
        }
      }
      System.out.println();
    }
  }
}