package ArrayTrial;

public class MaximumSubarraySum {
 
  public static void main(String[] args) {
   
    int[] arr = {1,2,-5,5,6,9,8,3};

    int res = maxSunarraySum(arr);
    System.out.println(res);

  }
  public static int maxSunarraySum(int []arr) {
    
    int maxsum = arr[0];
    int sum = arr[0];

    for(int i=0; i<arr.length; i++){

      if(sum < 0){

        sum = arr[i];
      }
      else{

        sum = sum + arr[i];
      }

      maxsum = Math.max(sum, maxsum);
    }
    return maxsum;
  }
}