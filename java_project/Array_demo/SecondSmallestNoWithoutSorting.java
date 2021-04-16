package Array_demo;

import java.util.Arrays;

public class SecondSmallestNoWithoutSorting {

  public static void main(String[] args) {
    
    int []arr = {1,5,3,6,4,9,8,-3,2};

    System.out.println(Arrays.toString(arr));

    int res = array(arr);
    
    System.out.println(res);
    if(res == Integer.MAX_VALUE){

      System.out.println("no is not second smallest");

    }
    else{

      System.out.println("no is second smallest");
    }

  }

  public static int array(int []arr) {
    
    int smallest = Integer.MAX_VALUE;
    int secondSmallest = Integer.MAX_VALUE;

    if(arr.length == 0 || arr.length < 2){
      return secondSmallest;
    }

    for(int i=0; i<arr.length; i++){

      if(smallest > arr[i]){

        secondSmallest = smallest;
        smallest = arr[i];
      }

      if(smallest < arr[i] && secondSmallest > arr[i]){

        secondSmallest = arr[i];
      }
    }

    return secondSmallest;
  }

}
