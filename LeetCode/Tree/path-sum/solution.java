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

    public boolean solve(TreeNode root , int targetSum , int nowSum){

        if(root == null) return false; 

        if(root.left == null && root.right == null ){
            return nowSum + root.val == targetSum;
        }

        return solve(root.left , targetSum , root.val + nowSum) || solve(root.right , targetSum , root.val + nowSum);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {

        if(root == null) return false;
        
        return solve(root,targetSum,0);
    }
}