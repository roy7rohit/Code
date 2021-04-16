import java.util.Scanner;

public class sumOfNnatualNo {
  public static void main(String[] args) {
    
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int count = 1;
    int sum = 0;

    while(count <= n){

      sum = sum + count;
      count = count + 1;
    }
    
  }
  
}