package Array_demo;

import java.util.Arrays;

public class Bubble_sort {

  public static void main(String[] args) {
    
    int []arr = {1,3,5,0,0,9,2,4,7,3,-9,-5,8,-0,-3,9,-1};
    
    BubbleSort(arr); 
    System.out.println(Arrays.toString(arr));

  }

  public static void BubbleSort(int []arr) {
    
    int size = arr.length;
    int temp = 0;

    for(int i=0; i<size; i++){
      for(int j=1; j<(size-i); j++){

        if(arr[j-1] > arr[j]){

          temp = arr[j-1];
          arr[j-1] = arr[j];
          arr[j] = temp;
        
        }
        
      }
    }
  }
}