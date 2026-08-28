class Solution {
    public int longestOnes(int[] nums, int k) {

        int n = nums.length;

        int left = 0;
        int right = 0;

        int maxLen = 0;

        int kcp = k;

        while(right < n){

            if(nums[right] == 0){
                kcp--;
            }

            if(kcp < 0){

                while(kcp < 0){
                    if(nums[left] == 0) kcp++;
                    left++;
                }
            }

            
            maxLen = Math.max(maxLen,(right - left + 1));

            right++;
        }
        
        return maxLen;
    }
}