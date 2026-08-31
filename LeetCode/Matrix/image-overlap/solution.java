class Solution {

    public int match(int[][] img1 , int[][] img2, int rowoffset , int coloffset){
        
        int n = img1.length;

        int cnt = 0;

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                
                int B_i = i+rowoffset;
                int B_j = j+coloffset;

                 if(B_i < 0 || B_j < 0 || B_i >= n || B_j >= n){
                    continue;
                }

                if(img1[i][j] == 1 && img2[B_i][B_j] == 1){
                    cnt++;
                }
            }
        }

        return cnt;
    }

    public int largestOverlap(int[][] img1, int[][] img2) {
        
        int n = img1.length;

        int cnt = 0;

        for(int i = -1*n+1 ; i <= n-1 ; i++){
            for(int j = -1*n+1 ; j <= n-1 ; j++){

                int m = match(img1,img2,i,j);
                cnt = Math.max(m,cnt);   
            }
        }

        return cnt;
    }
}