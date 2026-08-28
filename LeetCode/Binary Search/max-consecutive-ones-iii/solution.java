class Solution {

    public boolean canMake(int []nums , int mid , int k){

        int n = nums.length;

        int right = 0;
        int left = 0;

        int kcp = k;

        for(int i = 0 ; i < mid ; i++){
            if(nums[i] == 0){
                kcp--;
            }
        }

        if(kcp >= 0) return true;

        for(int i = mid ; i < n ; i++){

            if(nums[i-mid] == 0){
                kcp++;
            }

            if(nums[i] == 0){
                kcp--;
            }

            if(kcp >= 0) return true;
        }

        
        return false;
    }

    public int longestOnes(int[] nums, int k) {

        int n = nums.length;
        int maxLen = 0;
        int kcp = k;

        int low = 0;
        int high = n;

        while(low <= high){
            
            int mid = low + (high - low)/2;

            if(canMake(nums,mid,k)){
                maxLen = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }

        }
       
        return maxLen;
    }
}