package Recursion;
import java.util.ArrayList;

public class RecursionArray {
  
  public static void main(String[] args) {
    // int []arr = {1,2,3,4,5};
    // displayArray(arr, 0);
    // System.out.println(maximum(arr, 0));
    // System.out.println(subSequence("abc"));
    // System.out.println(strSubsequenceWithAscii("abc"));
    // PrintKeyPad("135", "");
    System.out.println(SubSequence("abcd"));

   
  }

  public static void displayArray(int[] arr, int indx) {
    if(indx == arr.length){
      return;
    }
    int ans = arr[indx];
    System.out.print(ans + " ");
    displayArray(arr, indx + 1);
    System.out.print(ans + " ");
    
  }

  public static int maximum(int[] arr, int indx) {
      if(indx == arr.length) return -1;
      int max = arr[indx];
      return Math.max(max, maximum(arr, indx + 1));
  }

  public static ArrayList<String> subSequence(String str) {

    if(str.length() == 0){
      ArrayList<String> base = new ArrayList<>();
      base.add("");
      return base;
    }
    
    char ch = str.charAt(0);
    String subStr = str.substring(1);

    ArrayList<String> recur_str = subSequence(subStr);
    ArrayList<String> myAns = new ArrayList<>();

    for(String my_recur_res : recur_str){

      myAns.add(my_recur_res);
      myAns.add(my_recur_res + ch);
    }
    return myAns;

  }

  public static ArrayList<String> strSubsequenceWithAscii(String str) {
    
    if(str.length() == 0){
      ArrayList<String> base =  new ArrayList<>();
      base.add("");
      return base;
    }

    char ch = str.charAt(0);
    String ans = str.substring(1);

    ArrayList<String> recurAns = strSubsequenceWithAscii(ans);
    ArrayList<String> myResult = new ArrayList<>();

    for(String recur_str : recurAns){
      myResult.add(recur_str);
      myResult.add(ch + recur_str);
      myResult.add((int)ch + recur_str);
    }

    return myResult;
  }

  static String[] codes = {".,/?:=+*$@!~^()", "abc", "def","ghi", "ijk", "lmno", "pqrs", "tuv", "wxyz"};

  public static void PrintKeyPad(String str, String ansSoFar){
    if(str.length() == 0){
      System.out.print(ansSoFar + " ");
      return;
    }

    char ch = str.charAt(0);
    String ans = str.substring(1);

    String chCodes = codes[ch - '0'];
    for(int i=0; i <= chCodes.length()-1; i++){
      char chChoice = chCodes.charAt(i);
      PrintKeyPad(ans,  chChoice + ansSoFar);
    }

  }

  public static ArrayList<String> SubSequence(String str){
    if(str.length() == 0){
      ArrayList<String> base = new ArrayList<>();
      base.add("");
      return base;
    }

    char ch = str.charAt(0);
    String ans = str.substring(1);
    ArrayList<String> recurRes = SubSequence(ans);
    ArrayList<String> StoreRecurRes = new ArrayList<>();

    for(int i=0; i<recurRes.size(); i++){

      StoreRecurRes.add(recurRes.get(i));
      StoreRecurRes.add(ch + recurRes.get(i));
      StoreRecurRes.add((int)ch + recurRes.get(i));
      

    }
    return StoreRecurRes;
  }
}