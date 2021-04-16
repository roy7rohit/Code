package ArrayTrial;

public class Linear_search {
  
  public static void main(String[] args) {
    
    int []arr = {1,5,1,7,9,2,35,10};

    int res = linear_search(arr, 7);
    System.out.println(res);
    
  }

  public static int linear_search(int []arr, int item) {
    
    for(int i=0; i<arr.length; i++){

      if(arr[i] == item){

        return i;
      }
}
    return -1;
}
}