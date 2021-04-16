package twoD_Array;

public class OppositeWave_pattern {

  public static void main(String[] args) {
    
    int [][]arr = {{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
    OppositeWavePattern(arr);

  }

  public static void OppositeWavePattern(int [][]arr) {

    for(int i=0; i<arr.length; i++){

      if(i%2 == 0){

        for(int j=arr.length-1; j>=0; j--){

          System.out.print(arr[i][j]+" ");
        }
      }
      else{

        for(int j=0; j<=arr.length-1; j++){

          System.out.print(arr[i][j]+" ");
        }
      }
      System.out.println();
    }
    System.out.print("end");
  }
  
}