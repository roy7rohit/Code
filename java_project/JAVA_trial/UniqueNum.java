package JAVA_trial;

public class UniqueNum {
 
  public static void main(String[] args) {
    
    int []arr = {1,1,2,5,2,4,4,9,5};
    UniqueNum2(arr);

    for(int i=0; i<arr.length; i++){

      boolean flag = false;
      int selected = arr[i];
      for(int j=0; j<arr.length; j++){
      if(i != j){  
        int pair = arr[j];
        if(pair == selected){

          flag = true;

        }
      }
    }
      if(flag == false){

        System.out.println(selected);
      }
    }
  }

  public static void UniqueNum2(int []arr) {

    int ans = 0;
    for(int i=0; i<arr.length; i++){

      ans = ans ^ arr[i];
    }
    System.out.println(ans);
  }
}