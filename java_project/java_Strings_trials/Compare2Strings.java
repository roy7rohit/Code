package java_Strings_trials;

public class Compare2Strings {
  public static void main(String[] args) {
    
    String str1 = "Hello World";
    String str2 = "hello world";
    Object str = str1;

    // System.out.println(((String) str).compareTo(str2));
    // System.out.println(((String) str).compareToIgnoreCase(str2));
    // System.out.println( ((String) str).compareTo(str.toString()));

    String s1 = "hello";
    String s2 = "hello";

    if(s1 == s2){
      System.out.println("s1==s2");
    }
    else{
      System.out.println("s1!=s2");
    }



    String s3 = new String("hello");
    String s4 = new String("hello");

    if(s3==s4){
      System.out.println("s3==s4");
    }
    else{
      System.out.println("s3!=s4");
    }
    if(s1.equals(s2)){
      System.out.println("s1 equals to  s2");
    }
    else{
      System.out.println("s1 is not equals to  s2");
    }
    if(s3.compareTo(s4)==1){
      System.out.println("s3 is compared to s4");
    }
    else{
      System.out.println("not compared");
    }


  
    String s5 = "rohit, pawan, shubham, aaditya, tushar, masum";

    int len = s5.length();
    System.out.println(s5);
    System.out.println(len);
    System.out.println(s5.charAt(0)+" || "+s5.charAt(len-1));
  
    s5.toUpperCase();
    System.out.println(s5);// no change string remains the same beacuse strings are immutable 
    System.out.println(s5.toUpperCase());//here we get strings of upper case through string manipulation in which old string remains same and a new string created and manipulated

    String s6 = s5.toUpperCase();
    System.out.println(s6);
  
    if(s5.contains("masum")){
      System.out.println("yes");
    }
    else{
      System.out.println("no");
    }


    System.out.println(s5.substring(4, 21));

    String s7 = s5.substring(6, 42);
    System.out.println(s7);

    String s8 = "             hi                       ";
    System.out.println(s8);
    System.out.println(s8.trim());
  }
}