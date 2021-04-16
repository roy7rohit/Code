package LevelUp;

import java.util.ArrayList;
import java.util.Scanner;

public class recursion {
   public static void main(String[] args) {
    //  set1();
    // set2();
    set3();
   }

   public static void set1(){
      Scanner sn = new Scanner(System.in);
      // System.out.println(fact(5));
      // incNdec(0 , 5);
      // oddEven(8);
      // System.out.println(power(2, 6));
      System.out.println(powerBtr(2, 6));
   }

   //set : 1 ====================================================================================
   public static int fact(int n){
      return n <= 1 ? 1 : fact(n - 1) * n;
   }

   public static void incNdec(int a, int b){
     if(a == b + 1){
       return;
     }
     System.out.println(a);
     incNdec(a + 1,b);
     System.out.println(a);
   }

   public static void oddEven(int n){
     if(n == 0){
       return;
     }
     if(n%2 == 1){
       System.out.println(n);
     }
     oddEven(n - 1);
     if(n%2 == 0){
       System.out.println(n);
     }
   }

   public static int power(int a, int b){
     if(b == 0){
       return 1;
     }
     return power(a, b - 1) * a;
   }

   public static int powerBtr(int a, int b){
     if(b == 0){
       return 1;
     }
     int ans = powerBtr(a, b/2);
     int res = ans * ans;
     return b%2 == 0 ? res : res * a; 
   }


   // set : 2 ===============================================================================

   public static void set2(){
    int[] arr ={1,23,45,2,67,3,23,6,8,43,567,2,457,584,6346,2,567973,523};
    // display(arr,0);
    // System.out.println(firstidx(arr, 0, 2));
    // System.out.println(lastidx_01(arr, arr.length - 1, 2));
    // System.out.println(lastidx_02(arr, 0, 2));
    // System.out.println(maximum(arr, 0));
    // System.out.println(minimum(arr, 0));
    // System.out.println(find(arr, 0, 24));
    // System.out.println(allidx(arr, 0, 2, 0));

   }

   public static void display(int []arr, int idx){
    if(idx == arr.length) return;

    System.out.print(arr[idx] + " ");
    display(arr, idx+1);
   }

   public static int firstidx(int []arr, int idx, int data){
      if(idx == arr.length) return -1;

      if(arr[idx] == data) return idx;

      return firstidx(arr, idx + 1, data);
   }

   public static int lastidx_01(int []arr, int idx, int data){
      if(idx == arr.length) return -1;

      if(arr[idx] == data) return idx;

      return lastidx_01(arr, idx - 1, data);
   }

   public static int lastidx_02(int []arr, int  idx, int data){
     if(idx == arr.length) return -1;
     int ans = lastidx_02(arr, idx + 1, data);
     if(ans != -1) return ans;

     return arr[idx] == data ? idx : -1;
   }

   public static int maximum(int []arr, int idx){
     if(idx == arr.length - 1) return arr[idx];
     return Math.max(maximum(arr, idx + 1), arr[idx]);
   }

   public static int minimum(int []arr, int idx){
      if(idx == arr.length - 1) return arr[idx];
      return Math.min(minimum(arr, idx + 1), arr[idx]);
   }

   public static boolean find(int []arr, int idx, int data){
     if(idx == arr.length) return false;
     if(arr[idx] == data) return true;

     return find(arr, idx + 1, data);
   }

   public static int[] allidx(int []arr, int idx, int data, int count){
      if(idx == arr.length) return new int[count];

      if(arr[idx] == data) count++;
      int []ans = allidx(arr, idx + 1, data, count);
      if(arr[idx] == data) ans[count - 1] = idx;

      return ans;
   }

   // set : 3 ==============================================================================

   public static void set3(){
      // System.out.println(subseq("str"));
      // System.out.println(keypad("567"));
      // System.out.println(keypad_02("567"));
      // System.out.print(keypad_03("567", ""));
      // System.out.print(keypad_04("10", ""));
      // System.out.println(encoding("2325", ""));
      printEncodings("12103", "");
   }

   public static ArrayList<String> subseq(String str){
     if(str.length() == 0){
       ArrayList<String> base = new ArrayList<>();
       base.add("");
       return base;
     }

     char ch = str.charAt(0);
     String nstr = str.substring(1);
     ArrayList<String> smallAns = subseq(nstr);
     ArrayList<String> myAns = new ArrayList<>();
     for(String s : smallAns){
       myAns.add(s + " ");
       myAns.add(ch + s);
     } 
     return myAns;
   }

