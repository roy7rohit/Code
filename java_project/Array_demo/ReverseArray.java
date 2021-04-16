package Array_demo;

import java.util.Arrays;

public class ReverseArray {
  
  public static void main(String[] args) {
    
    int []arr = {10,20,30,40,50,60};
    reverse_array(arr, 2, 5);

    System.out.println(Arrays.toString(arr));
  }

  public static void reverse_array(int[] arr, int start, int end) {
    
    while(start < end){

      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }

  }
}