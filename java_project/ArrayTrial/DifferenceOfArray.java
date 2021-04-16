package ArrayTrial;

import java.util.Scanner;

public class DifferenceOfArray {
  
  public static void main(String[] args) {
    
    Scanner sn = new Scanner(System.in);
    int size1 = sn.nextInt();
    int []arr1 = new int[size1];

    for(int i=0; i<arr1.length; i++){

      arr1[i] = sn.nextInt();
    }
    int size2 = sn.nextInt();
    int []arr2 = new int[size2];

    for(int i=0; i<arr2.length; i++){

      arr2[i] = sn.nextInt();
    }

    diffOfArray(arr1, arr2);
  }

  public static void diffOfArray(int[] arr1, int[] arr2) {
    
    int max = Math.max(arr1.length, arr2.length);
    int[] res = new int[max];

    int borrow = 0;

    int i = arr1.length-1;
    int j = arr2.length-1;
    int k = res.length-1;

    while(k >= 0){

      int ans = 0;
      int arr1_val = i >= 0 ? arr1[i] : 0;

      if(arr2[j] + borrow >= arr1_val){

        ans = arr2[j] + borrow - arr1_val;
      }
      else{

        ans = arr2[j] + borrow + 10 - arr1_val;
        borrow = -1;
      }

      res[k] = ans;
      i--;
      j--;
      k--;

    }
    int indx = 0;
    while(indx < res.length){

      if(res[indx] == 0){

        indx++;
      }
      else{
        break;
      }
    }
    while(indx < res.length){

      System.out.print(res[indx]);
      indx++;
    }
    System.out.println();
  }
}