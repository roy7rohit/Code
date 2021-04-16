package LinkedList;
public class LinkedListQuestions {  
  public static class LinkedList{
    
    public class ListNode{
    
      int data = 0;
      ListNode  next = null;

      ListNode(int data){
        this.data = data;
      }
    }

    ListNode head = null;
    ListNode tail = null;
    int size = 0;

    public int size(){
      return this.size;
    }

    public boolean isEmpty(){
      return size == 0;
    }

    public String toString(){
      ListNode curr = this.head;
      String str = "";
      while(curr != null){
        str += (curr.data + " -> ");
        curr = curr.next;
      }

      return str;
    }

    public ListNode getNodeAt(int indx){
      ListNode curr = this.head;
      while(indx-- > 0){
        curr = curr.next;
      }
      return curr;
    }

    //Add functions in LinkedList

    public void addFirstNode(ListNode node){
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
      ListNode node = new ListNode(data);
      addFirstNode(node);
    }

    public void addLastNode(ListNode node){
      if(this.size == 0){
        this.head = node;
        this.tail = node;
      }
      else{
        this.tail.next = node;
        this.tail = node;
      }
      this.size++;
    }

    public void addLast(int data){
      ListNode node = new ListNode(data);
      addLastNode(node);
    }

    public void addAtNode(ListNode node, int indx){
      if(indx == 0){
        addFirstNode(node);
      }
      else if(indx == this.size){
        addLastNode(node);
      }
      else{
        ListNode prev = getNodeAt(indx - 1);
        ListNode curr = prev.next;

        prev.next = node;
        node.next = curr;

      }
      this.size++;
    }

    public void addAt(int data, int indx){
      if(indx < 0 || indx > this.size){
        System.out.println("throw exception");
        return;
      }
      ListNode node = new ListNode(data);
      addAtNode(node, indx);
    }

    //*******************************************************************************************

    //Remove function in LinkedList

    public int removeFirst(){
      if(this.size == 0){
        System.out.println("list is Empty");
        return -1;
      }

      ListNode rnode = this.head;
      if(this.size == 1){
          this.head = null;
          this.tail = null;
      }
      else{
        this.head.next = this.head;
        this.head = null;
      }
      this.size--;
      return rnode.data;
    }

    public int removeLast(){
      if(this.size == 0){
        System.out.println("list is empty");
        return -1;
      }
      
      ListNode rnode = this.tail;
      if(this.size == 1){
        this.head = null;
        this.tail = null;
      }
      else{
        ListNode temp = getNodeAt(this.size() - 2);
        temp.next = null;
        this.tail = temp;
      }
      this.size--;
      return rnode.data;
    }

    public void removeAt(int indx) {
      if(indx < 0 || indx > this.size){
        System.out.println("null pointer exception");
        return ;
      }

      if(indx == 0){
        removeFirst();
      }
      else if(indx == this.size - 1){
        removeLast();
      }
      else{
        ListNode prev = getNodeAt(indx - 1);
        ListNode curr = prev.next;
        prev.next = curr.next;
        curr.next = null;
        this.size--;
      }
    }
   //============================================================================================

    public ListNode midNode(ListNode node) {
      if(node == null || node.next == null){
        return node;
      }

      ListNode slow = node, fast = node;
      while(fast.next != null && fast.next.next != null){

        slow = slow.next;
        fast = fast.next.next;
      }

      return slow;
    }

    public ListNode  mid(ListNode node){
      if(node == null || node.next == null){
        return node;
      }

      ListNode slow = node, fast = node;
      while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
      }
      return slow;
    }

    public ListNode reverseList(ListNode node){
      if(node == null || node.next == null){

        return node;
      }
      ListNode prev = null;
      ListNode curr = node;
      
      while(curr != null){
        ListNode ahead = curr.next;//backup
        curr.next = prev;//connection

        prev = curr;//move forward
        curr = prev;
      }

      return prev;
    }
    //********************************************************************************************
    //LinkedList Palindrome

    public boolean isPalindrome(ListNode node){
      if(node == null || node.next == null){
        return true;
      }

      ListNode mid = midNode(node);
      ListNode nhead = mid.next;
      mid.next = null;

      nhead = reverseList(nhead);
      ListNode c1 = node, c2 = nhead;
      boolean res = true;

      while(c1 != null && c2 != null){
        if(c1.data != c2.data){
          res = false;
          break;
        }

        c1 = c1.next;
        c2 = c2.next;
      }

      nhead = reverseList(nhead);
      mid.next = nhead;

      return res;
    }

    //********************************************************************************************
    //reorder LinkedList
    public void reorderList(ListNode node){
      if(node == null || node.next == null){
        return;
      }

      ListNode mid = midNode(node);
      ListNode nhead = mid.next;
      mid.next = null; //connection break

      nhead = reverseList(nhead);
      ListNode c1 = node, c2 = nhead;
      while(c1 != null && c2 != null){

        ListNode f1 = c1.next, f2 = c2.next;
        
        c1.next = c2;//connection
        c2.next = f1;//connection

        c1 = f1;//shifting forward
        c2 = f2;//shifting forward
      }
    }

    //===========================================================================================
    //remove from n to mth node

    public ListNode removeTheNthNodeEnd(ListNode node, int n){
      if(node == null || node.next == null){
        return node;
      }

      ListNode c1 = head, c2 = head;
      while(n-- > 0){
        c2 = c2.next;
      } 
      if(c2 == null){
        return head.next;
      }

      while(c2.next != null){

        c1 = c1.next;
        c2 = c2.next;
      }

      ListNode rnode = c1.next;
      c1.next = rnode.next;
      rnode.next = null;

      return head;
    }

    //===========================================================================================
    //merge two lists

    public ListNode merge2Lists(ListNode l1, ListNode l2){
      if(l1 == null || l2 == null){
        return l1 == null ? l2 : l1; 
      }

      
    }
}

}