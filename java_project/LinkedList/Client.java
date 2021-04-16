package LinkedList;

public class Client {
  
  public static void main(String[] args)throws Exception{
    
    LinkedListMain list = new LinkedListMain();
    // list.addLast(10);
    // list.addLast(20);
    // list.addLast(30);
    // list.addLast(40);
    // list.addLast(50);
    // list.addLast(60);
    // list.addLast(70);
    // list.addLast(80);
    // list.addLast(90);

    list.addLast(10);
    list.addLast(10);
    list.addLast(10);
    list.addLast(20);
    list.addLast(20);
    list.addLast(30);
    list.addLast(40);
    list.addLast(40);
    list.addLast(50);
    list.addLast(50);
    list.addLast(50);
    list.addLast(60);
    list.addLast(60);

    list.removeDuplicates();


    list.display();

    list.kReverse(3);

    list.display();

    System.out.println(list.toString());
    System.out.println(list.midNodeOfList());
    

    System.out.println(list.isEmpty());
    list.addAt(100, 1);

    System.out.println(list.midNodeOfList());
    list.reversePointersList();
    System.out.println(list.removeLast());
    list.display();
  
    list.display();

    list.addLast(10);
    list.addFirst(20);
    list.addFirst(30);
    list.addLast(40);
    list.addLast(50);
    list.addFirst(60);
    list.addLast(70);

    // list.display();
    System.out.println(list.getFirst());
    System.out.println(list.getLast());
    System.out.println(list.removeFirst());
    System.out.println(list.getAt(9));
    System.out.println(list.removeAt(4));
    list.reverseList();
    
    list.display();
  }
}