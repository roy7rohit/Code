package Recursion;

import java.util.ArrayList;

public class MazePuzzle {
  public static void main(String[] args) {
    
    // System.out.println(mazePuzzle(0, 0, 2, 2));
    System.out.println(mazePuzzleDiagonal(0, 0, 2, 2));
  }

  public static ArrayList<String> mazePuzzle(int cr, int cc, int er, int ec) {

    if(cr == er && cc == ec){
      ArrayList<String> base = new ArrayList<>();
      base.add("");
      return base;
    } 

    if(cr > er || cc > ec){
      ArrayList<String> base = new ArrayList<>();
      return base;
    }
    ArrayList<String> recurRes1 = mazePuzzle(cr, cc + 1, er, ec); 
    ArrayList<String> myRes = new ArrayList<>();

    for(String recresH : recurRes1){
      myRes.add("H" + recresH);
    }

    ArrayList<String> recurRes2 = mazePuzzle(cr + 1, cc, er, ec); 

    for(String recresV : recurRes2){
      myRes.add("V" + recresV);
    }

    return myRes;
  }

  //===================================================================================
  public static ArrayList<String> mazePuzzleDiagonal(int cr, int cc, int er, int ec) {

    if(cr == er && cc == ec){
      ArrayList<String> base = new ArrayList<>();
      base.add("");
      return base;
    } 
    
    if(cr > er || cc > ec){
      ArrayList<String> base = new ArrayList<>();
      return base;
    }
    ArrayList<String> recurRes1 = mazePuzzleDiagonal(cr, cc + 1, er, ec); 
    ArrayList<String> myRes = new ArrayList<>();

    for(String recresH : recurRes1){
      myRes.add("H" + recresH);
    }

    ArrayList<String> recurRes2 = mazePuzzleDiagonal(cr + 1, cc, er, ec); 

    for(String recresV : recurRes2){
      myRes.add("V" + recresV);
    }


    ArrayList<String> recurRes3 = mazePuzzleDiagonal(cr + 1, cc + 1, er, ec); 

    for(String recresD : recurRes3){
      myRes.add("D" + recresD);
    }

    return myRes;
  }
}