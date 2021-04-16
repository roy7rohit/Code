package Graphs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DFSQue {
  
  // static int [][]dir = {{-1, -1}, {-1, 0}, {-1, 1},  {0, -1}, {0, 1},  {1, -1}, {1, 0}, {1, 1}};
  static int [][]dir = {{1, 0}, {0, -1}, {-1, 0}, {0, 1}};

  public static void search(char [][]grid, boolean [][]vis, Set<String> words, int x, int y, String path){
    vis[x][y] = true;
    path = path + grid[x][y];
    words.add(path);

    for(int d=0; d<8; d++){

      int r = x + dir[d][0];
      int c = y + dir[d][1];
      if(r >= 0 && c >= 0 && r < grid.length && c < grid[0].length && !vis[r][c]){
        search(grid, vis, words, r, c, path);
      }
    }
    vis[x][y] = false;

  }

  public static void searchBoggle(char [][]grid, List<String> input){
    int n = grid.length;
    int m = grid[0].length;
    boolean [][]vis = new boolean[n][m];

    Set<String> words = new HashSet<>();

    for(int i=0; i<n; i++){
      for(int j=0; j<m; j++){
        search(grid, vis, words, i, j, "");
      }
    }

    for(String word : input){
      if(words.contains(word)){
        System.out.println(word + " ");
      }
    }
  }


  //Find the length of longest path in matrix : =============================================================

  public static int findMaxLength(char [][]grid, int x, int y, char prev){

    if(x >= 0 && x < grid.length && y >= 0 && y < grid[0].length || prev + 1 != grid[x][y]){
      return 0;
    }

    int maxLen = 0;
    for(int d = 0; d < 8; d++){
      int r = x + dir[d][0];
      int c = y + dir[d][1];

      int len = findMaxLength(grid, r, c, grid[x][y]);
      maxLen = Math.max(maxLen, len + 1);
    }
    return maxLen;
  }

  public static int maxLength(char [][]grid, char ch){
    int maxLen = 0;

    for(int i=0; i<grid.length; i++){
      for(int j=0; j<grid[0].length; j++){
        if(grid[i][j] == ch){
          for(int d=0; d<8; d++){

            int len = findMaxLength(grid, i, j, ch);

            maxLen = Math.max(maxLen, len + 1);
          }
        }
      }
    }
    return maxLen;
  }

  //replace covered 0's with 1's : ==============================================================================
  public static void dfs(int [][]grid, int x, int y){
    grid[x][y] = -1;
    for(int d=0; d<4; d++){
      int r = x + dir[d][0];
      int c = y + dir[d][1];

      if(r >= 0 && c >= 0 && r < grid.length && c < grid[0].length && grid[r][c] == 0){
        dfs(grid, r, c);
      }
    }
  }

  public static void solve(int [][]grid){
    if(grid.length == 0 || grid[0].length == 0){
      return;
    }

    int n = grid.length;
    int m = grid[0].length;
    for(int i=0; i<m; i++){
      if(grid[i][0] == 0){
        dfs(grid, i, 0);
      }
      if(grid[i][n - 1] == 0){
        dfs(grid, n - 1, i);
      }
    }

    for(int i=0;i<m; i++){
      if(grid[0][i] == 0){
        dfs(grid, 0, i);
      }

      if(grid[m - 1][i] == 0){
        dfs(grid, m - 1, i);
      }
    }
  }

  public static void set1(){
    // char[][] grid = {
    //   {'M', 'S', 'E'},
    //   {'R', 'A', 'T'},
    //   {'L', 'O', 'N'}
    // };



    // List<String> words = Arrays.asList("STAR", "NOTE", "SAND", "STONE", "EAT", "NOT", "RAT", "MAN", "LATE");
    // searchBoggle(grid, words);


    char[][] grid =
		{
			{ 'D', 'E', 'H', 'X', 'B' },
			{ 'A', 'O', 'G', 'P', 'E' },
			{ 'D', 'D', 'C', 'F', 'D' },
			{ 'E', 'B', 'E', 'A', 'S' },
			{ 'C', 'D', 'Y', 'E', 'N' }
		};

		// starting character
		char ch = 'A';

		System.out.println("The length of longest path with consecutive characters "
								+ "starting from character " + ch + " is "
								+ maxLength(grid, ch));
  }

  public static void set2(){

  }

  public static void main(String[] args) {
    // set1();
    set2();
	}
}

