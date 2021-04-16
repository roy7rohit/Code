package ArrayTrial;

import java.util.Arrays;

public class InsertionSort {

  public static void main(String[] args) {
    
    int []arr = {55,11,44,89,75,03,11,35,62,26,104,1};
    insertion_Sort(arr);
    System.out.println(Arrays.toString(arr)); 
  }
  
  public static void insertion_Sort(int []arr) {
    
    for(int i=0; i<arr.length; i++){
      
      int val = arr[i];

      int j = i - 1;
      while(j>=0 && arr[j] > val){

        arr[j+1] = arr[j];
        j--;
      }
      arr[j+1] = val;
    }
  }
}