package Array_demo;

import java.util.Arrays;

public class LinearSearch {
  
  public static void main(String[] args) {
    
    int []arr = {1,6,4,0,9,-9,2,-5,12,-1,8};
    int target = -8;
    
    int res = Linear_Search(arr, target);

    // System.out.println(Arrays.toString(res));
    if(res == -1){
      System.out.println("element is not found in arry");
    }
    else{

      System.out.println("element found in array");
    }

  }
  
  public static int Linear_Search(int []arr, int target){

    for(int i=0; i<=arr.length-1; i++){

      if(arr[i] == target){

        return i;
      }
    }
    return -1;
  }
}