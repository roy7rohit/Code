package Tree;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericTree {
  private class Node{
    int data;
    ArrayList<Node> children;

    Node(int data){

      this.data = data;
      this.children = new ArrayList();
    }
  }

    private Node root;
    private int size;

    GenericTree(){
      Scanner sn = new Scanner(System.in);
      this.root = takeInput(sn, null, 0);

    }

    //to take input of generic tree
    public Node takeInput(Scanner sn, Node parent, int ithchild){
     if(parent == null){
       System.out.println("Enter the root node");
     } 
     else{
       System.out.println("Enter the data for the " + ithchild + "th child " + parent.data);
     }

    int nodedata = sn.nextInt();
    Node node = new Node (nodedata);
    this.size++;

    System.out.println("Enter the children node data " + node.data);
    int children = sn.nextInt();

    //will be excuted according to the value of children
    for(int i=0; i<children; i++){
      Node child = this.takeInput(sn, node, i);
      node.children.add(child);
    }

    return node;
    }
    public void display(){

      this.display(this.root);

    }

    private void display(Node node){
      //node data
      String str = node.data + " -> ";
      for(int i=0; i<node.children.size(); i++){
        //add children data of current node
        str += node.children.get(i).data + " , ";
      }

      str = str + " END ";
      System.out.println(str);
      //display for all nodes
      for(int i=0; i<node.children.size(); i++){
        this.display(node.children.get(i));
      }

    }
  
}