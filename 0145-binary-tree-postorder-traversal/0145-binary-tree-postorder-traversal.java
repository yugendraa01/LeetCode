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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> out = new ArrayList<>();
        postOrder(root, out);
        return out;
    }
    public void postOrder(TreeNode root, List<Integer> out){
        if(root == null){
            return;
        }
        postOrder(root.left, out);
        postOrder(root.right, out);
        out.add(root.val);
    }
}