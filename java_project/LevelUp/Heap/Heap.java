package LevelUp.Heap;
import java.util.ArrayList;

public class Heap {
  
  public static int height(int []arr, int vidx){
    if(vidx >= arr.length) return -1;

    int lh = height(arr, 2 * vidx + 1);
    int rh = height(arr, 2 * vidx + 2);

    return Math.max(lh, rh) + 1;
  } 

  public static class Heapify{
    ArrayList<Integer> arr = new ArrayList<>();
    boolean isMax = true;

    public Heapify(int[] data) {
      constructHeap(data);
    }

    public Heapify(int[] data,boolean isMax){
      this.isMax = isMax;
      constructHeap(data);
  }

    public void constructHeap(int[] data){
      for(int ele : data) this.arr.add(ele);

      int n = this.arr.size();
      for(int i = n-1; i >= 0; i--){
        downHeapify(i);
      }
    }

    public int compareTo(int a, int b){
      if(isMax){
        return arr.get(a) - arr.get(b);
      }else{
        return arr.get(b) - arr.get(a);
      }
    }


  
    private void downHeapify(int pi){
      int maxidx = pi;
      int lci = 2 * pi + 1;
      int rci = 2 * pi + 2;

      if(lci < arr.size() && compareTo(lci, maxidx) > 0){//agar iski value 0 se badi hai toh true nahi toh false
        maxidx = lci;
      }
      if(rci < arr.size() && compareTo(rci, maxidx) > 0){//agar iski value 0 se badi hai toh true nahi toh false
        maxidx = rci;
      }
 
      if(maxidx != pi){
        swap(pi, maxidx);
        downHeapify(maxidx);
      }
    }

    private void swap(int a, int b){
      int val1 = arr.get(a);
      int val2 = arr.get(b);

      this.arr.set(a, val2);
      this.arr.set(b, val1);
    } 

    public int size(){
      return this.arr.size();
    }

    public boolean isEmpty(){
      return this.arr.size() == 0;
    }

    public int top(){
      return this.arr.get(0);
    }

    public void push(int val){
      this.arr.add(val);
      int n = size();

      upheapify(n - 1);
    }

    private void upheapify(int ci) {
      int pi = (ci - 1) / 2;
      if(pi >= 0 && compareTo(ci, pi) > 0){//agar iski value 0 se badi hai toh true nahi toh false
        swap(ci, pi);
        upheapify(pi);
      }

    }

    public int pop() {
      swap(0, this.arr.size() - 1);

      int n = size();
      int rv = this.arr.remove(n - 1);

      downHeapify(0);

      return rv;
    }
  }

  public static void solve(){
    int []arr = { 10, 20, 30, -2, -3, -4, 5, 6, 7, 8, 9, 22, 11, 13 };
    Heapify pq = new Heapify(arr, true);
    while(pq.size() != 0){
      for(int ele : arr){
        System.out.print(ele + " ");
      }
      System.out.println();
      System.out.print(pq.pop() + " ");
    }
  }

  public static void main(String[] args) {
    solve();
  }
}





















// public class Heap{

//   public static int height(int[] arr,int vidx){
//       if(vidx >= arr.length) return -1;

//       int lh = height(arr, 2 * vidx + 1);
//       int rh = height(arr, 2 * vidx + 2);

//       return Math.max(lh,rh) + 1;
//   }


//   public static class Heapify{

//       ArrayList<Integer> arr=new ArrayList<>();
//       boolean isMax = true;

//       public Heapify(int[] data){
//           constructHeap(data);
//       }

//       public Heapify(int[] data,boolean isMax){
//           this.isMax = isMax;
//           constructHeap(data);
//       }

//       public void constructHeap(int[] data){
//           for(int ele: data) arr.add(ele);
//           int n = this.arr.size();

//           for(int i = n - 1; i >= 0 ;i--){  // O(nlogn) -> O(n)
//               downheapify(i);
//           }
//       }

//       public int compareTo(int a,int b){  // O(1)
//           if(isMax){
//               return arr.get(a) - arr.get(b);
//           }else
//              return arr.get(b) - arr.get(a);
//       }


//       private void upheapify(int ci){  //O(logn)
//           int pi = (ci - 1) / 2;

//           if(pi >=0 && compareTo(ci,pi) > 0) {
//               swap(ci,pi);
//               upheapify(pi);
//           }
//       }

//       private void downheapify(int pi){    // O(logn)
//           int maxidx = pi;
//           int lci = 2 * pi + 1;
//           int rci = 2 * pi + 2;

//           if(lci < arr.size() && compareTo(lci, maxidx) > 0)
//               maxidx = lci;
//           if(rci < arr.size() && compareTo(rci, maxidx) > 0)
//               maxidx = rci;

//           if(maxidx != pi){
//               swap(pi,maxidx);
//               downheapify(maxidx);
//           }
//       }

//       private void swap(int a ,int b){  //O(1)
//           int val1 = arr.get(a);
//           int val2 = arr.get(b);

//           this.arr.set(a,val2);
//           this.arr.set(b,val1);
//       }


//       public int size(){
//           return this.arr.size();
//       }

//       public boolean isEmpty(){
//           return this.arr.size() == 0;
//       }

//       public void push(int val){  //(logn)
//           this.arr.add(val);
//           int n =  size();
//           upheapify(n-1);
//       }

//       public int top(){   // O(1)
//           return arr.get(0);
//       }

//       public int pop(){  // O(logn)
//           swap(0,arr.size()-1);

//           int n=size();
//           int rv = this.arr.remove(n-1);

//           downheapify(0);

//           return rv;
//       }
//   }

//   public static void solve(){
//       int[] arr = { 10, 20, 30, -2, -3, -4, 5, 6, 7, 8, 9, 22, 11, 13 };
//       Heapify pq=new Heapify(arr,true);

//       while(pq.size()!=0){

//           for(int ele: pq.arr) System.out.print(ele + " ");
//           System.out.println();

//           System.out.print(pq.pop() + " ");
//       }
//   }

//   public static void main(String[] args){
//       solve();
//   }







// }