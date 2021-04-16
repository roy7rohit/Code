package LinkedList;

public class LinkedListMain {
    private class Node{

      int data;
      Node next;
    }
    
      private Node head;
      private Node tail;
      private int size;

    public void display(){

      System.out.println("*********************************************************************");

      Node temp = this.head;
      while(temp != null){

        System.out.print(temp.data + " -> ");
        temp = temp.next;
      }
      System.out.println();
      System.out.println("*********************************************************************");
    }

    public void addLast(int item){
      //create a new node
      Node nn = new Node();
      nn.data = item;
      nn.next = null;

      //attach your old linkedlist with new linkedlist 
      if(this.size >= 1){

        this.tail.next = nn;
      }
      //summary object its an special case of addition if there is no node has been created
      if(this.size == 0){
        this.head = nn;
        this.tail = nn;
        this.size++; 
      }else{
        this.tail = nn;
        this.size++;
      }
    }

    public void addFirst(int item){

      Node nn = new Node();
      nn.data = item;
      nn.next = null;

      if(this.size >= 1){
        nn.next = head;
      }
      if(this.size == 0){
        this.head = nn;
        this.tail = nn;
        this.size++;
      }
      else{
        this.head = nn;
      }
    }

    //O(1)

    public int getFirst() throws Exception{

      if(this.size == 0){
        throw new Exception("ll is empty");
      }
      return this.head.data;
    }

    //O(1)

    public int getLast() throws Exception{

      if(this.size == 0){
        throw new Exception("LinkedList is empty");
      }
      return this.tail.data;
    }

    public int getAt(int idx) throws Exception {
      if(this.size == 0){
        throw new Exception("LinkedList is empty");
      }
      if(idx < 0 || idx >= this.size){

        throw new Exception("invalid index");
      }   
      Node temp = this.head;
      for(int i=1; i<=idx; i++){
        temp = temp.next;
      }

      return temp.data;
    }

    private Node getNodeAt(int indx) throws Exception {
      if(this.size == 0){
        throw new Exception("LinkedList is empty");
      }

      if(indx < 0 || indx >= this.size){
        throw new Exception("Index is invalid"); 
      }

      Node temp = this.head;
      for(int i=1; i<=indx; i++){
        temp = temp.next;
      }
      return temp;
    }

    public void addAt(int item, int idx) throws Exception {
      if(idx < 0 || idx > this.size){
        throw new Exception("Invalid Index");
      }
      
      if(idx == 0){
        addFirst(item);
      }
      else if(idx == this.size){
        addLast(item);
      }
      else{

        //create new node
        Node nn = new Node();
        nn.data = item;
        nn.next = null;

        //attach
        Node nm1 = getNodeAt(idx - 1);
        Node np1 = nm1.next; //getNodeAt(idx);

        nm1.next = nn;
        nn.next = np1;

        //summary
        this.size++;

      }
    }

    
    public int removeFirst() throws Exception {
      if(this.size == 0){
        throw new Exception("LinkedList is empty");
      }
      
      int rv = this.head.data;
      if(this.size == 1){
        this.head = null;
        this.tail = null;
        this.size = 0;
      }else{

        this.head = this.head.next;
        this.size--;
      }

      return rv;
    }
    public int removeLast() throws Exception {
      if(this.size == 0){
        throw new Exception("LinkedList is Empty");
      }
      int rv = this.tail.data;
      
      if(this.size == 1){
        this.head = null;
        this.tail = null;
        this.size = 0;
      }
      else{
        Node sizem2 = getNodeAt(this.size - 2);
        this.tail = sizem2;
        this.tail.next = null;
        this.size--;
      }
      return rv;
    }

    public int removeAt(int idx) throws Exception {
      if(this.size == 0){
        throw new Exception("LinkedList is Empty");
      }

      if(idx < 0 || idx >= this.size){
        throw new Exception("Invalid Index");
      }

      if(idx == 0){
        return removeFirst();
      }
      else if(idx == this.size - 1){
        return removeLast();
      }
      else{
        Node nm1 = getNodeAt(idx - 1);
        Node n = nm1.next;
        Node np1 = n.next;

        nm1.next = np1;
        this.size--;

        return n.data;
      }

    }

    public void reverseList() throws Exception {
      int left = 0;
      int right = this.size - 1;

      while(left < right){

        Node ln = getNodeAt(left);
        Node rn = getNodeAt(right);
        
        int temp = ln.data;
        ln.data = rn.data;
        rn.data = temp;

        left++;
        right--;
      }
    }

    public void reversePointersList(){

      Node prev = this.head;
      Node curr = prev.next;

      while(curr != null){
        Node ahead = curr.next;
        curr.next = prev;

        // shifting of pointers
        prev = curr;
        curr = ahead;

        // swap your head and tail

        Node temp = this.head;
        this.head = this.tail;
        this.tail = temp;

        //now make your tail.next = null

        this.tail.next = null;
      }
    }

    public int midNodeOfList(){

      Node slow = this.head;
      Node fast = this.head;

      while(fast.next != null && fast.next.next != null){

        slow = slow.next;
        fast = fast.next.next;
      }

      return slow.data;
    }

    public boolean isEmpty(){
      return size==0 ? true : false;
  }
  @Override
  public String toString(){
      Node curr=this.head;
      String str="";
      while(curr!=null){
          str+=(curr.data + " -> ");
          curr=curr.next;
      }
      return str;
  }

  public Node midNode(Node node) {
    if(node == null || node.next == null){
      return node;
    }

    Node slow = node, fast = node;
    while(fast.next != null && fast.next.next != null){

      slow = slow.next;
      fast = fast.next.next;
    }

    return slow;
  }

  public Node  mid(Node node){
    if(node == null || node.next == null){
      return node;
    }

    Node slow = node, fast = node;
    while(fast != null && fast.next != null){
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  public void kReverse(int k)throws Exception {

    LinkedListMain nl = new LinkedListMain();
    LinkedListMain temp = new LinkedListMain();

    while(!this.isEmpty()){
        for(int i=0; i<k; i++){
        this.addFirst(this.removeFirst());
        // int data = this.removeFirst();
        // temp.addFirst(data);
      }

      if(nl.size == 0){
        nl = temp;
        temp = new LinkedListMain();
      }
      else{
        nl.tail.next = temp.head;
        nl.tail = temp.tail;
        nl.size += temp.size;
        temp = new LinkedListMain();
      }
    }
    this.head = nl.head;
    this.tail = nl.tail;
    this.size = nl.size;
  }

  public void removeDuplicates() throws Exception {

    LinkedListMain list = new LinkedListMain();
    while(this.isEmpty() == false){
      int rem = this.removeFirst();

      if(list.size == 0 || list.tail.data != rem){
        list.addLast(rem);
      }
    }

    this.head = list.head;
    this.tail = list.tail;
    this.size = list.size;
  }

  }