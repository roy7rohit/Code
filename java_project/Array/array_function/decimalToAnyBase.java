package Array.array_function;

import java.util.Scanner;

public class decimalToAnyBase {
  public static void main(String[] args) {


    Scanner sn = new Scanner(System.in);
    int snum = sn.nextInt();
    int sb = sn.nextInt();
    
    int result = decToAnyBase(snum, sb);
    System.out.println(result);
  }
  public static int decToAnyBase(int source_num, int source_base) {
   int ans = 0;
   int multiplier = 1;
   while(source_num != 0){

    int rem = source_num % 10;
    ans = ans + (rem  * multiplier);
    multiplier = multiplier * source_base;
    source_num = source_num / 10;
   }
  return ans;
  }
    
  }
