package Array.array_function;

import java.util.Arrays;

public class BubbleSort1 {

  public static void main(String[] args) {
    
    int []arr = {10,9,15,13,45};
    bubble_sort(arr);
    System.out.println(Arrays.toString(arr));
  }

  public static void bubble_sort(int []arr) {
    
    int last = arr.length-1;
    for(int count=0; count<=last; count++){
      for(int i=1; i<=last-count; i++){

        if(arr[i] < arr[i-1]){

          int temp = arr[i];
          arr[i] = arr[i-1];
          arr[i-1] = temp;
        }
      }

    }
  }
  
}