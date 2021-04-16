package Pattern_new;

public class Question15 {

  public static void main(String[] args) {
    
    Q15(5);

  }
  
  public static void Q15(int rows) {

    rows = (2*rows) - 1;
    
    int m = 1;
    int row = 1;

    while(m <= rows){

      int spaces = 2*(row - 1);
      int space = 1;

      while(space <= spaces){

        System.out.print("  ");

        space++;
      }
      int stars = ((rows/2)+ 2) - row;
      int star = 1;
      while(star <= stars){

        System.out.print("* ");
        star++;
      }
      if(m < (rows/2)+1){

        row++;

      }else{

        row--;
      }

      System.out.println();
      m++;
    }
  }
}