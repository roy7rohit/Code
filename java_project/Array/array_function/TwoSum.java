package Array.array_function;
public class TwoSum {
  
  public static void main(String[] args) {
    
    int []arr = {3,1,9,7,5,-1};
    twosum(arr);

  }
  public static void twosum(int []arr) {
    
    for(int i=0; i<=arr.length-2; i++){
      int first = arr[i];//3
      for(int j=i+1; j<=arr.length-1; j++){

        if(first+arr[j] == 8){

          System.out.println(first +" , "+ arr[j]);
        }
      }
    }
  }
}