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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> Output = new ArrayList<>();
        inOrder(root, Output);
        return Output;

    }
    public void inOrder(TreeNode root,List<Integer> Output){
        if(root == null){
            return;
        }
        inOrder(root.left,Output);
        Output.add(root.val);
        inOrder(root.right, Output);
    }
}