import java.util.ArrayList;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> out = new ArrayList<>();
        preOrder(root, out);
        return out;
    }
    public void preOrder(TreeNode root,List<Integer> out){
        if(root == null){
            return;
        }
        out.add(root.val);
        preOrder(root.left, out);
        preOrder(root.right, out);
    }
}