package Array.array_function;

public class BinarySearch {

  public static void main(String[] args) {
    
    int []arr = {2,4,5,9,12,23,56,65,74,79};
    int item = 65;
    System.out.println(binary_search(arr, item));
    // reverse(arr);
    // display(arr);
  }

  public static int binary_search(int []arr, int item) {

    int start = 0;
    int end = arr.length;
    while(start <= end){

      int mid = (start + end) / 2;

      if(arr[mid] == item){

        return mid;
      }
      else if(arr[mid] > item){

        end = mid - 1;     
      }
      else{

        start = mid + 1;
      }
    }
    return -1;
  }

  public static void reverse(int[]arr) {

    int start = 0;
    int end = arr.length - 1;

    while(start < end){

      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
    
  }
  public static void display(int []arr) {

    for(int i=0; i<arr.length; i++){

      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
  
}