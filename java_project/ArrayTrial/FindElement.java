package ArrayTrial;

import java.util.Scanner;

public class FindElement {
 
  public static void main(String[] args) {
    
    Scanner sn = new Scanner(System.in);
    int size = sn.nextInt();
    int[] arr = new int[size];

    for(int i=0; i<arr.length; i++){

      arr[i] = sn.nextInt();
    }

    int res = findElement(arr, 10);
    System.out.println(res);
  }
  public static int findElement(int[] arr, int item) {
    
    for(int i=0; i<arr.length; i++){

      if(arr[i] == item){

        return i;
      }
    }
    return -1;
  }
}