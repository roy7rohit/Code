package Backtracking;

public class NQueensCount {
  public static void main(String[] args) {
    
    boolean[][] board = new boolean[4][4];
    // System.out.println(countNQueens(board, 0));
    // printNQueens(board, 0, "");
    // queenPermutation(new boolean[4], 0, 2, "");
    // queenCombination(new boolean[4], 0, 2, "", -1);
    // int []denomination = {2,3,5,6};
    // coinChangeCombination(new int[]{2,3,5,6}, 10, "", 0);
    coinChangePermutation(new int[] {2,3,5,6}, 10, "");

  }

  public static int countNQueens(boolean[][] board, int row){
    if(row == board.length){
      return 1;
    }
    int count = 0;
    for(int col=0; col<board[row].length; col++){
      
      if(isItSafeToPlaceQueen(board, row, col)){
        board[row][col] = true;
        count = count + countNQueens(board, row + 1);
        board[row][col] = false;
      }
    }

    return count;
  }

  private static boolean isItSafeToPlaceQueen(boolean[][] board, int row, int col) {
    
    for(int i=row; i>=0; i--){
      if(board[i][col]){
        return false;
      }
    }

    for(int i=row , j=col; i>=0 && j>=0; i--, j--){
      if(board[i][j]){
        return false;
      }
    }

    for(int i=row, j=col; i>=0 && j<board.length; i--, j++){
      if(board[i][j]){
        return false;
      }
    }
    return true;
  }

//=====================================================================================================================

public static void printNQueens(boolean[][] board, int row, String ans){
  if(row == board.length){
    System.out.println(ans);
    return;
  }

  for(int col=0; col<board[row].length; col++){
    if(isItSafeToPlaceQueen(board, row, col)){

    board[row][col] = true;
    printNQueens(board, row + 1, ans + "{" + (row + 1) + "->" + (col + 1) + "}");
    board[row][col] = false;
    
  }
}
}

//======================================================================================================================
static int counter = 0;

public static void queenPermutation(boolean[] box, int quesSoFar, int totalqueen, String ans) {
  
  if(quesSoFar == totalqueen){
    counter++;
    System.out.println(counter + "." + ans);
    return;
  }

  for(int i=0; i<box.length; i++){
    if(box[i] == false){
      box[i] = true;
      queenPermutation(box, quesSoFar + 1, totalqueen, ans + "Q" + quesSoFar + "B" + i + " ");
      box[i] = false;

    }
  }
}


//======================================================================================================================

public static void queenCombination(boolean[] box, int quesSoFar, int totalqueen, String ans, int lastIndexUsed) {
  if(quesSoFar == totalqueen){
    System.out.println(ans);
    return;
  }

  for(int i=lastIndexUsed + 1; i<box.length; i++){
    // if(box[i] == false){
      box[i] = true;
      queenCombination(box, quesSoFar + 1, totalqueen, ans + "Q" + quesSoFar + "B" + i + " ", i);
      box[i] = false;
    // }
  }
}

//======================================================================================================================

public static void coinChangeCombination(int[] denomination, int amount, String ans, int denominationLastIndx) {
  if(amount == 0){
    System.out.println(ans);
    return;
  }

  for(int i=denominationLastIndx; i<denomination.length; i++){
    if(amount >= denomination[i]){
      coinChangeCombination(denomination, amount - denomination[i], ans + denomination[i], i);

    }
  }
}


//======================================================================================================================

public static void coinChangePermutation(int[] denomination, int amount, String ans){
  if(amount == 0){
    counter++;
    System.out.println(counter + ". " + ans);
    return;
  }

  for(int i=0;i<denomination.length; i++){
    if(denomination[i] <= amount){

    coinChangePermutation(denomination, amount - denomination[i], ans + denomination[i]);
    
  }
  }
}
}