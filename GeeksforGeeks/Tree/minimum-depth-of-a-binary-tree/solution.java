/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    int minDepth(Node root) {
        // code here
        
        if(root == null) return 0;
        
        if(root.left != null && root.right != null)
            return 1+Math.min(minDepth(root.left),minDepth(root.right));
            
        if(root.left == null && root.right != null){
            return 1+Math.min(minDepth(root.right) , Integer.MAX_VALUE);
        }
        
        if(root.left != null && root.right == null){
            return 1+Math.min(minDepth(root.left) , Integer.MAX_VALUE);
        }
        
         return 1+Math.min(minDepth(root.left),minDepth(root.right));
    }
}