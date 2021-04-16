package twoD_Array;

public class TwoDArray {
   
  public static void main(String[] args) {
    
    // int [][]arr;

  //  int [][] arr = new int[3][3];
    int[][] arr = new int[3][];
    arr[0] = new int[4];
    arr[2] = new int[3];

    // System.out.println(arr[0][0]);
    // System.out.println(arr[1]);
    // System.out.println(arr[2][2]);


    // System.out.println(arr[0][0]);
    // arr[0][2] = 45;
    // arr[1][2] = 12;

    for(int i=0;i<arr.length; i++){
      for(int j=0; j<arr[i].length; j++){

        System.out.print(arr[i][j] + " ");
      }
      System.out.println();

    }
  }
  private static name() {
    
  }
  
  
}