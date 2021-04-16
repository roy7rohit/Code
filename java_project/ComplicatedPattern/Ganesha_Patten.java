package ComplicatedPattern;

import java.util.Scanner;

public class Ganesha_Patten{

  public static void main(String[] args) {

    Scanner sn = new Scanner(System.in);
    int rows = sn.nextInt();

    ganeshaPattern(rows);
    
  }

  public static void ganeshaPattern(int rows){

    //first component
    System.out.print("*");
    for(int space=1; space<=(rows-3)/2; space++){
      System.out.print(" ");
    }
    for(int star=1; star<=(rows+1)/2; star++){
      System.out.print("*");
    }
    System.out.println();

    //second component

    for(int row=1; row<=(rows-3)/2; row++){

      System.out.print("*");
    
    for(int space=1; space<=(rows-3)/2; space++){

      System.out.print(" ");
    }
    System.out.print("*");
    System.out.println();
  }
    
  
  //third component

  for(int star=1; star<=rows; star++){

    System.out.print("*");
  }
  System.out.println();

  //forth component

  for(int row=1; row<=(rows-3)/2; row++){

    for(int space=1; space<=((rows-3)/2)+1; space++){

      System.out.print(" ");
    }
    System.out.print("*");

    for(int space=1; space<=(rows-3)/2; space++){

      System.out.print(" ");
    }
    System.out.print("*");
    System.out.println();
  }

    //fifth component
    for(int star=1; star<=(rows+1)/2; star++){

      System.out.print("*");
    }
    for(int space=1; space<=(rows-3)/2; space++){

      System.out.print(" ");
    }
    System.out.print("*");
    System.out.println();



  }
  
}