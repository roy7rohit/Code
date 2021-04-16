package OOPs;

public class ConstructorClient {
  public static void main(String[] args) {
    Constructor c1 = new Constructor();
    Constructor c2 = new Constructor();
    Constructor c3 = new Constructor(21);

    Constructor c4 = new Constructor(21, "rohit");

    System.out.println(c1.getAge());
    System.out.println(c1.getName());


    System.out.println(c2.getAge());
    System.out.println(c2.getName());

    System.out.println(c3.getAge());
    System.out.println(c3.getName());

    System.out.println(c4.getAge());
    System.out.println(c4.getName());



  }
}
