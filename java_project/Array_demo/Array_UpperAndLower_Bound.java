package Array_demo;

import javax.xml.stream.events.EndElement;

public class Array_UpperAndLower_Bound {

  public static void main(String[] args) {
    
    int []arr = {1,1,4,2,2,5,5,5,4,1,0,0,6,6,8,3,5,9,9,9,5,5,5,4,3,6,7,8,7,7,3,3,6,4};

    int res = upper_bound(arr, 4);
    System.out.println(res);

    int ans = lower_bound(arr, 4); 
    System.out.println(ans);

  }
  public static int  upper_bound(int []arr, int item) {
    
    int start = 0;
    int end = arr.length-1;
    int ans = -1;

    while(start <= end){

      int mid = (start + end)/2;
      if(arr[mid] == item){

        ans = mid;
        start = mid + 1;
      }
      else if(arr[mid] > item){

      end = mid - 1;
      }
      else{

        start = mid + 1;
      }

    }
    return ans;
  }

  public static int lower_bound(int []arr, int item) {
    
    int start = 0;
    int end = arr.length-1;
    int ans = -1;

    while(start <= end){

      int mid = (start + end)/2;
      if(arr[mid]== item){

        ans = mid;
        end = mid - 1;
      }
      else if(arr[mid] > item){

        end = mid - 1;
      }
      else{

        start = mid + 1;
      }
  }
  return ans;
}

}