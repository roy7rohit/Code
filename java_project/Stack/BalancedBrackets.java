package Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
  
  public static void main(final String[] args) {
    
    final Scanner sn = new Scanner(System.in);
    final String str = sn.nextLine();

    final Stack<Character> stc = new Stack<>();

    for(int i=0; i<str.length(); i++){

      final char ch = str.charAt(i);
      if(ch == ')'){

        if(stc.peek() == '('){
          System.out.println(true);
          return;
        }
        else{
          while(stc.peek() != '('){
            stc.pop();
          }
          stc.pop();
        }
      }
        else{
          stc.push(ch);
        }
      }
      System.out.println(false);
    }
  }
