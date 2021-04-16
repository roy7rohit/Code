package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArrayIntersection {
  
  public static void main(String[] args) {

    int []arr1 = {1,2,3,5,8,9};
    int []arr2 = {2,5,6,4,9};
    ArrayList<Integer> list = getIntersection(arr1, arr2);
    System.out.println(list);

  }

  public static ArrayList<Integer> getIntersection(int[] arr1, int[] arr2){
    HashMap<Integer, Boolean> map = new HashMap<>();
    ArrayList<Integer> list = new ArrayList<>();
    for(int i=0; i<arr1.length; i++){
      map.put(arr1[i], false);
    }

    for(int j=0; j<arr2.length; j++){
      if(map.containsKey(arr2[j])){
        map.put(arr2[j], true);
      }
    }

    Set<Map.Entry<Integer, Boolean>> entries = map.entrySet();
    for(Map.Entry<Integer, Boolean> entry : entries){
      if(entry.getValue()){
        list.add(entry.getKey());
      }
    }
    return list;
  }

}