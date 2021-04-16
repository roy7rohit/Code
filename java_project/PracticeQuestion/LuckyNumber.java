package PracticeQuestion;

import java.util.Scanner;

public class LuckyNumber {
  
  public static void main(String[] args) {
    
    Scanner sn = new Scanner(System.in);
    int n = sn.nextInt();

    if(isLucky(n)){
      System.out.println("num is lucky");
    }
    else{
      System.out.println("not lucky");
    }
  }

  static int counter = 2;
  public static boolean isLucky(int n){

    if(counter > n){
      return true;
    }
    if(counter % 2 == 0){
      return false;
    }

    int num_pos = n;
    int new_pas = num_pos - num_pos / counter;
    return isLucky(n);
  }

}