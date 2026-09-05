class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        
        int ans[] = {-1,-1};

        int m = mat.length;
        int n = mat[0].length;

        for(int i = 0 ; i < m ; i++){
            int count1 = 0;
            for(int j = 0 ; j < n ; j++){
                count1+= mat[i][j];
            }

            if(count1 > ans[1]){
                ans[0] = i;
                ans[1] = count1;
            }

        }

        return ans;
    }
}