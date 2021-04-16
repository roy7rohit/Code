package ComplicatedPattern;

public class Poyramid_PAttern {
  
   public static void main(String[] args) {
          
        int rows = 5;
        int row = 1;
  
        while(row <= rows){
            
            int spaces = rows - row;
            int space = 1;
            while(space <= spaces){

              System.out.print("  ");

              space++;
            }
            int number = 1;
            for (int j = 1; j <= row; j++) {
                System.out.print(" "+number + "  ");
                number = number * ((row - j))/ (j);
            }
            System.out.println();
            row++;
        }
  
    }
}