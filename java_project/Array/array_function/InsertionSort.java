package Array.array_function;

// import java.lang.reflect.Array;

// import java.util.Arrays;


public class InsertionSort {
  public static void main(String[] args) {

    // int []arr = {88,11,44,77,99,33};
    // int []arr = {64,25,12,22,11};
    int []arr = {2,1,6,4,9,3,7,8,0,3,7,5,3,1};
    insertion_sort(arr);
    display(arr);
    // System.out.println(Array.toString(arr));
    
  }
 public static void insertion_sort(int []arr) {
   for(int counter=1; counter<=arr.length-1; counter++){

    int val = arr[counter];

    int j = counter - 1;

    while(j>=0 && arr[j] > val){

      arr[j+1] = arr[j];
      j--;
    }
    arr[j+1] = val;
  }
 }
 public static void display(int []arr) {

  for(int i=0; i<arr.length; i++){

    System.out.print(arr[i] + " ");
  }
   
 }

}