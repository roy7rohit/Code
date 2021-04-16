package LevelUp.LinkedList;
public class LinkedListPrac {
  public static class LL{
    private class Node{
      int data = 0;
      Node next = null;

      public Node(int data){
        this.data = data;
      }
    }

    private int size = 0;
    private Node head;
    private Node tail;

    // Basic Functions : =================================================================
    private int size(){
      return this.size;
    }
    private boolean isEmpty(){
      return this.size == 0;
    }

    private Node getNodeAt(int idx){
      Node curr = this.head;
      while(idx-- > 0){
        curr = curr.next;
      }

      return curr;
    }

    private String display(){
      Node curr = this.head;
      String str = "[";
      while(curr != null){
        str += (curr.data +" , ");
        curr = curr.next;
      }
      return (str + "]\n");
    }

    public void display_(Node node){
      if(node == null){
        return;
      }
      System.out.println(node.data);
      display_(node.next);
    }

    public  void display2(){
      display_(this.head);
    }
    @Override
    public String toString(){
      return display();
    }

    //Add Functions : ========================================================================
    private void addFirstNode(Node node){
      if(this.size == 0){
        this.head = node;
        this.tail = node;
      }else{
        node.next = this.head;
        this.head = node;
      }
      this.size++;
    }

    public void addFirst(int data){
      Node node = new Node(data);
      addFirstNode(node);
    }

    private void addLastNode(Node node){
      if(this.size == 0){
        this.head = node;
        this.tail = node;
      }else{
        this.tail.next = node;
        this.tail = node;
      }
      this.size++;
    }

    public void addLast(int data){
      Node node = new Node(data);
      addLastNode(node);
    }

    private void addAt(Node node, int idx){
      if(this.size == 0){
        addFirstNode(node);
      }
      else if(idx == this.size - 1){
        addLastNode(node);
      }
      else{
        Node prev = getNodeAt(idx - 1);
        Node fowd = prev.next;
        prev.next = node;
        node.next = fowd;
        this.size++;
      }
    }


    // Remove Functions : ======================================================================

    private Node removeFirstNode(){
      Node rn = this.head;
      if(this.size == 1){
        this.head = null;
        this.tail = null;
      }else{
        this.head = this.head.next;
      }
      rn.next = null;
      this.size--;
      return rn;

    }

    public int removeFirst(){
      if(this.size == 0){
        System.out.println("LL is Empty");
        return -1;
      }
      Node rn = removeFirstNode();
      int rd = rn.data;
      return rd; 
    }

    private Node removeLastNode(){
      Node rn = this.tail;
      if(size == 1){
        this.head = null;
        this.tail = null;
      }else{
        Node prev = getNodeAt(this.size - 2);
        this.tail = prev;
        prev.next = null;
      }
      this.size--;
      return rn;
    }

    public int removeLast(){
      if(this.size == 0){
        System.out.println("LL is Empty");
        return -1;
      }

      Node rn = removeLastNode();
      int rd = rn.data;
      return rd;
    }

    private Node removeNodeAt(int idx){
      if(this.size == 0){
        return removeFirstNode();
      }
      else if(idx == this.size - 1){
        return removeLastNode();
      }
      else{
        Node prev = getNodeAt(idx - 1);
        Node rn = prev.next;

        prev.next = prev.next.next;
        rn.next = null;
        this.size--;
        return rn;
      }
    }

    public int removeAt(int idx){
      if(this.size == 0){
        System.out.println("LL is Empty");
        return -1;
      }
      else if(idx < 0 || idx >= this.size){
        System.out.println("Null Pointer Exception");
        return -1;
      }
      Node rn = removeNodeAt(idx);
      int rd = rn.data;
      return rd;
    }

    // Get Functions : ====================================================================

    public int getFirst(){
      if(this.size == 0){
        System.out.println("LL is Empty");
        return -1;
      }
      return this.head.data;
    }

    public int getLast(){
      if(this.size == 0){
        System.out.println("LL is Emmpty");
        return -1;
      }
      return this.tail.data;
    }

    public int getAt(int idx){
      if(this.size == 0){
        System.out.println("LL is Empty");
        return -1;
      }
      else if(idx < 0 || idx >= this.size){
        System.out.println("Null Pointer Exception");
        return -1;
      }

      return getNodeAt(idx).data;
    }
  }

  public static void main(String[] args) {
    LL list = new LL();
    for(int i=0; i<10; i++){
      // list.addLast(i * 10);
    }
    System.out.println(list);
    list.display();
    

  }
}

