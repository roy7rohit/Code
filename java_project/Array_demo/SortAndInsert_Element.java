package Array_demo;

import java.util.Arrays;

public class SortAndInsert_Element {

  public static void main(String[] args) {
    
    int []arr = {1,5,9,3,4,6,7,11,10,-9,5,-4,-1,22};
    Arrays.sort(arr);

    // System.out.println(Arrays.toString(arr));

    int index = Arrays.binarySearch(arr, 10);
    // System.out.println(index);

    // printArray("sorted array", arr);
    System.out.println(Arrays.toString(InsertElement(arr, 21, 5)));



  }
  private static void printArray(String message, int array[]) {
    System.out.println(message + ": [length: " + array.length + "]");
    for (int i = 0; i < array.length; i++) {
       if (i != 0){
          System.out.print(", ");
       }
       System.out.print(array[i]);         
    }
    System.out.println();
  
}

public static int[] InsertElement(int []arr, int element, int index) {
  
  int size = arr.length;
  int[] destination = new int[size + 1];
  System.arraycopy(arr, 0, destination, 0, index);

  destination[index] = element;
  System.arraycopy(arr, index, destination, index + 1, size - index);

  return destination;
  
}
}