package Backtracking;

import java.util.ArrayList;

public class SodukoSolver {
  
  public static void main(String[] args) {

    // char[][] board = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
    //                   {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
    //                   {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
    //                   {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
    //                   {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
    //                   {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
    //                   {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
    //                   {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
    //                   {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

    System.out.println(sudokuSolver(new char [9][9], 0));
    
  }

  static ArrayList<Integer> xcord = new ArrayList<>();
  static ArrayList<Integer> ycord = new ArrayList<>();

  public static int sudokuSolver(char[][] board, int indx){
    if(indx == xcord.size()){
      return 1;
    }

    int x = xcord.get(indx);
    int y = ycord.get(indx);

    for(int num=0; num <=9; ++num){
      int ret  = 0;

      if(validToPlaceNumber(board, x, y, num)){
        board[x][y] = (char)(num - '0');
        ret = sudokuSolver(board, indx + 1);

        if(ret == 1){
          return 1;
        }
        board[x][y] = '.';
      }

    }
    return 0;
  }

  public static boolean validToPlaceNumber(char[][] board, int i, int j, int num){
    for(int row=0; row<board.length; row++){
      if((board[row][j] - '0') == num){
        return false;
      }
    }

    for(int col=0; col<board[0].length; col++){
      if((board[i][col] - '0') == num){
        return false;
      }
    }

    int r = i - (i % 3);
    int c = j - (j % 3);

    for(int row=0; row<=3; ++row){
      for(int col=0; col<=3; ++col){

        if((board[row + r][col + c] - '0') == num){
          return false;
        }
      }
    }

    return true;
  }
}