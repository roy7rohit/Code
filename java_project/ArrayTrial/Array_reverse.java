package ArrayTrial;

import java.util.Arrays;

public class Array_reverse {

  public static void main(String[] args) {
    
    int []arr = {1,3,2,8,4,7,6,1,5};
    System.out.println(Arrays.toString(arr));
    array_reverse(arr);
    System.out.println(Arrays.toString(arr));

  }
  public static void array_reverse(int []arr) {

    int i = 0;
    int j = arr.length - 1;
    while(i <= j){

      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;

      i++;
      j--;
    }
  }
}
    
  
  
