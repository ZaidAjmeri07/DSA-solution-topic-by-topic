class Solution {
    public int findElement(int[] arr) {
        // code here
        
        int n = arr.length;
        
        int ans = -1;
        
        int left_max[] = new int[n];
        
        int right_min[] = new int[n];
        
        int max_val = arr[0];
        
        
        left_max[0] = arr[0];
        for(int i = 1 ; i < n-1 ; i++){
            
            if(arr[i] > max_val){
                max_val = arr[i];
            }
            
            left_max[i] = max_val;
            
        }
        
        int min_val = arr[n-1];
        
        right_min[n-1] = arr[n-1];
        
        for(int i = n-2 ; i >= 0 ; i--){
             if(arr[i] < min_val){
                min_val = arr[i];
            }
            
            right_min[i] = min_val;
        }
        
        for(int i = 1 ; i < n-1 ; i++){
            
            if(arr[i] >= left_max[i] && arr[i] <= right_min[i]){
                ans = arr[i];
            }
            
        }
        
        
        return ans;
    }
}