package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
      Scanner sn = new Scanner(System.in);
      int n = sn.nextInt();
      // tohHighLevel("a", "b", "c", n);
      tohModified("a", "b", "c", n);
    }

    public static void tohHighLevel(String src, String dest, String helper, int n) {
     
      if(n == 0){
        return;
      }

      tohHighLevel(src, helper, dest, n-1);
      System.out.println("Move "+ n +"th" + " disc from " + src +" to " + dest);
      tohHighLevel(helper, dest, src, n-1);
    }

    public static int counter = 0;
    public static void tohModified(String src, String dest, String helper, int n) {
      if(n == 0){
        return;
      }
      counter++;

      System.out.println(counter + " . PreLeft " + src + dest + helper + n);
      tohModified(src, helper, dest, n);

      counter++;

      System.out.println(counter + " . middle " + src + dest + helper + n);
      tohModified(helper, dest, src, n);

      counter++;

      System.out.println(counter + " . PostRight " + src + dest + helper + n);

    }
}