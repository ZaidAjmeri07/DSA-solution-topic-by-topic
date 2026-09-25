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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();
        boolean flag = false;

        if(root == null) return ans;

        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);

        while(!q.isEmpty()){

            int n = q.size();
            List<Integer> temp = new ArrayList<>();

            while(n > 0){
                TreeNode front = q.poll();
                temp.add(front.val);
                
                if(front.left != null) q.offer(front.left);
                if(front.right != null) q.offer(front.right);

                n--;
            }

            if(flag){
                Collections.reverse(temp);
                ans.add(temp);
                flag = false;
            }
            else{
                ans.add(temp);
                flag = true;
            }

        }

        return ans;       
    }
}