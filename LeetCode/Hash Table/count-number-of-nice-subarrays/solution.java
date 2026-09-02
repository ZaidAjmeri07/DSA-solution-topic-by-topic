class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        int n = nums.length;

        HashMap<Integer,Integer> mp = new HashMap<>();

        int cnt = 0;
        int sum = 0;

        int oddcount = 0;

        mp.put(0,1);
        
        for(int i = 0 ; i < n ; i++){

            if(nums[i] % 2 != 0){
                oddcount++;
            }

            if(mp.containsKey(oddcount - k)){
                cnt += mp.get(oddcount - k);
            }


            mp.put(oddcount,mp.getOrDefault(oddcount,0)+1);
        }


        return cnt;
    }
}