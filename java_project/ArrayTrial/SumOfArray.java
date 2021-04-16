package ArrayTrial;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfArray {

  public static void main(String[] args) {
    
    Scanner sn = new Scanner(System.in);
    int size1 = sn.nextInt();
    int[] arr1 = new int[size1];

    for(int i=0; i<arr1.length; i++){
      arr1[i] = sn.nextInt();
    }
    int size2 = sn.nextInt();
    int[] arr2 = new int[size2];
    
    for(int i=0; i<arr2.length; i++){
      arr2[i] = sn.nextInt();
    }
    sumOfArray(arr1, arr2);

  }
 
  public static void sumOfArray(int[]arr1, int []arr2) {
    int max = Math.max(arr1.length, arr2.length);
    int []res = new int[max];

    int carry = 0;

    int i = arr1.length-1;
    int j = arr2.length-1;
    int k = res.length-1;

    while(k >= 0){

      int ans = carry;

      if(i >= 0){

         ans = ans + arr1[i];
      }

      if(j >= 0){

        ans = ans + arr2[j];
      }
      carry = ans / 10;
      ans = ans % 10;

      res[k] = ans;

      i--;
      j--;
      k--;
    }

    if(carry != 0){

      System.out.print(carry);
    }
    for(int val : res){

      System.out.print(val);
    }
  }
  }
  
