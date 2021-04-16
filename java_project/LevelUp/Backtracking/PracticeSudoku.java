public class PracticeSudoku {

  public static boolean isValidToPlaceNum(int [][]board, int x, int y, int num){
    //col 
    for(int i=0; i<9; i++){
      if(board[x][i] == num){
        return false;
      }
    }

    //row
    for(int j=0; j<9; j++){
      if(board[j][y] == num){
        return false;
      }
    }
    //sub matrix
    int r = (x / 3) * 3;
    int c = (y / 3) * 3;

    for(int i=0; i<3; i++){
      for(int j=0; j<3; j++){
        if(board[r + i][c + j] == num){
          return false;
        }
      }
    }
    return true;
  }

  public static void sudokuSolve(int [][]board, int i, int j){
    int ni = 0;
    int nj = 0;

    if(j == board[0].length - 1){
      ni = i + 1;
      nj = 0;
    }else{
      ni = 0;
      nj = j + 1;
    }

    // for no zeroes
    if(board[i][j] != 0){
      sudokuSolve(board, ni, nj);
    }
    else{
      for(int num=1; num<=9; num++){
        if(isValidToPlaceNum(board, i, j, num)){
          board[i][j] = num;
          sudokuSolve(board, ni, nj);
          board[i][j] = 0;
        }
      }
    }
  }

  public static void solve(){
    int [][]board = {{3,0,6,5,0,8,4,0,0},
                      {5,2,0,0,0,0,0,0,0},
                      {0,8,7,0,0,0,0,3,1},
                      {0,0,3,0,1,0,0,8,0},
                      {9,0,0,8,6,3,0,0,5},
                      {1,3,0,0,0,0,2,5,0},
                      {0,0,0,0,0,0,0,7,4},
                      {0,0,5,2,0,6,3,0,0},
                      {0,5,0,0,9,0,6,0,0}
                      };
                      
    for(int i=0; i<board.length; i++){
      for(int j=0; j<board[0].length; j++){
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    solve();
  }
}