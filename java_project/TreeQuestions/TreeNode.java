package TreeQuestions;
import java.util.Stack;
//Definition for a binary tree node.
 public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    //leetcode : 1022 =========================================================================
    public static int sumRootToLeaf(TreeNode root) {
      int sum = 0;
      if(root == null){
        return 0;
      }
      Stack<TreeNode> st = new Stack();
      st.push(root);
      while(!st.isEmpty()){
        root = st.pop();
        if(root.left == null && root.right == null){
          sum += root.val;
        }
        if(root.right != null){
          root.right.val = 2 * root.val + root.right.val;
          st.push(root.right);
        }
        if(root.left != null){
          root.left.val = 2 * root.val + root.left.val;
          st.push(root.left);
        }
      }

      return sum;
    }
  //leetcode : 1033 =======================================================================
    public static int sumRootToLeaf_02(TreeNode root) {
      return dfs(root, 0);
    }


    public static int dfs(TreeNode root, int sum){
    if(root == null){
      return 0;
    }
    sum = sum * 2 + root.val;
    return (root.left == null && root.right == null) ? sum : dfs(root.left, sum) + dfs(root.right, sum);
  }
}

  //LeetCode : 1033 =========================================================================
  // public static int sumRootToLeaf_03(TreeNode root){

  // }
  // }
