package java_Strings_trials;

public class StringBufferDemo {
 
  public static void main(String[] args) {

    count_to_N_improved();
    
  }

  private final static int max_length = 30;
  private static String buffer = "";
  
  private static void emit(String nextChunk){

    if(buffer.length() + nextChunk.length() > max_length){
      System.out.println(buffer);
      buffer = "";
    }
    buffer += nextChunk;

  }

  private static final int n = 100;
  private static void count_to_N_improved(){

    for(int count=2; count <= n; count += 2){

      emit(" "+ count);
    }
  }

}
