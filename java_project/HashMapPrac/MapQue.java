package HashMapPrac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Map.Entry;

public class MapQue {
  
  public static void freqMap_pos(String str){
    HashMap<Character, ArrayList<Integer>> map = new HashMap<>();
    for(int i=0 ; i<str.length(); i++){
      char ch = str.charAt(i);
      map.putIfAbsent(ch, new ArrayList<>());
      map.get(ch).add(i);
    }

    for(Character ch : map.keySet()){
      System.out.print(ch + " -> " + map.get(ch) + " ");
    }
  } 


  public static void freqMap(String str){
    HashMap<Character, Integer> map = new HashMap<>();
    for(int i=0; i<str.length(); i++){
      char ch = str.charAt(i);
      map.put(ch, map.getOrDefault(ch, 0) + 1);
    }

    // for(Character ch : map.keySet()){
    //   System.out.println(ch);
    // }
    for(Entry<Character, Integer> entry : map.entrySet()){
      System.out.print(entry.getKey() + "" + entry.getValue() + " ");
    }
  }

  //======================================================================================================

  public static int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> set = new HashSet<>();
    for(int ele : nums1){
      set.add(ele);
    }
    ArrayList<Integer> ans = new ArrayList<>();
    for(int ele : nums2){
      if(set.contains(ele)){
        ans.add(ele);
        set.remove(ele);
      }
    }

    int []arr = new int[ans.size()];
    // int i = 0;
    // for(int ele : ans){
    //   arr[i++] = ele;
    // }

