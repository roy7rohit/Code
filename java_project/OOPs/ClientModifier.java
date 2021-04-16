package OOPs;

public class ClientModifier {
  public static void main(String[] args) {
    AccessModifiers am = new AccessModifiers();
    System.out.println(am.d1); //public
    System.out.println(am.d2); //private(it will show error)
    System.out.println(am.d3); //default
    System.out.println(am.d4); //protected


  }
}
