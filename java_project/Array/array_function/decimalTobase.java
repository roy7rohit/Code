package Array.array_function;

import java.util.Scanner;

public class decimalTobase {

  public static void main(String[] args) {


    Scanner sn = new Scanner(System.in);
    int snum = sn.nextInt();
    int db = sn.nextInt();
    
    int result = decToAnyBase(snum, db);
    System.out.println(result);
  }
  public static int decToAnyBase(int source_num, int dest_base) {
   int ans = 0;
   int multiplier = 1;
   while(source_num != 0){

    int rem = source_num % dest_base;
    ans = ans + (rem  * multiplier);
    multiplier = multiplier * 10;
    source_num = source_num / dest_base;
   }
  return ans;
  }
  
}