package Pattern_new;

public class ValleyPattern {
 
  public static void main(String[] args) {
    
    ass_2_Que15(5);
  }

  public static void ass_2_Que15(int rows) {
    
    rows = (2*rows) - 1;
    int row = 1;
    int mirror = 1;
    while(mirror <= rows){
      
      int star = 1;
      while(star <= row){

        System.out.print("*");
        star++;
      }
      int spaces = (2*rows) - (2*row) - 1;
      int space = 1;

      while(space <= spaces){

        System.out.print(" ");
        space++;
      }

      if(mirror < (rows/2)+1){

        row++;
      }else{

        row--;
      }
      System.out.println();
      mirror++;
    }
  }
}