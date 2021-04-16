package ArrayTrial;

import java.util.Arrays;

public class ReverseArray {

  public static void main(String[] args) {
    
    int []arr = {2,5,10,45,88,33,20,45};

    new_reverse_array(arr);
    System.out.println(Arrays.toString(arr));
    
    reverse_array(arr, 4, 7);
    System.out.println(Arrays.toString(arr));
  }
  
  public static void reverse_array(int []arr, int start, int end) {
    
    while(start < end){

      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;

      start++;
      end--;
    }
  }

  public static void new_reverse_array(int []arr) {

    int start = 0;
    int end = arr.length-1-start;

    while(start < end){

      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;

      start++;
      end--;
    }
    
  }
}
