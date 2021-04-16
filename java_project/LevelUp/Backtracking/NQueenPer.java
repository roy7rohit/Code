package LevelUp.Backtracking;

public class NQueenPer {

  //Infinity no of coins================================================================

  public static int permutationINFI(int []arr, int idx, int target, String ans){
    if(target == 0){
      System.out.println(ans);
      return 1;
    }
    int count = 0;

    for(int i=idx; i<arr.length; i++){
      if(target - arr[i] >= 0){
        count += permutationINFI(arr, 0, target - arr[i], ans + arr[i] + " ");
      }
    }
    return count;
  }

  public static int combinationINFI(int []arr, int idx, int target, String ans){
    if(target == 0){
      System.out.println(ans);
      return 1;
    }
    int count = 0;
    for(int i=idx; i<arr.length; i++){
      if(target - arr[i] >= 0){
        count += combinationINFI(arr, i, target - arr[i], ans + arr[i] + " ");
      } 
    }

    return count;
  }

  //single no of coins=======================================================================

  public static int permutaionSingleCoin(int []arr, int idx, int target, String ans){
    if(target == 0){
      System.out.println(ans);
      return 1;
    }
    int count = 0;
    for(int i = idx; i < arr.length; i++){

      if(arr[i] >= 0 && target - arr[i] >= 0){

        int temp = arr[i];
        arr[i] = -arr[i]; //mark the visited
        count += permutaionSingleCoin(arr, 0, target - temp, ans + temp + " ");
        arr[i] = -arr[i]; //mark unvisited

      }
    }

    return count;
  }

  public static int combinationSingleCoin(int []arr, int idx, int target, String ans){
    if(target == 0){
      System.out.println(ans);
      return 1;
    }
    int count = 0;
    for(int i=idx; i<arr.length; i++){
      if(target - arr[i] >= 0){
        count += combinationSingleCoin(arr, i + 1, target - arr[i], ans + arr[i] + " ");
      }
    }

    return count;
  }
  // Using Subsequece method: ====================================================================

  public static int combinationSingleCoin_subseq(int []arr, int idx, int target, String ans){
    if(target == 0 || idx == arr.length){
      if(target == 0){
        System.out.println(ans);
        return 1;
      }
      return 0;
    }
    int count = 0;
    if(target - arr[idx] >= 0){
      count += combinationSingleCoin_subseq(arr, idx + 1, target - arr[idx], ans + arr[idx] + " ");
    }
    count += combinationSingleCoin_subseq(arr, idx + 1, target, ans);
    return count;
  }

  public static int combinationINFI_subseq(int []arr, int idx, int target, String ans){
    if(target == 0 || idx == arr.length){
      if(target == 0){
        System.out.println(ans);
        return 1;
      }
      return 0;
    }
    int count = 0;
    if(target - arr[idx] >= 0){
      count += combinationINFI_subseq(arr, idx, target - arr[idx], ans + arr[idx] +" ");
    }
    count += combinationINFI_subseq(arr, idx + 1, target, ans);

    return count;
  }

   
  public static int permutationINFI_subseq(int[] arr, int idx, int target, String ans) {
    if(target == 0 || idx == arr.length){
      if(target == 0){
        System.out.println(ans);
        return 1;
      }
      return 0;
    }
    int count = 0;

    if(target - arr[idx] >= 0){
      count += permutationINFI_subseq(arr, 0, target - arr[idx], ans + arr[idx] + " ");
    }
    count += permutationINFI_subseq(arr, idx + 1, target, ans);
    return count;
  }

  public static int permutaionSingleCoin_subseq(int []arr, int idx, int target, String ans){
    if(target == 0 || idx == arr.length){
      if(target == 0){
        System.out.println(ans);
        return 1;
      }
      return 0;
    }
    int count = 0;
    if(target - arr[idx] >= 0){
      int temp = arr[idx];
      arr[idx] = -arr[idx];
      count += permutaionSingleCoin(arr, 0, target - temp, ans + temp + " ");
      arr[idx] = -arr[idx];
    }
    count += permutaionSingleCoin_subseq(arr, idx + 1, target, ans);
    return count;
  }

