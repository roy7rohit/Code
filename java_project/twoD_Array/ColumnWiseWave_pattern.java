package twoD_Array;

public class ColumnWiseWave_pattern {

  public static void main(String[] args) {
    
    int [][]arr = {{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
    ColumnWiseWavePattern(arr);
  }
  
  public static void ColumnWiseWavePattern(int [][]arr) {
    
    for(int row=0; row<arr.length; row++){

        if(row%2 == 0){

          for(int col=0; col<arr.length; col++){

            System.out.print(arr[col][row]+" ");
          }
        }
        else{

          for(int col=arr.length-1; col>=0; col--){

            System.out.print(arr[col][row]+" ");
          }
        }
        System.out.println();
      }
      System.out.print("end");
    }
    
  }
