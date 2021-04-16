package java_Strings_trials;

public class StringOptimization {
  
  public static void main(String[] args) {
    
    String var[] = new String[50000];
    for(int i=0; i<50000; i++){

      var[i] = "s" + i;
    }

    long startTime0 = System.currentTimeMillis();
    for(int i=0; i<50000;i++){

      var[i] = "hello";
    }

    long endTime0 = System.currentTimeMillis();
    System.out.println(endTime0 - startTime0);

    long startTime1 = System.currentTimeMillis();
    for(int i=0; i<50000; i++){

      var[i] = new String("hello");
      var[i] = var[i].intern();

    }

    long endTime1 = System.currentTimeMillis();
    System.out.println(endTime1 - startTime1);

    long startTime2 = System.currentTimeMillis();
    for(int i=0; i<50000; i++){

      var[i] = new String("hello");
    }
    long endTime2 = System.currentTimeMillis();
    System.out.println(endTime2 - startTime2);
  }
}