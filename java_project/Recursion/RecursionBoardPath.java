package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class RecursionBoardPath {
  
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    int src = sn.nextInt();
    int dest = sn.nextInt();
    String ResSoFar = sn.nextLine();

    // PathInBoard(0, 3, "");
    // PathInBoardProactive(0, 10, "");
    // PathInBoardFrom1And6(0, 3, "");
    System.out.println(getBoardPath(0, 10));
  }

  //===================================================================================

  public static void PathInBoardFrom1And6(int src, int dest, String ResSoFar) {
    if(src==dest){
      System.out.println(ResSoFar);
      return;
    }
    if(src == 0){
      PathInBoardFrom1And6(1, dest, ResSoFar + 1);
      PathInBoardFrom1And6(1, dest, ResSoFar + 3);

    }

    else{
    for(int dice=1; dice<=3; dice++){

      int inter_path = src + dice;
      PathInBoard(src, dest, ResSoFar + dice);
    }
  }
}

//=====================================================================================
  public static void PathInBoard(int src, int dest, String ResSoFar) {
    if(src==dest){
      System.out.println(ResSoFar);
      return;
    }
    if(src > dest) return;

    
    for(int dice=1; dice<=3; dice++){

      int inter_path = src + dice;
      PathInBoard(src, dest, ResSoFar + dice);
    }
  }

  //===================================================================================

  public static void PathInBoardProactive(int src, int dest, String ResSoFar) {
    if(src==dest){
      System.out.println(ResSoFar);
      return;
    }
    for(int dice=1; dice<=3; dice++){

      int inter_path = src + dice;
      if(inter_path <= dest){
      PathInBoard(src, dest, ResSoFar + dice);
      return;
    }
  }
  }

  //===================================================================================

  public static ArrayList<String> getBoardPath(int current, int end){
    if(current == end){
      ArrayList<String> base = new  ArrayList<>();
      base.add("");
      return base;
    }
    if(current > end){
      ArrayList<String> base = new ArrayList<>();
      return base;
    }
    ArrayList<String> myRes = new ArrayList<>();
    for(int dice=1; dice<=6; dice++){
      ArrayList<String> recurRes =  getBoardPath(current + dice, end);

      for(String recres : recurRes){
        myRes.add(recres + dice);
      }
    }
    return myRes;
  }
}