package Array.array_function;

import java.util.Scanner;

public class returnarray {

  static Scanner sn = new Scanner(System.in);

  public static void main(String[] args) {
    
    // int[] array = takeInput();
    // display(array);

    int array[] = {10, 20, 5, 56, 96, 1009};
    System.out.println(maxInArray(array));
    int item = 96;
    System.out.println(linearSearch(array, item));

  }

  public static int[] takeInput() {
    
    System.out.println("size?");
    int n = sn.nextInt();

    int arr[] = new int[n];

    for(int i=0; i<arr.length; i++){

      System.out.println("enter the value for"+  i  +"index?");
      arr[i] = sn.nextInt();

    }
    return arr;

  }
  public static void display(int[] arr) {

    for(int i=0; i<arr.length; i++){
      System.out.println(arr[i]);
    }
  }

  public static int  maxInArray(int arr[]) {
    
    int max = Integer.MIN_VALUE;
    
    for(int i=0; i<arr.length; i++){
      
      if(arr[i] > max){

        max = arr[i];
    }
  }
    return max;
  }
  public static int linearSearch(int[] arr, int item) {
    
    for(int i=0; i<arr.length; i++){
      if(arr[i] == item){

        return i;
      }
      
    }
    return -1;
  }
}