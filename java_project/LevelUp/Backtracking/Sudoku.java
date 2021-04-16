package LevelUp.Backtracking;
import java.util.ArrayList;
public class Sudoku {

  public static boolean isValidToPlaceNumber(char[][] board, int x, int y, int num){

    //row
    for(int j=1; j<=9; j++){
      if(board[x][j] - '0'== num){
        return false;
      }
    }

    //col
    for(int i=1; i<=9; i++){
      if(board[i][y] - '0'== num){
        return false;
      }
    }

    //3*3 matrix
    int r = (x / 3) * 3;
    int c = (y / 3) * 3;

    for(int i=1; i<=3; i++){
      for(int j=1; j<=3; j++){
        if(board[r + i][c + j] - '0'== num){
          return false;
        }
      }
    }
    return true;
  }
  
  static ArrayList<Integer> xpoints, ypoints;
  
  public static boolean sudokuSolver(char [][]board, int idx){
    if(idx == xpoints.size()){
      return true;
    }
    int x = xpoints.get(idx);
    int y = ypoints.get(idx);
    
    for(int num=1; num<=9; num++){
      if(isValidToPlaceNumber(board, x, y, num)){
        board[x][y] = (char)(num + '0');
        if(sudokuSolver(board, idx + 1)){
          return true;
        }
        board[x][y] = '.';
    }
  }
  return false;
  }
  static int []row;
  static int []col;
  static int [][]matrix;
  public static boolean sudokuSolver_02(char [][]board, int idx){
    if(idx == xpoints.size()){
      return true;
    }

    int i = xpoints.get(idx);
    int j = ypoints.get(idx);

    for(int num=1; num<=9; num++){
      int mask = (1 << num); // if 0 than false else true
      if((row[i] & mask) == 0 && (col[j] & mask) == 0 && (matrix[i / 3][j / 3] & mask) == 0){
        row[i] ^= mask;
        col[j] ^= mask;
        matrix[i / 3][j / 3] ^= mask;
        board[i][j] = (char)(num - '0');

        if(sudokuSolver_02(board, idx + 1)){
          return true;
        }
        
        board[i][j] = '.';
        row[i] ^= mask;
        col[j] ^= mask;
        matrix[i / 3][j / 3] ^= mask;
        board[i][j] = (char)(num - '0');

      }
    }
    return false;
  }

  public static void solveSudoku(char [][]board){
    xpoints = new ArrayList<>();
    ypoints = new ArrayList<>();

    row = new int[9];
    col = new int[9];
    matrix = new int [3][3];

    for(int i=0; i<9; i++){
      for(int j=0; j<9; j++){
        if(board[i][j] == '.'){
          xpoints.add(i);
          ypoints.add(j);
        }
        else{
          int mask = 1 << (board[i][j] - '0');
          row[i] ^= mask;
          col[j] ^= mask;
          matrix[i / 3][j / 3] ^= mask;
        }
      }
    }
    sudokuSolver(board, 0);
  }

  public static boolean isValidSudoku(char [][]board){
    row = new int[9];
    col = new int[9];
    matrix = new int[3][3];

    for(int i=0; i<9; i++){
      for(int j=0; j<9; j++){
        if(board[i][j] == '.'){
          int mask = (1 << (board[i][j] - '0'));
          if((row[i] & mask) == 0 && (col[j] & mask) == 0 && (matrix[i / 3][j / 3] & mask) == 0){
            row[i] ^= mask;
            col[j] ^= mask;
            matrix[i / 3][j / 3] ^= mask;
          }
          else{
            return false;
          }
        }
      }
    }
    return true;
  }


  public static void set() {
    
  }
  
  public static void main(String[] args) {
    set();
  }
}