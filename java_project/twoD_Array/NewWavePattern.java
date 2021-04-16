package twoD_Array;

public class NewWavePattern {

  public static void main(String[] args) {
    
    int [][]arr = {{11,12,13,14},{21,22,23,24,25},{31,32,33,34},{41,42,43,44}};

    NewWavePattern_array(arr);

  }

  public static void NewWavePattern_array(int [][]arr) {
    
    for(int i=0; i<arr.length; i++){

      if(i%2 == 0){

        for(int j=0; j<arr.length; j++){

          System.out.println(arr[i][j]+" ");
        }
      }
      else{

        for(int j=arr.length-1; j>=0; j--){

          System.out.println(arr[i][j]+" ");
        }
      }
    }
    System.out.print("end");
  }
  
}