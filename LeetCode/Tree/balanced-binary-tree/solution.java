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

    public int height(TreeNode root){

        if(root == null) return 0;

        int lh = height(root.left);
        if(lh == Integer.MIN_VALUE) return Integer.MIN_VALUE;
        int rh = height(root.right);
        if(rh == Integer.MIN_VALUE) return Integer.MIN_VALUE;

        int diff = Math.abs(lh - rh);

        if(diff > 1) return Integer.MIN_VALUE; 

        return 1+Math.max(lh,rh);
    }

    public boolean isBalanced(TreeNode root) {

        if(root == null) return true;

        if(height(root) == Integer.MIN_VALUE) return false;

        return true;
    }
}