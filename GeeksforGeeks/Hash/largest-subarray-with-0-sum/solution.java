class Solution {
    int maxLength(int arr[]) {
        
        HashMap<Integer,Integer> mp = new HashMap<>();
        int n = arr.length;
        
        int max_len = 0;
        
        int sum = 0;
        
        
        
        for(int i = 0 ; i < n ; i++){
            
            sum += arr[i];
            
            int len = 0;
            
            if(sum == 0){
                max_len = Math.max(max_len,i+1);
            }
            
            if(mp.containsKey(sum)){
                len = i - mp.get(sum); 
                
                max_len = Math.max(len,max_len);
                
            }
            else{
                mp.put(sum,i);
            }
        }
        
        return max_len;
    }
}