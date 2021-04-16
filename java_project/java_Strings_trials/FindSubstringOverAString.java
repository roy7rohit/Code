package java_Strings_trials;

// import java.io.InputStream;

// import jdk.internal.util.xml.impl.Input;

public class FindSubstringOverAString {

  public static void main(String[] args) {
    
  

      // String strOrig = "Hello world ,Hello Reader";
      // int lastIndex = strOrig.lastIndexOf("Hello");
      
      // if(lastIndex == - 1){
      //    System.out.println("Hello not found");
      // } else {
      //    System.out.println("Last occurrence of Hello is at index "+ lastIndex);
      // }

      // String str = "rohit priyanshi";
      // System.out.println(str.lastIndexOf("priyanshi"));

      // String str1 = "hello how are you my name is roy";
      // int end_index = str1.lastIndexOf("is");

      // if(end_index == -1){
      //   System.out.println("we got the substring");
      // } else{
      //   System.out.println("too late");
      // }

      // String s1 = "love";
      // int index = s1.lastIndexOf("v");
      // System.out.println(index);

      // System.out.println(s1.substring(0, 4));

      // String s2 = "rohit, shubham, pawan, roy";
      // // System.out.println(s2.removeCharAt(s2, 6));

      //Replace method

      // System.out.println(s2.replace("rohit", "love"));
      // System.out.println(s2.replaceFirst("love", "rohit"));
      // System.out.println(s2.replaceAll("h", "r"));

      // String str3 = "abcdefghi";
      // String reverse = new StringBuffer(str3).reverse().toString();
      // System.out.println(str3);
      // System.out.println(reverse);

      // String str4 = "priyanshi";
      // char[] try1 = Input.toCharArray();
      // for (int i = try1.length-1;i >= 0; i--) System.out.print(try1[i]);

      // String str5 = "hello world";
      // int str5_index = str5.indexOf("hello");

      // if(str5_index == -1){
      //   System.out.println("hello not found");
      // }else{
      //   System.out.println("we got the string " + str5_index);
      // }

      // String str6 = "hello how are you guys";
      // if(str6.contains("z")){
      //   System.out.println("we found it");
      // }
      // else{
      //   System.out.println("not again");
      // }

      // String str7 = "helllo-how-are-you";
      // String[] temp;
      // String delimeter = "-";
      // temp = str7.split(delimeter);
      // for(int i=0;i<temp.length; i++){
      //   System.out.println(temp[i]);
      //   System.out.println("");
      //   String dummy_str = "jan-feb-march";
      //   delimeter = "//";
      //   temp = dummy_str.split(delimeter);
      // }

      // for(int i=0; i<temp.length; i++){

      //   System.out.println(temp[i]);
      //   System.out.println("");
      //   temp = str7.split(delimeter, 6);

      //   for(int j=0; j<temp.length; j++){
      //     System.out.println(temp[j]);
      //   }
      // }

      String s1 = "t u t o r i a l s"; 
      String[] words = s1.split("\\s"); 
      // for(String w:words) System.out.println(w);

      String s2 = "r o h i t p r i y a n s h i";
      String[] words2 = s2.split("\\s");
      // for(String letters : words2) System.out.println(letters);
          

      String s3 = "we all are humans and humnity is the only thing we have to worship";
      String upper_s3 = s3.toUpperCase();
      System.out.println(s3);
      System.out.println(upper_s3);

      String s4 = "i love priyanshi";
      String s5 = "priyanshi will be my heart till my last breath";
      boolean match = s4.regionMatches(0,s5, 11,15);
      // System.out.println(match);


      // compare time of two strings
      long startTime = System.currentTimeMillis();
      
      for(int i = 0; i < 50000; i++) {
         String st1 = "hello";
         String st2 = "hello"; 
      }
      long endTime = System.currentTimeMillis();
      System.out.println("Time taken for creation" 
         + " of String literals : "+ (endTime - startTime) 
         + " milli seconds" );       
      long startTime1 = System.currentTimeMillis();
      
      for(int i = 0; i < 50000; i++) {
         String st3 = new String("hello");
         String st4 = new String("hello");
      }
      long endTime1 = System.currentTimeMillis();
      System.out.println("Time taken for creation" 
         + " of String objects : " + (endTime1 - startTime1)
         + " milli seconds");




    }

    private static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
  
    }

  
}