  //Queen Permutation and Combination 1D : =====================================================================
  public static int queenCombination_1D(boolean []arr, int idx, int tnq, int qpsf, String ans){
    if(qpsf == tnq){
      System.out.println(ans);
      return 1;
    }
    int count = 0;
    for(int i=idx; i<arr.length; i++){
      count += queenCombination_1D(arr, i + 1, tnq, qpsf + 1, ans + "b" + i + "q" + qpsf + " ");
    }
    return count;
  } 


  public static int queenCombintion_subseq(boolean[] arr, int idx, int tnq, int qpsf, String ans){
    if(qpsf == tnq || idx == arr.length){
      if(qpsf == tnq){
        System.out.println(ans);
        return 1;
      }
      return 0;
    }
    int count = 0;
    count += queenCombintion_subseq(arr, idx + 1, tnq, qpsf + 1, ans + "b" + idx + "q" + qpsf + " ");
    count += queenCombintion_subseq(arr, idx + 1, tnq, qpsf, ans);
    return count;
  }

  public static int queenCombination_INFI(boolean[] arr, int idx, int tnq, int qpsf, String ans){
    if(qpsf == tnq){
      System.out.println(ans);
      return 1;
    }

    int count = 0;
    for(int i=idx; i<arr.length; i++){
      count += queenCombination_INFI(arr, i, tnq, qpsf + 1, ans + "b" + i + "q" + qpsf + " ");
    }

    return count; 
  }


  public static int queenPermutation_1D(boolean []arr, int idx, int tnq, int qpsf, String ans){
    if(qpsf == tnq){
      System.out.println(ans);
      return 1;
    }
    int count = 0;
    for(int i=idx; i<arr.length; i++){

      if(!arr[i]){
        arr[i] = true;
        count += queenPermutation_1D(arr, 0, tnq, qpsf + 1, ans + "b" + i + "q" + qpsf + " ");
        arr[i] = false;
      }
  }

    return count;
  }

  public static int queenPermutation_subseq(boolean []arr, int idx, int tnq, int qpsf, String ans){
    if(qpsf == tnq || idx == arr.length){
      if(qpsf == tnq){
        System.out.println(ans);
        return 1;
      }
      return 0;
    }
    int count = 0;
    if(!arr[idx]){
      arr[idx] = true;
      count += queenPermutation_subseq(arr, 0, tnq, qpsf + 1, ans + "b" + idx + "q" + qpsf + " ");
      arr[idx] = false;
    }
    count += queenPermutation_subseq(arr, idx + 1, tnq, qpsf, ans);
    return count;
  }

  public static int queenPermutation_INFI(boolean []arr, int idx, int tnq, int qpsf, String ans){
    if(qpsf == tnq){
      System.out.println(ans);
      return 1;
    }

    int count = 0;
    for(int i=idx; i<arr.length; i++){
      count += queenPermutation_INFI(arr, 0, tnq, qpsf + 1, ans + "b" + i + "q" + qpsf + " ");
    }

    return count;
  }


  //queen Permutation And Combination 2D======================================================================

  public static int queenCombination_2D(boolean[][] arr, int idx, int tnq, int qpsf,String ans){
    if(qpsf == tnq){
      System.out.println(ans);
      return 1;
    }
    int count = 0;
    for(int i=idx; i<arr.length * arr[0].length; i++){
      int r = i / arr[0].length;
      int c = i % arr[0].length;

      count += queenCombination_2D(arr, i + 1, tnq, qpsf + 1, ans + "(" + r + c + ")");
    }
    return count;
  }

  public static int queenPermutation_2D(boolean[][] arr, int idx, int tnq, int qpsf, String ans){
    if(qpsf == tnq){
      System.out.println(ans);
      return 1;
    }

    int count = 0;
    for(int i=idx; i<arr.length * arr[0].length; i++){

      int r = i / arr[0].length;
      int c = i % arr[0].length;
      if(!arr[r][c]){
        arr[r][c] = true;
        count += queenPermutation_2D(arr, 0, tnq, qpsf + 1, ans + "(" + r + c + ")");
        arr[r][c] = false;
    }
  }

    return count;
  }


