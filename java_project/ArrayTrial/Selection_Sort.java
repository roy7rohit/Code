package ArrayTrial;

import java.util.Arrays;

public class Selection_Sort {
  
  public static void main(String[] args) {
    
    int []arr = {2,4,7,1,5,3,4,5,3,9,98};
    SelectionSort(arr);
    System.out.println(Arrays.toString(arr));
    sorting(arr);
    System.out.println(Arrays.toString(arr));

  }
  public static void SelectionSort(int []arr) {

    int n = arr.length;
    
    for(int counter=0; counter<n-1; counter++){

      int min_idx = counter;
      for(int j=counter+1; j<n; j++){

        if(arr[j] < arr[min_idx]){

          min_idx = j;

        }
      }
      int temp = arr[min_idx];
      arr[min_idx] = arr[counter];
      arr[counter] = temp;
    }
  }
  public static void sorting(int []arr) {
  
  int n = arr.length;
 
  // One by one move boundary of unsorted subarray
  for (int i = 0; i < n-1; i++)
  {
      // Find the minimum element in unsorted array
      int min_idx = i;
      for (int j = i+1; j < n; j++)
          if (arr[j] < arr[min_idx])
              min_idx = j;

      // Swap the found minimum element with the first
      // element
      int temp = arr[min_idx];
      arr[min_idx] = arr[i];
      arr[i] = temp;
  }
}
}