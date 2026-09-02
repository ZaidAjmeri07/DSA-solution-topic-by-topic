class Solution {

    public int totalSubarray(int []nums , int k){

        int n = nums.length;

        int left = 0;
        int right = 0;

        HashMap<Integer,Integer> mp = new HashMap<>();

        int count = 0;

        while(right < n){

            mp.put(nums[right] , mp.getOrDefault(nums[right],0)+1);

            while(mp.size() > k){
                
                mp.put(nums[left],mp.get(nums[left]) - 1);

                if(mp.get(nums[left]) == 0){
                    mp.remove(nums[left]);
                }

                left++;
            }

            count += (right - left + 1);

            right++;
        }

        return count;
    }

    public int subarraysWithKDistinct(int[] nums, int k) {
        
        int n = nums.length;

        return totalSubarray(nums,k) - totalSubarray(nums,k-1);
    }
}