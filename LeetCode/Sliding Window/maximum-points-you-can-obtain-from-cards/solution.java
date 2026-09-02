class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int n = cardPoints.length;

        int maxScore = 0;

        int left = -1;
        int right = 0;

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < k; i++) {
            left++;
            leftSum += cardPoints[i];
        }
        

        while(right <= k){

            maxScore = Math.max(maxScore,leftSum + rightSum);

            if (left >= 0) leftSum -= cardPoints[left];

            if(n-right-1 >= 0)rightSum += cardPoints[n-right-1]; 
            
            left--;
            right++;
        }


        return maxScore;
    }
}