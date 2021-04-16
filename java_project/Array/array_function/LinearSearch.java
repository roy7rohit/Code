package Array.array_function;

public class LinearSearch {
  
  public static void main(String[] args) {
    
    int []arr = {10,25,32,12,2,65};
    int item = 12;

    System.out.println(linear_search(arr, item));
  }
  public static int linear_search(int arr[], int item) {

    for(int i=0; i<arr.length; i++){
      if(arr[i] == item){

        return i;
      }

    }
    return -1;
  }
}