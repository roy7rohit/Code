package OOPs;

public class Client {
  public static void main(String[] args) {
    Person p1 = new Person();
    Person p2 = new Person();

    p1.name = "rohit";
    p1.age = 21;
    p2.name = "pawan";
    p2.age = 21;

    System.out.println(p1.name);
    System.out.println(p1.age);

    System.out.println(p2.name);
    System.out.println(p2.age);
  }
  

}
