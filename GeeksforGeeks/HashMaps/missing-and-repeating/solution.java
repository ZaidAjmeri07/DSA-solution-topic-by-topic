class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        
        HashMap<Integer,Integer> mp = new HashMap<>();
        
        int dup = -1;
        int mis = -1;
        
        for(int i = 1 ; i <= arr.length ; i++){
            mp.put(i,0);
        }
        
        for(int val : arr){
            mp.put(val,mp.getOrDefault(val,0)+1);
        }
        
        for(var itr : mp.entrySet()){
            
            if(itr.getValue() == 2) dup = itr.getKey();
            
            if(itr.getValue() == 0) mis = itr.getKey();
            
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(dup);
        ans.add(mis);
        
        return ans;
    }
}