   public static String[] words={":;/", "abc", "def", "ghi", "jkl", "mno",
    "pqrs", "tuv", "wxyz", "&*%", "#@$","+-/*"};

    public static ArrayList<String> keypad(String str){
      if(str.length() == 0){
        ArrayList<String> base = new ArrayList<>();
        base.add("");
        return base;
      }

      char ch = str.charAt(0);
      String nstr = str.substring(1);
      String word = words[ch -'0'];

      ArrayList<String> smallAns = keypad(nstr);
      ArrayList<String> myAns = new ArrayList<>();

      for(int i=0; i<word.length(); i++){
        char recWord = word.charAt(i);
        for(String s : smallAns){
          myAns.add(s + recWord);
        }
      }
      return myAns;
    }

    public static ArrayList<String> keypad_02(String str){
      if(str.length() == 0){
        ArrayList<String> base = new ArrayList<>();
        base.add("");
        return base;
      }

      char ch = str.charAt(0);
      String nstr = str.substring(1);
      String word = words[ch - '0'];
      ArrayList<String> smallAns = keypad_02(nstr);
      ArrayList<String> myAns = new ArrayList<>();

      for(String s : smallAns){
        for(int i=0; i<word.length(); i++){
          myAns.add(s + word.charAt(i));
        }
      }
      return myAns;
    }

    public static int keypad_03(String str, String ans){
      if(str.length() == 0){
        System.out.println(ans);
        return 1;
      }

      char ch = str.charAt(0);
      String nstr = str.substring(1);
      int count = 0;
      String word = words[ch - '0'];

      for(int i=0; i<word.length(); i++){
        count += keypad_03(nstr, ans + word.charAt(i));
      }
      return count;
    }


    public static int keypad_04(String str, String ans){
      if(str.length() == 0){
        System.out.println(ans);
        return 1;
      }

      char ch = str.charAt(0);
      String nstr = str.substring(1);
      int count = 0;
      String word = words[ch -'0'];
      for(int i=0; i<word.length(); i++){
        count += keypad_04(nstr, ans + word.charAt(i));
      }

      if(str.length() > 1){
        char ch2 = str.charAt(1);
        int num = (ch - '0') * 10 + (ch2 - '0');
        if(num >=10 && num <= 11){
          word = words[num];
          for(int i=0; i<word.length(); i++){
           count += keypad_04(str.substring(2), ans+word.charAt(i));
          }
        }
      }
      return count;
    }

    public static int encoding(String str, String ans){
      if(str.length() == 0){
        System.out.println(ans);
        return 1;
      }

      char ch = str.charAt(0);
      String nstr = str.substring(1);
      int count = 0;

      count += encoding(nstr, ans + (char)('a' + (ch - '0')));
      if(str.length() > 1){
        char ch2 = str.charAt(1);
        int num = (ch - '0') * 10 + (ch2 - '0');
        if(num >= 10 && num <= 25){
          count += encoding(str.substring(2), ans + (char)('a' + num));
        }
      }
      return count;
    }

    public static int encoding_02(String str,String ans){
      if(str.length()==0) {
          System.out.println(ans);
          return 1;
      }

      char ch=str.charAt(0);
      String nstr=str.substring(1);
      int count=0;

      count+=encoding(nstr,ans+(char)('a'+ (ch-'0')));

      if(str.length() > 1){
          char ch2=str.charAt(1);
          int num = (ch-'0')*10 + (ch2-'0');
          if(num >= 10 && num <= 25){
              count+=encoding(str.substring(2),ans+ (char)('a'+ num));
          }
      }

      return count;
  }

  public static void printEncodings(String str, String ans){
    if(str.length() == 0){
      System.out.println(ans);
      return;
    }
    else if(str.length() == 1){
      char ch = str.charAt(0);
      if(ch == '0'){
        return;
      }
      else{
        int chv = ch - '0';
        char code = (char)('a' + chv - 1);
        ans += code;
        System.out.println(ans);
      }
    }
    else{
      char ch = str.charAt(0);
      String nstr = str.substring(1);
      if(ch == '0'){
        return;
      }
      else{
        int chv = ch - '0';
        char code = (char)('a' + ch - 1);
        printEncodings(nstr, ans + code);
      }
      String ch12 = str.substring(1, 2);
      String nstr12 = str.substring(2);
  
      int ch12v = Integer.parseInt(ch12);
      if(ch12v <= 26){
        char code = (char)('a' + ch12v - 1);
        printEncodings(nstr12, ans + code);
    }
   
    }
  }
}