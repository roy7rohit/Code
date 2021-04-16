package JAVA_trial;

import java.util.Scanner;

public class Hollow_Diamond {
 
  public static void main(String[] args) {
    
    Scanner sn = new Scanner(System.in);
    int rows = sn.nextInt();

    pattern(rows);
  }

  public static void pattern(int rows) {

    int row = 1;
    int mirror = 1;
    while(mirror <= rows){

      int spaces = rows -row;
      int space = 1;
      
      while(space <= spaces){

        System.out.print(" ");
        space++;
      }

      int star = 1;
      while(star <= rows){
        if(star == 1 || star == (2*row)-1){
          System.out.print("*");
          
      }else{
        System.out.print(" ");
      }

      star++;
    }
    if(mirror<(rows/2)+1){

      row++;
    }else{

      row--;
    }
  
    System.out.println();
    mirror++;
  }

  }
  
  
  }
    
  
