package JAVA_trial;

import java.util.Scanner;

public class Table {
  
  public static void main(String[] args) {
    
    
    for(int i=1; i<=5; i++){

      for(int j=1; j<=10; j++){

        int res = j*i;
        System.out.println(i + "*" + j+ "=" + res);

      }
    }
    
  }
}