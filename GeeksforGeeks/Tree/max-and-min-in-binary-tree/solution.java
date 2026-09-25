/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}*/

class Solution {
    public static int findMax(Node root) {
        // code here
        
        if(root == null) return Integer.MIN_VALUE;
        
        int left = findMax(root.left);
        int right = findMax(root.right);
        
        
        return Math.max(left,Math.max(right,root.data));
    }

    public static int findMin(Node root) {
        // code here
        
        if(root == null) return Integer.MAX_VALUE;
        
        int left = findMin(root.left);
        int right = findMin(root.right);
        
        
        return Math.min(left,Math.min(right,root.data));
        
    }
}