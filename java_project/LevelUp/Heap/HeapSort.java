package LevelUp.Heap;

public class HeapSort {
  
  public static boolean compareTo(int []arr, boolean isMax, int a, int b){
    if(isMax){
      return arr[a] > arr[b];
    }else{
      return arr[b] > arr[a];
    }
  }

  private static void downheapify(int []arr, int pi, boolean isMax, int n){
    int maxidx = pi;
    int lci = 2 * pi + 1;
    int rci = 2 * pi + 2;

    if(lci <= n && compareTo(arr, isMax, lci, maxidx)){
      maxidx = lci;
    }
    if(rci <= n && compareTo(arr, isMax, rci, maxidx)){
      maxidx = rci;
    }

    if(maxidx != pi){
      swap(arr[pi], arr[maxidx]);
      downheapify(arr, maxidx, isMax, n);
    }
  }

  public static void swap(int a, int b){
    int temp = a;
    a = b;
    b = temp;
  }

  public static void solve(){
    int []arr ={10, 20, 30, -2, -3, -4, 5, 6, 7, 8, 9, 22, 11, 13};
    int n = arr.length;
    boolean isMax = true;
     for(int i=n-1; i>=0; i--){

      downheapify(arr, i, isMax, n - 1);
     }
      int i = n-1;
      while(i >= 0){
        swap(arr[0], arr[i--]);
        downheapify(arr, 0, isMax, i);
      }

     for(int ele : arr) System.out.print(ele + " ");
     System.out.println();
  }
  public static void main(String[] args) {
    solve();
  }

}