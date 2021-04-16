package OOPs;

public class Constructor {
  private int age;
  private String name;

  public Constructor(){
    System.out.println("I am the Default Constructor");
  }

  public Constructor(int age){
    System.out.println("I am parameterized constructor with one parameter");
    this.age = age;
  }
  public Constructor(int age, String name){
    System.out.println("I am parameterized constructor with two parameter");
    this.age = age;
    this.name = name;
  }

  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
}
