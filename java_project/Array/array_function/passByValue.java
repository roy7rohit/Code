package Array.array_function;

public class passByValue {
  public static void main(String[] args) {
    int x = 10, y = 20;

    System.out.println(x+ "," +y);
    swap(x, y);
    System.out.println(x+ "," +y);

  }

  public static void swap(int a, int b) {
    
    int temp;
    temp = a;
    a = b;
    b = temp;
    System.out.println(a+ "," +b);
  }
}
