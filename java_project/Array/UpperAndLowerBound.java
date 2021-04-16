package array; 

public class UpperAndLowerBound {
  
  public static void main(String[] args) {
    
    int []array = {1,2,3,3,4,4,5,5,5,6,6,7,7,7,7};

    System.out.println(lower_bound(array, 2));
    System.out.println(upper_bound(array, 2));

    System.out.println(lower_bound(array, 7));
    System.out.println(upper_bound(array, 7));
  }
  public static int lower_bound(int[]arr, int item) {
    int start = 0, end = arr.length-1;
    int ans = -1;
    while(start<=end){

      int mid = (start+end)/2;
      
      if(arr[mid] == item){
        ans = mid;
        end = mid-1;
      }
      else if(arr[mid] < item){

        start = mid+1;
      }
      else{
        end = mid+1;
      }
       
    }
    return ans;
  }
  public static int upper_bound(int []arr, int item){
    int start=0, end=arr.length-1;
    int ans = -1;
    while(start<=end){
      int mid = (start + end)/2;

      if(arr[mid]==item){
        ans = mid;
        start = mid+1;
      }
      else if(arr[mid]>item){
        end = mid-1;
      }
      else{
        start = mid + 1;
      }
  }
  return ans;
}

}