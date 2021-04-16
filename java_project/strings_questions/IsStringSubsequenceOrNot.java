package strings_questions;

public class IsStringSubsequenceOrNot{
  
  public static void main(String[] args) {
    
    boolean res = stringSubsequence("adgi", "aabdefghij");
    System.out.println(res);

  }

  public static boolean stringSubsequence(String str1, String str2) {

    if(str1.length()==0){

      return true;
    }
    int i = 0;
    int j = 0;

    while(i < str1.length() && j < str2.length()){

      if(str1.charAt(i) == str2.charAt(j)){

        i++;
      }
      if(str1.length() == i){

        return true;
      }

      j++;
    }
    return false;

  }
}