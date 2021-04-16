package ArrayTrial;

import java.util.Arrays;

public class RotationOfArray{

  public static void main(String[] args) {
    
    int []arr = {1,2,3,4,5,6};
    int k=2;
    array_rotation(arr, 0,arr.length-1);
    array_rotation(arr, arr.length-2, arr.length-1);
    array_rotation(arr, 0, arr.length-3);
    System.out.println(Arrays.toString(arr));


  }
  public static void array_rotation(int []arr, int start, int end) {
    

    while(start<end){
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;

    }
  }
}