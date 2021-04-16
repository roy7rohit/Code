package ArrayTrial;

import java.util.Scanner;

public class ArraySpan {
  
  public static void main(String[] args) {
    
    Scanner sn = new Scanner(System.in);
    int size = sn.nextInt();

    int[] arr = new int[size];

    for(int i=0; i<arr.length; i++){

      arr[i] = sn.nextInt();
    }

   arraySpan(arr);
  
  }

  public static void arraySpan(int[] arr) {
    
    int max = arr[0];
    int min = arr[0];
    for(int i=1; i<arr.length; i++){

      if(arr[i] > max){

        max = arr[i];
      }

      if(arr[i] < min){

        min = arr[i];
      }
   
    }
    int span = max - min;
    System.out.println(span);
    
  }
}