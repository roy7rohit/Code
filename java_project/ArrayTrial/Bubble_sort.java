package ArrayTrial;

import java.util.Arrays;

public class Bubble_sort {

  public static void main(String[] args) {
    
    int []arr = {2,5,6,4,8,7,9,2,0,1,4,6,32};
    bubble_sort(arr);
    System.out.println(Arrays.toString(arr));
  }
  
  public static void bubble_sort(int []arr) {
    
    for(int counter=0; counter<arr.length-1; counter++){
      for(int j=0; j<arr.length - 1 - counter; j++){

        if(arr[j] > arr[j+1]){

          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
  }
}