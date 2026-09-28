/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    
    public void dfs(Node root, int level, ArrayList<Integer>ans){

            if(root == null){
                return ;
            }

            if(ans.size() == level){
                ans.add(root.data);
            }

            dfs(root.right,level+1,ans);
            dfs(root.left,level+1,ans);
        }
    
    public ArrayList<Integer> rightView(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();

        dfs(root,0,ans);
               
         return ans;
    }
}