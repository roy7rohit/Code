package twoD_Array;

// import java.util.Scanner;

public class ArrayMaxAndSmax{

  public static void main(String[] args) {
    
    int []arr = {2,5,8,6,9,4,3};
    MaxandSmax(arr);
    display(arr);
  }
    
private static void MaxandSmax(int[] arr) {
    
    int max = 0, smax = 0;
    for(int i=0; i<arr.length; i++){
      if(arr[i] > max){

        smax = max;
        max = arr[i];
      }
      else if(arr[i] > smax && arr[i] != max){

        smax = arr[i];
      }
      }
  
}
private static void display(int []arr) {
  
  for(int i=0; i<arr.length; i++){

    System.out.println(arr[i]);
  }
}
}