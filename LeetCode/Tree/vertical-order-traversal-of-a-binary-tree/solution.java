/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
} */

class Pair{
    int val;
    int depth;
    
    Pair(int val , int depth){
        this.val = val;
        this.depth = depth;
    }
    
}

class Solution {
    
    public void dfs(Node root , int col , TreeMap<Integer,Pair> mp , int current_depth){
        
        if(root == null) return ;
        
        
        if(!mp.containsKey(col)){
            mp.put(col,new Pair(root.data,current_depth));
        }
        else{
            
            Pair entry = mp.get(col);
            int val = entry.val;
            int depth = entry.depth;
            
            if(depth > current_depth){
                mp.put(col,new Pair(root.data,current_depth));
            }
            
        }
        
        dfs(root.left,col-1,mp,current_depth+1);
        dfs(root.right,col+1,mp,current_depth+1);
    }
    
    
    public ArrayList<Integer> topView(Node root) {
        // code here
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        TreeMap<Integer,Pair> mp = new TreeMap<>();  
        
       dfs(root,0,mp,0);
       
       for(var col : mp.keySet()){
          
           Pair entry = mp.get(col);
           
           ans.add(entry.val);
       }
        
        return ans;
    }
}