  //----> N Queen : ==========================================================================================
  public static int n, m;

  public static boolean isValid(boolean [][]arr, int r, int c){
    // int [][]dirA = {{0, -1}, {-1, -1}, {-1, 0}, {-1, 1}};
    int [][]dirA = {{0, -1}, {-1, -1}, {-1, 0}, {-1, 1},{0, 1}, {1, 1}, {1, 0}, {1, -1}};
    for(int d = 0; d<dirA.length; d++){
      for(int rad=1;rad <= arr.length; rad++){

        int x = r + rad * dirA[d][0];
        int y = c + rad * dirA[d][1];

        if(x >= 0 && y >= 0 && x < arr.length && y < arr[0].length){
          if(arr[x][y]){
            return false;
          }
        }
      }
    }
    return true;
  }

  public static int Nqueen_01_usingCombination(boolean [][]arr, int idx, int tnq, String ans){
    n = arr.length;
    m = arr[0].length;
    if(tnq == 0){
      System.out.println(ans);
      return 1;
    }
    int count = 0;
    for(int i=idx; i< n * m; i++){
      int r = i / m;
      int c = i % m;
      if(isValid(arr, r, c)){
        arr[r][c] = true;
        count += Nqueen_01_usingCombination(arr, i + 1, tnq - 1, ans + "(" + r + c + ")");
        arr[r][c] = false;
      }
    }
    return count;
  }

  public static int Nqueen_02_usingPermutation(boolean [][]arr, int idx, int tnq, String ans){
    n = arr.length;
    m = arr[0].length;

    if(tnq == 0){
      System.out.println(ans);
      return 1;
    }
    int count = 0;
    for(int i=idx; i<n * m; i++){
      int r = i / m;
      int c = i % m;
      if(!arr[r][c] && isValid(arr, r, c)){
        arr[r][c] = true;
        count += Nqueen_02_usingPermutation(arr, 0, tnq - 1, ans + "(" + r + c + ")");
        arr[r][c] = false;
      }
    }
    return count;
  }
  public static boolean []rowA; // n
  public static boolean []colA; // m
  public static boolean []diagA; // n + m - 1
  public static boolean []antiDiagA; // n + m - 1

  public static int Nqueen_03(boolean [][]arr, int idx, int tnq, String ans){
    n = arr.length;
    m = arr[0].length;
    if(tnq == 0){
      System.out.println(ans);
      return 1;
    }
    int count = 0;

    for(int i=idx; i<n * m; i++){
      int r = i / arr[0].length;
      int c = i % arr[0].length;
      if(!rowA[r] && !colA[c] && !diagA[r + c] && !antiDiagA[r - c + m - 1]){
        rowA[r] = true;
        colA[c] = true;
        diagA[r + c] = true;
        antiDiagA[r - c + m - 1] = true;
        count += Nqueen_03(arr, i + 1, tnq - 1, ans + "(" + r + c + ")");
        rowA[r] = false;
        colA[c] = false;
        diagA[r + c] = false;
        antiDiagA[r - c + m - 1] = false;
      }
    }
    return count;
  }

  public static int Nqueen_04(int n, int m, int tnq, int r, String ans){
    if(tnq == 0){
      System.out.println(ans);
      return 1;
    }
    int count = 0;
    for(int c = 0; c < m; c++){
      if (!rowA[r] && !colA[c] && !diagA[r + c] && !antiDiagA[r - c + m - 1])
      {
          rowA[r] = true;
          colA[c] = true;
          diagA[r + c] = true;
          antiDiagA[r - c + m - 1] = true;

          count += Nqueen_04(n, m, tnq - 1, r + 1, ans + "(" + r + "," + c + ") ");

          rowA[r] = false;
          colA[c] = false;
          diagA[r + c] = false;
          antiDiagA[r - c + m - 1] = false;
      }
  }

    return count;
  }


