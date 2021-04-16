package java_Strings_trials;

import java.util.Locale;

public class StringFormatting {

  public static void main(String[] args) {
    
    double e = Math.E;
    System.out.format("%f%n", e);
    System.out.format(Locale.GERMANY, "%-10.4f%n%n", e);
  
    // String name = "Hello World";
    // String s1 = String.format("name %s", name);
    // String s2 = String.format("value %f",32.33434);
    // String s3 = String.format("value %f",32.33434);
    // System.out.print(s1);
    // System.out.print("\n");
    // System.out.print(s2);
    // System.out.print("\n");
    // System.out.print(s3);
    // System.out.print("\n");


    long startTime = System.currentTimeMillis();
      
    for(int i = 0; i < 5000; i++) {
       String result = "This is"
          + "testing the"
          + "difference"
          + "between"
          + "String"
          + "and"
          + "StringBuffer";
    }

    long endTime = System.currentTimeMillis();
    // System.out.println("Time taken for string" 
    //    + "concatenation using + operator : " 
    //    + (endTime - startTime)+ " ms");
    long startTime1 = System.currentTimeMillis();
    
    for(int i = 0; i < 5000; i++) {
       StringBuffer result = new StringBuffer();
       result.append("This is");
       result.append("testing the");
       result.append("difference");
       result.append("between");
       result.append("String");
       result.append("and");
       result.append("StringBuffer");
    }
    long endTime1 = System.currentTimeMillis();
    // System.out.println("Time taken for String concatenation" 
    //    + "using StringBuffer : "
    //    + (endTime1 - startTime1)+ " ms");
  
    String str = "hello world how are you";
    System.out.println(str);
    System.out.println(str.codePointBefore(6));
    System.out.println(str.codePointAt(9));
  
  
  
  }


  
}