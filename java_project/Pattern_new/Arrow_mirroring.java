package Pattern_new;

public class Arrow_mirroring {

  public static void main(String[] args) {
    
    Arrow_pattern(5);

  }

  public static void Arrow_pattern(int rows) {
  
    rows = (2*rows) - 1;
    int mirror = 1;
    int row = 1;
    
    while(mirror <= rows){

      int star = 1;
      while(star <= row){

        System.out.print("*");

        star++;
      }
      if(mirror < (rows/2)+1){

        row++;
      }
      else{

        row--;
      }

      System.out.println();
      mirror++;
    }
  }
}