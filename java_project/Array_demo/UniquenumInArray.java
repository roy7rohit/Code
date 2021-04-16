package Array_demo;

public class UniquenumInArray {
 
  public static void main(String[] args) {
    
  int[] arr = {1,2,3,5,2,1,3};
  unique(arr); 
  }

  public static void unique(int[] arr) {
    
    for(int i=0; i<arr.length; i++){

      boolean flag = false;
      int x_num = arr[i];

      for(int j=0; j<arr.length; j++){
        if(i != j){
        int y_num = arr[j];

        if(x_num == y_num){

          flag = true;
        }

        }
      }

      if(flag == false){

        System.out.println(x_num);
      }
    }
  }
}