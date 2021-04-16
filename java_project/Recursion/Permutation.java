package Recursion;

import java.util.ArrayList;

public class Permutation {
 public static void main(String[] args) {
   
  System.out.println(permutation("abcd"));

 } 
 public static ArrayList<String> permutation(String str) {
   if(str.length() == 0){
     ArrayList<String> base = new ArrayList<>();
     base.add("");
     return base;
   }

   char ch = str.charAt(0);
   String ans = str.substring(1);

   ArrayList<String> recurRes = permutation(ans);
   ArrayList<String> myRes = new ArrayList<>();

   for(String recres : recurRes){

    for(int i=0; i<=recres.length(); i++){

      String val = recres.substring(0, i) + ch + recres.substring(i);
      myRes.add(val);
    }
   }
   return myRes;
 }

}