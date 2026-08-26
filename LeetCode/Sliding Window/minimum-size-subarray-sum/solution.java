class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int min_len = Integer.MAX_VALUE; 

        int n = nums.length;

        int left = 0;
        int right = 0;

        int sum = 0;

        while(right < n){
            sum += nums[right];

            if(sum < target){
                right++;
            }
            else{


                while(left <= right && sum >= target){
                    min_len = Math.min(min_len,right - left + 1);
                    sum -= nums[left];
                    left++;
                }
                right++;
            }

        }


        if(min_len == Integer.MAX_VALUE) return 0;

        return min_len;
    }
}