package Array_demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraysRverse {

  public static void main(String[] args) {

    ArrayList arrList = new ArrayList();
    
    int []arrList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    Collections.reverse(arrList);

    int []arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    System.out.println(Arrays.toString(arr));

    Array_Reverse(arr);
    System.out.println(Arrays.toString(arr));

  }
  public static void Array_Reverse(int []arr) {

    for(int i=0; i<arr.length/2; i++){

      int temp = arr[i];
      arr[i] = arr[arr.length - 1 - i];
      arr[arr.length - 1 - i] = temp;
    
    }
    
  }
  
}