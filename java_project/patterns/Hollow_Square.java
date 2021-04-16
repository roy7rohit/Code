package patterns;

public class Hollow_Square {
    
  public static void main(String[] args) {

    HollowSquare(5); 
    

  }
  public static void HollowSquare(int rows) {
    
    int row = 1;
    while(row <= rows){

      int star = 1;
      while(star <= rows){

        if((row == 1 || row == rows) || (star == 1 || star == rows)){

          System.out.print("*");
        }else{

          System.out.print(" ");
        }
        star++;
      }
      System.out.println();
      row++;
    }
  } 
}