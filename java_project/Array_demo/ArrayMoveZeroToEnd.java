package Array_demo;

public class ArrayMoveZeroToEnd {
 
  public static void main(String[] args) {
    
    int[] arr = {1,0,2,0,3,5,6,0,0,4,7};
    arrayMovement(arr);

  }

  public static void arrayMovement(int[] arr) {
    
    int len = arr.length;
    int count = 0;

    for(int i=0; i<len; i++){

      if(arr[i] != 0){

        arr[count++] = arr[i];
      }
    }

    while(count < len){

      arr[count++] = 0;
    }
    for(int j=0; j<len; j++){

      System.out.print(arr[j] + " ");
    }
  }
}