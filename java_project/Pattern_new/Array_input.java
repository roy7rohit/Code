package Pattern_new;

import java.util.Arrays;
import java.util.Scanner;

public class Array_input {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int size = Integer.parseInt(sc.nextLine());
    String []names = new String[size];

    for(int i=0; i<names.length; i++){

      names[i] = sc.nextLine();

    }
    System.out.println(Arrays.toString(names));
    }
    

  }
  
