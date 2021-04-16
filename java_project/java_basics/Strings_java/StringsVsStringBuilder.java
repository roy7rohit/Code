package java_basics.Strings_java;

public class StringsVsStringBuilder {

  public static void main(String[] args) {

    long start = System.currentTimeMillis();
    // appendString(100000);
    appendStringSB(1000000);
    long end = System.currentTimeMillis();

    System.out.println(end - start);
    
  }
  private static void appendString(int n) {
    String str = "";
    
    for(int i=1; i<=n; i++){

      str = str + i;
    }
  }
  private static void appendStringSB(int n) {
    String str = "";
    StringBuilder sb = new StringBuilder(str);
    
    for(int i=1; i<=n; i++){

      sb.append(i);
    }
  
    
  }

    private void append(int i) {
        // TODO
    }
}