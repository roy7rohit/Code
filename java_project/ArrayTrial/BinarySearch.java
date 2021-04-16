package ArrayTrial;

import java.util.Arrays;

public class BinarySearch {

  public static void main(String[] args) {
    
    int []arr = {2,3,4,5,7,8,9,11,23,34,45,67,78,89,99};

    int res =  binary_search(arr, 23);
    System.out.println(Arrays.toString(arr));

    System.out.println(res);
  }

  public static int binary_search(int []arr, int item) {
    
    int start = 0;
    int end = arr.length;
    // int ans = -1;

    while(start <= end){

      int mid = (start + end)/2;

      if(arr[mid] == item){

        return mid;
      }
      else if(arr[mid] < item){

        start = mid + 1;
      }
      else{

        end = mid - 1;
      }
    }
    return -1;
  }
  
}