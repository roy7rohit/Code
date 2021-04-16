package LevelUp.FloodFill;

public class FloodFillQue {
  
 
  //Leetcode : 980======================================================================

  public static int uniquePathsIII_(int sr, int sc, int freeCell, int[][] grid) {
        if(freeCell == 1){
          return grid[sr][sc] == 2 ? 1 : 0;
        }
        int count = 0;
        int temp = grid[sr][sc]; // save current value;
        grid[sr][sc] = -1; // mark visited
        for(int d = 0; d < 4; d++){
          int r = sr + dirA[d][0];
          int c = sc + dirA[d][1];

          if(r >= 0 && c >= 0 && r < n && c < m && grid[r][c] >= 0){
            count += uniquePathsIII_(r, c, freeCell - 1, grid);
          }
        }
        grid[sr][sc] = temp;//mark unvisited
        return count;
  }

  public static int uniquePathsIII(int[][] grid){
    n = grid.length;
    m = grid[0].length;

    int sr = 0; int sc = 0; int freeCell = 0;
    for(int i = 0; i < n; i++){
      for(int j = 0; j < m; j++){
        if(grid[i][j] != -1){
          freeCell++;
        }
        if(grid[i][j] == 1){
          sr = i; sc = j;
        }
      }
    }
    return uniquePathsIII_(sr, sc, freeCell, grid);
  }


  //Leetcode : 63 ========================================================================

  public static int uniquePathsWithObstacles(int[][] grid) {
        n = grid.length;
        m = grid[0].length;
        int sr = 0; int sc = 0;
        for(int i=0; i<n; i++){
          for(int j=0; j<m; j++){
            if(grid[i][j] == 0){
              sr = i;
              sc = j;
            }
          }
        }
        return dfs(sr, sc, grid);
  }

  public static int dfs(int sr, int sc, int[][] grid){
    n = grid.length;
    m = grid[0].length;
    if(sr == n && sc == m){
      return 1;
    }

    int count = 0;
    grid[sr][sc] = 1; // mark visited
    for(int d = 0; d < 2; d++){
      int r = sr + dirA[d][0];
      int c = sc + dirA[d][1];

      if(r >= 0 && c >= 0 && r < n && c < m && grid[r][c] == 0){
        count += dfs(r, c, grid);
      }
    }
    grid[sr][sc] = 0;// mark unvisited
    return count;

  }
  public static void main(String[] args) {
    
  }
}