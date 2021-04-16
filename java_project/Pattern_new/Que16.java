package Pattern_new;

public class Que16 {

  public static void main(String[] args) {
    
    arrowNewPattern(5);

  }

  public static void arrowNewPattern(int rows) {
   
    rows = (2*rows)-1;
    int row = 1;
    int mirror = 1;
    while(mirror <= rows){

      int spaces = ((rows/2) + 1) - row;
      int space = 1;

      while(space <= spaces){

        System.out.print("  ");
        space++;
      }

      int stars = (2*(rows/2)-2) - row;
      int star = 1;

      while(star <= stars){

        System.out.print(" *");
        star++;
      }

      if(mirror < ((rows/2) + 1)){

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