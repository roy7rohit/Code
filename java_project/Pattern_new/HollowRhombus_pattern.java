package Pattern_new;
public class HollowRhombus_pattern {
  
  public static void main(String[] args) {
    

    HollowRhombus(7);
  }


  public static void HollowRhombus(int rows){

    int row = 1;
    while(row <= rows){

      int spaces = rows - row;
      int space = 1;
      while(space <= spaces){

        System.out.print(" ");
        space++;
      }
      
      int star = 1;
      while(star <= rows){

        if((row ==1 || row == rows ) || (star == 1 || star == rows)){
         
          System.out.print("*");
    
        }
        else{

          System.out.print(" ");
        }
        star++;
    }
      System.out.println();
      row++;
    }
  }
}