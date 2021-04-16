package Array.array_function;

 import java.util.Arrays;

public class SelectionSort {
  public static void main(String[] args) {

    // int []arr = {2,1,6,4,9,3,7,8,0,3,7,5,3,1};
    // int []arr = {99,88,77,55,44,33,22};
    int []arr = {64,25,12,22,11};
    selection_sort(arr);
    // display(arr);
     System.out.println(Arrays.toString(arr));
  }

  public static void selection_sort(int []arr) {
    
    // int last = arr.length-1;
    for(int counter=0; counter<arr.length-1; counter++){

      int min = counter;

      for(int i=counter + 1; i<arr.length; i++){

        if(arr[i] < arr[min]){

          min  = i;//update the index
        }
        int temp = arr[min];
        arr[min] = arr[counter];
        arr[counter] = temp;
      }
    }

  }
  public static void dispaly(int[] arr) {

    for(int i=0; i<arr.length; i++){
  
      System.out.println(arr[i]);
    }
     
   }
}