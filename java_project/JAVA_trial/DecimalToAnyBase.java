package JAVA_trial;

import java.util.Scanner;

public class DecimalToAnyBase {

 public static void main(String[] args) {

  Scanner sn = new Scanner(System.in);
  int snum = sn.nextInt();
  int db = sn.nextInt();
   
  int res = Decimal_toAnyBase(snum, db); 
  System.out.println(res);
 } 

 public static int Decimal_toAnyBase(int snum, int db) {
  
  int ans = 0;
  int mult = 1;

  while(snum != 0){

    int rem = snum%db;
    ans = ans + (rem * mult);
    mult = mult * 10;
    
    snum = snum/db;
  }
  return ans;
 }
}