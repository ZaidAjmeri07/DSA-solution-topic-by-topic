class Solution {
    public int countSpecialIntegers(int[] nums) {

        HashMap<Integer,Integer> left = new HashMap<>();
        HashMap<Integer,Integer> right = new HashMap<>();
        HashMap<Integer,Integer> frq = new HashMap<>();

        int n = nums.length;
        int cnt = 0;

        for(int i = 0 ; i < n ; i++){
            if(!left.containsKey(nums[i])){
                left.put(nums[i],i);
            }
            right.put(nums[i],i);
            frq.put(nums[i],frq.getOrDefault(nums[i],0)+1);
        }

        for(var key : left.keySet()){

            int l = left.get(key);
            int r = right.get(key);

            int f = frq.get(key);

            if(r-l+1 == f){
                cnt++;
            }
        }

        return cnt;
    }
}