    for(int i=0; i<ans.size(); i++){
      arr[i] = ans.get(i);
    }
    return arr;
  }


  public static int[] intersect_02(int[] nums1, int[] nums2) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int ele : nums1){
      map.put(ele, map.getOrDefault(ele, 0) + 1);
    }
    ArrayList<Integer> ans = new ArrayList<>();
    for(int ele : nums2){
      if(map.containsKey(ele)){
        ans.add(ele);
        map.put(ele, map.get(ele) - 1); // reduce the ele frequency(ele--)
        if(map.get(ele) == 0){
          map.remove(ele);
        }
      }
    }
    int []arr = new int[ans.size()];
    for(int i=0; i<ans.size(); i++){
      arr[i] = ans.get(i);
    }
    return arr;
  }

  public static boolean containsNearbyDuplicate(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i=0; i<nums.length; i++){
      if(map.containsKey(nums[i])){
        int idx = map.get(nums[i]);
        if(i - idx <= k){
          return true;
        }
      }
      map.put(nums[i], i);
    }
    return false;
  }


  public static String frequencySort(String str) {

    HashMap<Character, Integer> map = new HashMap<>();
    for(int i=0; i<str.length(); i++){
      char ch = str.charAt(i);
      map.put(ch, map.getOrDefault(ch, 0) + 1);
    }

    PriorityQueue<Character> pq = new PriorityQueue<>((a, b)->{
      return map.get(b) - map.get(a); // accessing the keys
    }); 

    for(Character ch : map.keySet()){
      pq.add(ch);
    }

    StringBuilder sb = new StringBuilder();
    while(pq.size() != 0){
      Character ch = pq.remove(); // catch the character
      int freq = map.get(ch); // get the frequency of characters 
      for(int i=0;i<freq; i++){
        sb.append(ch);
      }
    }
        
    return sb.toString();
  }


  public static int[] topKFrequent(int[] nums, int k) {
   
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int ele : nums){
      map.put(ele, map.getOrDefault(ele, 0) + 1);
    }

    PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)->{
      return map.get(a) - map.get(b);
    });

    for(Integer key : map.keySet()){
      pq.add(key);
      if(pq.size() > k){
        pq.remove();
      }
    }
    int []ans = new int[k];
    int i = 0;
    while(pq.size() != 0){
      ans[i++] = pq.remove();
    }
    return ans;
  }


  //====================================================================================================

  public static void mapFreq(String str){
    HashMap<Character, Integer> map = new HashMap<>();
    for(int i=0; i<str.length(); i++){
      char ch = str.charAt(i);
      map.put(ch, map.getOrDefault(ch, 0) + 1);
    }
    // for(Character ch : map.keySet()){
    //   System.out.print(ch +" ");
    // }
    // System.out.println(map);

    for(Entry<Character, Integer> entry : map.entrySet()){
      // System.out.print(entry.getKey() +""+ entry.getValue() + " ");
      // System.out.print(entry+" ");
    }
  }


  public static void freqPos(String str){
    HashMap<Character, ArrayList<Integer>> map = new HashMap<>();
    for(int i=0; i<str.length(); i++){
      char ch = str.charAt(i);
      map.putIfAbsent(ch, new ArrayList<>());
      map.get(ch).add(i);
    }

    for(Character ch : map.keySet()){
      System.out.print(ch + " -> " + map.get(ch) +" ");
    }
  }

  public static int[] inttersect(int[] nums1, int[] nums2){

    HashSet<Integer> set = new HashSet<>();
    for(int ele : nums1){
      set.add(ele);
    }

    ArrayList<Integer> ans = new ArrayList<>();
    for(int ele : nums2){
      if(set.contains(ele)){
        ans.add(ele);
        set.remove(ele);
      }
    }

    int []arr = new int[ans.size()];
    for(int i=0; i<ans.size(); i++){
      arr[i] = ans.get(i);
    }
    return arr;
  } 


  public static int[] intersect_03(int []nums1, int []nums2){
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int ele : nums1){
      map.put(ele, map.getOrDefault(ele, 0) + 1);
    }

    ArrayList<Integer> ans = new ArrayList<>();
    for(int ele : nums2){
      if(map.containsKey(ele)){
        ans.add(ele);
        map.put(ele, map.getOrDefault(ele, 0) - 1);
        if(map.get(ele) == 0){
          map.remove(ele);
        }
      }
    }

    int []arr = new int[ans.size()];
      for(int i=0; i<ans.size(); i++){
        arr[i] = ans.get(i);
      }
    return arr;
  }

  public static boolean anagrams(String str1, String str2) {
    if(str1.length() != str2.length()){
      return false;
    }

    char []s1 = str1.toCharArray();
    char []s2 = str2.toCharArray();
    Arrays.sort(s1);
    Arrays.sort(s2);


    for(int i=0; i<s1.length; i++){
      if(s1[i] != s2[i]){
        return false;
      }
    }
    return true;
    // return s1.equals(s2);
  }


  //=======================================================================================================

  public static String sortCharByFrequency(String str){

    HashMap<Character, Integer> map = new HashMap<>();
    for(int i=0; i<str.length(); i++){
      char ch = str.charAt(i);
      map.put(ch, map.getOrDefault(ch, 0) + 1);
    }

    PriorityQueue<Character> pq = new PriorityQueue<>((a, b)->{
      return map.get(b) - map.get(a); // max heap it will behave in correspond to char's frequency
    });

    for(Character ch : map.keySet()){
      pq.add(ch);
    }

    StringBuilder sb = new StringBuilder();
    while(pq.size() != 0){
      Character ch = pq.remove();
      int freq = map.get(ch);

      for(int i=0; i<freq; i++){
        sb.append(ch);
      }
    }
    // System.out.println(sb);
    return sb.toString();
  }


  public static void LCSequence(int []arr){
    HashMap<Integer, Boolean> map = new HashMap<>();
    for(int val : arr){
      map.put(val, true);
    }  

    for(int val : arr){
      if(map.containsKey(val - 1)){
        map.put(val, false);
      }
    }

    int ml = 0; // maximum consecutive length
    int msp = 0; // starting point of maximum consecutive array
    
    for(int val : arr){
      int tl = 1; // temp length
      int tsp = val; // temp starting point

      while(map.containsKey(tsp + tl)){
        tl++;
      }

      if(tl > ml){
        ml = tl;
        msp = tsp;
      }
    }

    System.out.println(msp + " -> " + ml);
  }

  //Priority Queue : ===================================================================

  public static void PQ(int []arr){
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for(int val : arr){
      pq.add(val);
    }

    while(pq.size() != 0){
      // System.out.print(pq.remove() + " ");
      System.out.print(pq.peek() + " ");
      pq.remove();
    }
  }


  public static int kthLargest(int []arr, int k){
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for(int val : arr){
      pq.add(val);
      if(pq.size() > k){
        pq.remove();
      }
    }

    return pq.remove();
  }

  public static int kthSmallest(int []arr, int k){
    PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)->{
      return b - a;
    });

    for(int val : arr){
      pq.add(val);
      if(pq.size() > k){
        pq.remove();
      }
    }
    return pq.remove();
  }


  //Median priority Queue Construction : =================================================================

  public static class MedianPQ{
    PriorityQueue<Integer> left;
    PriorityQueue<Integer> right;

    public MedianPQ(){
      left = new PriorityQueue<>((a, b)->{
        return b - a;
      }); // max PQ

      right = new PriorityQueue<>(); // min PQ
    }

    public void add(int val){
      if(right.size() > 0 && val > right.peek()){
        right.add(val);
      }else{
        left.add(val);
      }

      // now check the balance of elements in both priority Queue

      if(left.size() - right.size() == 2){
        right.add(left.remove());
      }else if(right.size() - left.size() == 2){
        left.add(right.remove());
      }
    }

    public int remove(){
      if(this.size() == 0){
        System.out.println("Overflow");
        return -1;
      }
      else if(left.size() >= right.size()){
        return left.remove();
      }
      else{
        return right.remove();
      }
    }

    public int peek(){
      if(this.size() == 0){
        System.out.println("Overflow");
        return -1;
      }
      else if(left.size() >= right.size()){
        return left.peek();
      }else{
        return right.peek();
      }
    }
    public int size(){
      return left.size() + right.size();
    }
  } 

  
 //=====================================================================================

  public static void solve(){
    // freqMap("ajhvcjhjhagsx1321465kasjdbd8445632");
    // freqMap_pos("ajhvcjhjhagsx1321465kasjdbd8445632");

    int []nums1 = {4,9,5, 9, 9, 4, 4}; int []nums2 = {9,4,9,8,4, 4, 4, 9,9};
    // System.out.println(Arrays.toString(intersection(nums1, nums2))); 

    // System.out.println(Arrays.toString(intersect_02(nums1, nums2))); 

    // System.out.println(containsNearbyDuplicate(nums1, 6));

    // System.out.println(frequencySort("ssstttttrraaaammm00000000nnn"));
    // System.out.println(Arrays.toString(topKFrequent(nums1, 2)));
  }

  public static void set2(){

    // mapFreq("ajhvcjhjhagsx1321465kasjdbd8445632");
    // freqPos("ajhvcjhjhagsx1321465kasjdbd8445632");

    int []nums1 = {4,9,5, 9, 9, 4, 4, 3, 4, 5, 8, 7};
    int []nums2 = {9,4,9,8,4, 4, 4, 9,9, 5,5, 3, 4, 5, 4, 3, 7, 8};
    // System.out.println(Arrays.toString(inttersect(nums1, nums2)));
    // System.out.println(Arrays.toString(intersect_03(nums1, nums2)));

    // String str1 = "anagram";
    // String str2 = "naamarg";

    // System.out.println(anagrams(str1, str2));
  }

  public static void set3(){
    // System.out.println(sortCharByFrequency("ajhvcjhjhagsx1321465kasjdbd8445632"));

    int []arr = {10, 5, 9, 1, 11, 8, 6, 15, 3, 12, 2};
    // LCSequence(arr);
    PQ(arr);
    System.out.println("********************************************");
    System.out.println(kthLargest(arr, 4));
    
    System.out.println("********************************************");
    System.out.println(kthSmallest(arr, 4));
  }
  public static void main(String[] args) {
    // solve();
    // set2();
    // set3();

    MedianPQ pq = new MedianPQ();
    pq.add(10);
    pq.add(20);
    pq.add(30);
    pq.add(40);
    pq.add(50);
    pq.add(60);
    pq.add(70);

    pq.remove();
    pq.peek();
    pq.add(80);
    pq.remove();
    pq.peek();

    pq.add(90);
    pq.peek();
    pq.remove();
  }
}
