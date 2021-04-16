package ArrayTrial;

import java.util.Arrays;
import java.util.Scanner;

public class LongestIncreasingSubarray {
  
  public static void main(String[] args) {
    
    Scanner sn = new Scanner(System.in);
    int size = sn.nextInt();

    int []arr = new int[size];

    for(int i=0; i<arr.length; i++){

      arr[i] = sn.nextInt();
    }

    int res = longestIncreasing_Subarray(arr);
    System.out.println();
    System.out.println(res);
  }
  public static int longestIncreasing_Subarray(int []arr) {

    if(arr.length == 0){
      return 0;
    }

    int len = 1;
    int maxlen = 1;

    for(int i=1; i<arr.length; i++){
      if(arr[i-1] < arr[i]){

        len++;
      }
      else{

        len = 1;
      }
      maxlen = Math.max(len, maxlen);
    }
    return maxlen;
    
  }
}
