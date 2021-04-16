package ArrayTrial;

import java.util.Arrays;

public class Array_maxValue {

  public static void main(String[] args) {
    
    int []arr = {-5,10,3,55,-1,0,56,5};
    max_value(arr);
    int res = max_index(arr);
    System.out.println(res);


  }
  public static void max_value(int []arr) {
    
    int max = Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++){

      if(arr[i] > max){

        max = arr[i];

      }
      
    } 
    System.out.println(max);
  }

  public static int max_index(int []arr) {
    
    int max_idx = 0;
    for(int i=0; i<arr.length; i++){

      if(arr[i] > arr[max_idx]){

        max_idx = i;

      }

    }

    return max_idx;
  }
  
}