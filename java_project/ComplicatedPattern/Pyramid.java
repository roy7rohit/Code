package ComplicatedPattern;

import java.util.Scanner;

public class Pyramid {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
     int rows = sn.nextInt();
     pattern(rows);
 }
 
 public static void pattern(int rows){
     
     int row = 1;
     int num = 1;
     
     int m = 1;
     while(m <= rows){
         
         int spaces = (rows/2) - row + 1;
         int space = 1;
         while(space <= spaces){
             
             System.out.print(" ");
             space++;
         }
         int cols = (2*row) - 1;
         int col = 1;
         int New_num = num;
         while(col <= cols){
             
             
            System.out.print(New_num);
            if(col <= (cols/2)){

                New_num++;
            }
            else{

                New_num--;
            }

             col++;
         }
         if(m < (rows/2)+1){
             
             row++;
             num++;
         }
         else{
             
             row--;
             num--;
         }
         System.out.println();
         m++;
     }
     
 }

  
}