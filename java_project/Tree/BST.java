package Tree;

import java.util.ArrayList;

public class BST {
  public static class Node{

    int val = 0;
    Node left = null;
    Node right = null;

    Node(int data){
      this.val = val;
    }
  }
  
  // static int idx = 0;

  public static Node treeConstruction(int[] arr, int si, int ei) {
    if (si > ei) {
      return null;
    }
    int mid = si - (ei + si) / 2;
    Node node = new Node(arr[idx++]);
    node.left = treeConstruction(arr, si, mid - 1);
    node.right = treeConstruction(arr, mid - 1, ei);
    return node;
  }

  public static int height(Node node){
    return node == null ? -1 : Math.max(height(node.left), height(node.right)) + 1;
  }

  public static int size(Node node){
    return node == null ? 0 : size(node.left) + size(node.right) + 1;
  }

  public static void preOrder(Node node, ArrayList<Integer> ans){
    if(node == null){
      return;
    }
    ans.add(node.val);
    preOrder(node.left, ans);
    preOrder(node.right, ans);
  }

  public static void postOrder(Node node, ArrayList<Integer> ans){
    if(node == null){
      return;
    }
    postOrder(node.left, ans);
    postOrder(node.right, ans);
    ans.add(node.val);
  }

  public static boolean find(Node node, int data){
    Node curr = node;
    while(curr != null){
      if(curr.val == data){
        return true;
      }
      else if(curr.val > data){
        curr = curr.left;
      }
      else{
        curr = curr.right;
      }
    }
    return false;
  }

  public static boolean find_rec(Node node, int data){
    if(node == null){
      return false;
    }
    if(node.val == data){
      return true;
    }
    else if(node.val > data){
      return find_rec(node.left, data);
    }
    else{
      return find_rec(node.right, data);
    }
  }

  public static ArrayList<Node> rootTONodePAth(Node node, int data){
    Node curr = node;
    if(curr == null){
      return new ArrayList<>();
    }
    ArrayList<Node> path = new ArrayList<>();
    while(curr != null){
      if(curr.val == data){
        path.add(curr);
        break;
      }
      else if(curr.val > data){
        path.add(curr);
        curr = curr.left;
      }
      else{
        path.add(curr);
        curr = curr.right;
      }
    }
    return path;
  }

  public static int maximum(Node node){
    Node curr = node;
    while(curr.right != null){
      curr = curr.right;
    }
    return curr.val;
  }

  public static int minimum(Node node){
    Node curr = node;
    while(curr.left != null){
      curr = curr.left;
    }
    return curr.val;
  }

  public static Node LCA(Node node, int p, int q){
    Node curr = node;
    while(curr != null){
      if(curr.val > p && curr.val > q){
        curr = curr.left;
      }
      else if(curr.val < p && curr.val < q){
        curr = curr.right;
      }
      else{ // check if (p) & (q) are not present in tree
        return find(node, p) && find(node, q) ? curr : null;
      }
    }
    return null;
  }

  public static void searchInRange(Node node, int a, int b, ArrayList<Integer> ans){
    if(node == null){
      return;
    }
    searchInRange(node.left, a, b, ans);
    if(node.val >= a && node.val <= b){
      ans.add(node.val);
    }
    searchInRange(node.right, a, b, ans);
  }
  static int idx = 0;
  public static Node constructTreeUsingPreorder(int[] arr, int leftB, int rightB){
    if(idx == arr.length || arr[idx] < leftB || arr[idx] > rightB){
      return null;
    }
    Node node = new Node(arr[idx++]);
    node.left = constructTreeUsingPreorder(arr, leftB, node.val);
    node.right = constructTreeUsingPreorder(arr, node.val, rightB);
    return node; 
  }

  public static Node constructTreeUsingPreorder(int []arr){
    int idx = 0;
    return constructTreeUsingPreorder(arr, -1000000, 1000000);
  }

  public static Node constructTreeUsingPostorder(int[] arr, int leftB, int rightB){
    if(idx == -1 || arr[idx] < leftB || arr[idx] > rightB){
      return null;
    }
    Node node = new Node(arr[idx++]);
    node.right = constructTreeUsingPostorder(arr, node.val, rightB);
    node.left = constructTreeUsingPostorder(arr, leftB, node.val);
    return node;
  }

  public static Node constructTreeUsingPostorder(int []arr){
    int idx = arr.length - 1;
    return constructTreeUsingPostorder(arr, -100000000, 100000000); 
  }

  public static int heightTreeUsingPreOrder(int []arr, int leftB, int rightB){
    if(idx == arr.length || arr[idx] < leftB || arr[idx] > rightB){
      return -1;
    }
    int data = arr[idx];
    idx++;
    int lh = heightTreeUsingPreOrder(arr, leftB, data);
    int rh = heightTreeUsingPreOrder(arr, data, rightB);
    return Math.max(lh, rh) + 1;
  }

  public static int heightTreeUsingPreOrder(int []arr){
    int idx = 0;
    return heightTreeUsingPreOrder(arr, -10000000, 10000000);
  }

  public static void predSuccInBST(Node node, int data){
    Node curr = node;
    Node pred = null;
    Node succ = null;
    while(curr != null){
      if(curr.val > data){
        succ = curr;
        curr = curr.left;
      }
      else if(curr.val < data){
        pred = curr;
        curr = curr.right;
      }
      else{
        Node tPred = curr.left;
        if(tPred != null){
          while(tPred.right != null){
            tPred = tPred.right;
          }
          pred = tPred;
        }
        Node tSucc = curr.right;
        if(tSucc != null){
          while(tSucc.left != null){
            tSucc = tSucc.left;
          }
          succ = tSucc;
        }
      }
    }
  }
//================================================================================================

  public static void display(Node node) {
    if (node == null)
        return;
    String str = "";
    str += node.left != null ? node.left.val : ".";
    str += " <- " + node.val + " -> ";
    str += node.right != null ? node.right.val : ".";
    System.out.println(str);

    display(node.left);
    display(node.right);
}
  public static void solve(){

  }
  public static void main(String[] args) {
    solve();
  }
}
