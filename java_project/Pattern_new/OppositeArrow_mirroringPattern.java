package Pattern_new;

public class OppositeArrow_mirroringPattern {
  
  public static void main(String[] args) {
    
    OppositeArrow(9);
  }

  public static void OppositeArrow(int rows) {
    
    rows = (2*rows) - 1;
    int row = 1;
    int mirror = 1;

    while(mirror <= rows){

      int spaces = ((rows/2)+1 - row);
       
      int space = 1;

      while(space <= spaces){

        System.out.print(" ");
        space++;
      }

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