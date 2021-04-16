package LevelUp.FloodFill;

import java.util.Scanner;

public class FloodFill {
  public static int n, m;
  public static int[][] dirA = {{0, 1}, {-1, 0}, {0, -1}, {1, 0}};
  public static String[] dirS = {"R", "U", "L", "D"};


  public static int floodFillAlgo(int sr, int sc, int er, int ec, int [][]grid, String ans){
    if(sr == er && sc == ec){
      System.out.println(ans);
      return 1;
    }
    grid[sr][sc] = 1; // mark visited
    int count = 0;
    for(int d = 0; d < 4; d++){
      int r = sr + dirA[d][0];
      int c = sc + dirA[d][1];
      if(r >= 0 && c >= 0 && r <= er && c <= ec && grid[r][c] == 0){
        count += floodFillAlgo(r, c, er, ec, grid, ans + dirS[d]);
      }
    }
    grid[sr][sc] = 0; // mark unVisited
    return count;
  }

  public static int floodFillJumpAlgo(int sr, int sc, int er, int ec, int[][] grid, String ans){
    if(sr == er && sc == ec){
      System.out.println(ans);
      return 1;
    }

    grid[sr][sc] = 1; // mark visited
    int count = 0;
    for(int d = 0; d < dirA.length; d++){
      for(int rad = 1; rad <= Math.max(n, m); rad++){
        int r = sr + rad * dirA[d][0];
        int c = sc + rad * dirA[d][1];

        if(r >= 0 && c >= 0 && r <= er && c <= ec && grid[r][c] == 0){
          count += floodFillJumpAlgo(r, c, er, ec, grid, ans + dirS[d] + rad);
        }
      }
    }
    grid[sr][sc] = 0; //mark unvisited
    return count;
  }

  public static class Pair{
    String str = "";
    int len = 0;

    Pair(String str, int len){
      this.str = str;
      this.len = len;
    }
  }
  public static Pair longestPath(int sr, int sc, int er, int ec, int[][] grid){
    if(sr == er && sc == ec){
      Pair base = new Pair("", 0);
      return base;
    }

    Pair myAns = new Pair("", 0);
    grid[sr][sc] = 1; //mark visited
    for(int d = 0; d < 4; d++){
      for(int rad = 1; rad <= Math.max(n, m); rad++){ // radius(magnitude se matrix ko multiply kar do)
        
        int r = sr + rad * dirA[d][0];
        int c = sc + rad * dirA[d][1];

        if(r >= 0 && c >= 0 && r <= er && c <= ec && grid[r][c] == 0){

          Pair recAns = longestPath(r, c, er, ec, grid);
          if(recAns.len + 1 > myAns.len){
            myAns.len = recAns.len + 1;
            myAns.str = dirS[d] + rad + recAns.str;
          }
        }
      }
    }
    grid[sr][sc] = 0; // mark unvisited
    return myAns;
  } 
  
  public static void solve() {
    // Scanner sn = new Scanner(System.in);
    // int n = sn.nextInt();
    // int m = sn.nextInt();

    n = 3;
    m = 3;
    int [][]grid = new int[n][m];
    // System.out.println(floodFillAlgo(0, 0, n-1, m-1, grid, ""));
    // System.out.println(floodFillJumpAlgo(0, 0, n - 1, m - 1, grid, ""));
    System.out.println(longestPath(0, 0, n - 1, m - 1, grid).str);

  }
 public static void main(String[] args) {
   solve();
 } 
}