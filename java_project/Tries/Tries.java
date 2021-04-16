package Tries;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Tries {

  private class Node{
    char val;
    HashMap<Character, Node> children;
    boolean isTerminal;

    Node(char val, boolean isTerminal){
      this.val = val;
      this.children = new HashMap<>(); // we have to initialize our HM if we don't than it will show nullPtrException 
      this.isTerminal = isTerminal;
    }
  }

  private int numOfWords;
  private Node root;

  Tries() {
    this.root = new Node('\0', false);
    this.numOfWords = 0;
  }

  // num of words
  public int numWords(){
    return this.numOfWords;
  }

  public void addWord(String word){
    this.addWord(this.root, word);
  }

  private void addWord(Node parent, String word){
    if(word.length() == 0){
      if(parent.isTerminal){
        //word already exists inside my dictionary
      }else{
        parent.isTerminal = true;
        this.numOfWords++;
      }
      return;
    }
    char cc = word.charAt(0);
    String ros = word.substring(1);
    Node child = parent.children.get(cc);
    if(child == null){
      child = new Node(cc, false); // check if it is terminal node or not if not{false}
      parent.children.put(cc, child); // node create karo aur root ke hashmap main add kar do
    }
    this.addWord(child, ros); // here we recursively call our function to add our node in the rest of the String(ros)
  }

  public boolean searchWord(String word){
    return this.searchWord(this.root, word);
  }

  private boolean searchWord(Node parent, String word){
    if(word.length() == 0){
      if(parent.isTerminal){ // if the word exist  
        return true;
      }
      else{ // if the word does not exist
        return false;
      }
    }
    char cc = word.charAt(0);
    String ros = word.substring(1);
    Node child = parent.children.get(cc);
    if(child == null){
      return false;
    }
    return this.searchWord(child, ros);
  }


  public void removeWord(String word){
    this.removeWord(this.root, word);
  }

  private void removeWord(Node parent, String word) {
    if(word.length() == 0){
      if(parent.isTerminal){ // if my current letter is terminal node then delete it 
        parent.isTerminal = false;
        this.numOfWords--;
      }else{//if not a terminal node then it could be the part of other word
      }
      return;
    }
    char cc = word.charAt(0);
    String ros = word.substring(1);
    Node child = parent.children.get(cc);
    if(child == null){
      return;
    }
    this.removeWord(child, ros);
    if(!child.isTerminal && child.children.size() == 0){
      parent.children.remove(cc);
    }
  }
  //=============================================================================================

 

  public void display() {
    this.display(this.root, "");
  }
  private void display(Node node, String osf){
    if(node.isTerminal){
      String toDisplay = osf.substring(1) + node.val;//{{\0}<-ignore||{osf.substring}+{node.val}}
      System.out.println(toDisplay);
    }
    Set<Map.Entry<Character, Node>> entries = node.children.entrySet();
    for(Map.Entry<Character, Node> entry : entries){
      this.display(entry.getValue(), osf + node.val); // root, node.val
    }
  }
}
