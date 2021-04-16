package Recursion;

public class RecursionPrint {
  
  public static void main(String[] args) {

    // subSequence("abcdefg", "");
    // permutation("abcdefghijklmnopqrstuvwxyz", ""); 
    // int res = BoardPathCount(0, 10); 
    // System.out.println(res);
    // boardPath(0, 10, "");
    // mazePath(0, 0, 3, 3, "");
    // int res = conuntMazePath(0, 0, 2, 2);
    // System.out.println(res);
    // printMAzePAthD(0, 0, 2, 2, "");
    System.out.println(countMAzePAthD(0, 0, 2, 2));
    
  }
  public static void subSequence(String str, String ans) {
    
    if(str.length() == 0){
      System.out.println(ans);
      return;
    }

    char ch = str.charAt(0);
    String res = str.substring(1);

    subSequence(res, ans);
    subSequence(res, ans + ch);

  }

  //===================================================================================

  public static void permutation(String ques, String ans) {
    if(ques.length() == 0){
      System.out.println(ans);
      return;
    
    }
    for(int i=0; i<ques.length(); i++){
      char ch = ques.charAt(0);
      String recurQues = ques.substring(0, i) + ques.substring(i + 1);
      permutation(recurQues, ans + ch); 

    }
  }

 //====================================================================================
 
  public static int BoardPathCount(int start, int end) {
    if(start == end){
      return 1;
    }
    if(start > end){
      return 0;
    }

    int counter = 0;
    for(int dice=1; dice<=6; dice++){
      counter += BoardPathCount(start + dice, end);
    }

    return counter;
  }

//=====================================================================================

  public static void boardPath(int start, int end, String ans) {
    
    if(start == end){
      System.out.println(ans);
      return;
    }

    if(start > end){
      return;
    }

    for(int dice=1; dice<=6; dice++){
      boardPath(start + dice, end, ans + dice);
    }
  }

//=====================================================================================

public static void mazePath(int cr, int cc, int er, int ec, String ans) {
  
  if(cr == er && cc == ec){
    System.out.println(ans);
    return;
  }

  if(cr > er || cc > ec){
    return;
  }

  mazePath(cr, cc + 1, er, ec, ans + "H");
  mazePath(cr + 1, cc, er, ec, ans + "V");
}

//=====================================================================================

public static int conuntMazePath(int cr, int cc, int er, int ec) {
 
  if(cr == er && cc == ec){
    return 1;
  }

  if(cr > er || cc > ec){
    return 0;
  }

  int ch = conuntMazePath(cr, cc + 1, er, ec); 
  int cv = conuntMazePath(cr + 1, cc, er, ec);
 
  return (ch + cv);
}

//=========================================================================================

public static void printMAzePAthD(int cr, int cc, int er, int ec, String ans){
  if(cr == er && cc == ec){
    System.out.println(ans);
    return;
  }

  if(cr > er || cc > ec){
    return;
  }
  printMAzePAthD(cr, cc + 1, er, ec, ans + "H");
  printMAzePAthD(cr + 1, cc, er, ec, ans + "V");
  printMAzePAthD(cr + 1, cc + 1, er, ec, ans + "D");

}

//=============================================================================================


public static int countMAzePAthD(int cr, int cc, int er, int ec){
  if(cr == er && cc == ec){
    return 1;
  }

  if(cr > er || cc > ec){
    return 0;
  }
  int ch = countMAzePAthD(cr, cc + 1, er, ec);
  int cv = countMAzePAthD(cr + 1, cc, er, ec);
  int cd = countMAzePAthD(cr + 1, cc + 1, er, ec);


  return (ch + cv + cd);
}
}