  public static int row = 0;
  public static int col = 0;
  public static int diag = 0;
  public static int adiag = 0;
  public static int Nqueen_05(int n, int m, int tnq, int r, String ans){
    if(tnq == 0){
      System.out.println(ans);
      return 1;
    }
    int count = 0;
    for(int c = 0; c < m; c++){
      if((row & (1 << (r))) == 0 && (col & (1 <<(c))) == 0 && (diag & (1 << (r + c))) == 0 && (adiag &(1 << (r - c + m - 1)))== 0){
            row ^= (1 << r);
            col ^= (1 << c);
            diag ^= (1 << (r + c));
            adiag ^= (1 << (r - c + m - 1));
            count += Nqueen_05(n, m, tnq - 1, r + 1, ans + "(" + r + "," + c + ")");
            row ^= (1 << r);
            col ^= (1 << c);
            diag ^= (1 << (r + c));
            adiag ^= (1 << (r - c + m - 1));
      }
    }
    return count;
  }
  //Summation : (nCr) : =======================================================================================
  public static void solve() {
    int []arr = {2, 3, 5, 7};
    int target = 10;
    // System.out.println(permutationINFI(arr, 0, target, ""));
    // System.out.println(combinationINFI(arr, 0, target, ""));
    System.out.println(permutaionSingleCoin(arr, 0, target, ""));
    // System.out.println(combinationSingleCoin(arr, 0, target, ""));
    
  }

  //Subsequence : 2^n : ========================================================================================
  public static void solve_1() {

    int []arr = {2, 3, 5, 7};
    int target = 10;

    // int []arr = {1,1,1,1,1};
    // int target = 3;
    // System.out.println(permutationINFI_subseq(arr, 0, target, ""));
    // System.out.println(combinationINFI_subseq(arr, 0, target, ""));
    // System.out.println(permutaionSingleCoin_subseq(arr, 0, target, ""));
    // System.out.println(combinationSingleCoin_subseq(arr, 0, target, ""));
    
  }
 
  public static void queen_1D(){
    // boolean []arr = new boolean[5];
    // int tnq = 3;

    // System.out.println(queenCombination_1D(arr, 0, tnq, 0, ""));
    // System.out.println(queenPermutation_1D(arr, 0, tnq, 0, ""));
    // System.out.println(queenCombintion_subseq(arr, 0, tnq, 0, ""));
    // System.out.println(queenPermutation_subseq(arr, 0, tnq, 0, ""));
    // System.out.println(queenCombination_INFI(arr, 0, tnq, 0, ""));
    // System.out.println(queenPermutation_INFI(arr, 0, tnq, 0, ""));
  }

  public static void queen_2D(){
    // int n = 4;
    // int m = 4;
    // boolean [][]arr = new boolean[n][m];
    // int tnq = n;

    // System.out.println(queenCombination_2D(arr, 0, tnq, 0, " "));
    // System.out.println(queenPermutation_2D(arr, 0, tnq, 0, ""));
  }

  public static void Nqueen(){
    n = 4;
    m = 4;
    boolean [][]arr = new boolean[n][m];
    int tnq = n;

    // rowA = new boolean[n]; // n
    // colA = new boolean[m]; // m
    // diagA = new boolean[n + m - 1]; // n + m - 1
    // antiDiagA = new boolean[n + m - 1]; // n + m - 1
    
    // System.out.println(Nqueen_01_usingCombination(arr, 0, tnq, ""));
    // System.out.println(Nqueen_02_usingPermutation(arr, 0, tnq, ""));
    // System.out.println(Nqueen_03(arr, 0, tnq, ""));
    // System.out.println(Nqueen_04(n, m, tnq, 0, ""));
    // System.out.println(Nqueen_05(n, m, tnq, 0, ""));
  }

  public static void set(){

    solve();
    // solve_1();
    // queen_1D();
    // queen_2D();
    // Nqueen();

  }

  public static void main(String[] args) {
    set();
  }
}