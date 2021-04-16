package twoD_Array;

public class KadaneAlgo {
  
  public static void main(String[] args) {
    
    int []arr = {2,3,-6,1,2,3,-4,5};
    int curr_sum = arr[0];
    int ovll_sum = arr[0];

    for(int i=1; i<arr.length; i++){

      if(curr_sum < 0){
        curr_sum = arr[i];
      }
      else{
        curr_sum += arr[i];
      }

      if(curr_sum > ovll_sum){
        ovll_sum = curr_sum;
      }
    }

    System.out.println(ovll_sum);
  }
}