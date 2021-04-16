import java.util.Scanner;

public class gcd_hcf {
  public static void main(String[] args) {
    
    Scanner scn = new Scanner(System.in);
    int divident = scn.nextInt();
    int divisor = scn.nextInt();

    while(divident%divisor != 0){

      int remainder = divident%divisor;
      divident = divisor;
      divisor = remainder;
    
    }
    System.out.println(divisor);
  }
  
}