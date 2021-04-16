package Tree;

import java.util.ArrayList;
import java.util.List;


public class TreeRoy {
  public static class Node{
    int val  = 0;
    Node left  = null;
    Node right = null;

    Node(int val){
      this.val = val;
    }
  }

  public static boolean rootTONodePath(Node root, int val, ArrayList<Node> path){
    if(root == null){
      return false;
    }

    if(root.val == val){
      path.add(root);
      return true;
    }

    boolean res = rootTONodePath(root.left, val, path) || rootTONodePath(root.right, val, path);
    if(res){
      path.add(root);
    }
    return res;
  }

  public static Node LCA(Node root, Node p, Node q){
    ArrayList<Node> arr1 = new ArrayList<>();
    rootTONodePath(root, p.val, arr1);
    ArrayList<Node> arr2 = new ArrayList<>();
    rootTONodePath(root, q.val, arr2);

    int i = arr1.size() - 1;
    int j = arr2.size() - 1;

    Node lca = null;
    while(i >= 0 && j >= 0){
      if(arr1.get(i) == arr2.get(j)){
        lca = arr1.get(i);
      }

      i--;
      j--;
    }

    return lca;
  }

  public static boolean pathSum(Node root, int sum){
    if(root == null){
      return false;
    }

    if(root.left == null && root.right == null && sum - root.val == 0){
      return true;
    }
    return pathSum(root.left, sum - root.val) || pathSum(root.right, sum - root.val);
  }

  public static void pathSum(Node root, int sum, List<List<Integer>> res,List<Integer> ans){
    if(root == null){
      return;
    }
    if(root.left == null && root.right == null && sum - root.val == 0){
      List<Integer> base = new ArrayList<>();
      base.add(root.val);
      res.add(base);
      return;
    }

    ans.add(root.val);
    pathSum(root.left, sum - root.val, res, ans);
    pathSum(root.right, sum - root.val, res, ans);
    ans.remove(ans.size() - 1);
  }

  public static List<List<Integer>> pathSum_(Node root, int sum) {
    List<List<Integer>> res = new ArrayList<>();
    pathSum(root,sum,res,new ArrayList<>());
    return res;
}

static int maxSumLTL = -(int)1e8;
public static int leafToleaf(Node node){
  if(node == null){
    return 0;
  }

  if(node.left == null && node.right == null){
    return node.val;
  }
  int la = leafToleaf(node.left);
  int ra = leafToleaf(node.right);

  if(node.left != null && node.right != null){
    maxSumLTL = Math.max(maxSumLTL, la + node.val + ra);
  }
  return Math.max(la, ra) + node.val;
}
}

