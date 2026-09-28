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

class Pair{
    int val;
    int depth;

    Pair(int val , int depth){
        this.val = val;
        this.depth = depth;
    }
}

class Solution {

     public void dfs(TreeNode root , int col , TreeMap<Integer,List<Pair>> mp , int current_depth){
        
        if(root == null) return ;
        
        
        if(!mp.containsKey(col)){
            List<Pair> list = new ArrayList<>();
            list.add(new Pair(root.val,current_depth));
            mp.put(col,list);
        }
        else{
            List<Pair> list = mp.get(col);
            list.add(new Pair(root.val,current_depth));
            mp.put(col,list);
        }

        dfs(root.left,col-1,mp,current_depth+1);
        dfs(root.right,col+1,mp,current_depth+1);
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
        List<List<Integer>> ans = new ArrayList<>();

        TreeMap<Integer,List<Pair>> mp = new TreeMap<>();  
        
        dfs(root,0,mp,0);

        for(var col : mp.keySet()){
            List<Pair> entry = mp.get(col);

            entry.sort((a,b)->{
                if(a.depth != b.depth){
                    return Integer.compare(a.depth,b.depth);
                }
                return Integer.compare(a.val,b.val);
            });

            List<Integer> list = new ArrayList<>();

            for(var vals : entry){
                list.add(vals.val);
            }

            
            ans.add(list);
        }

        return ans;
    }
}