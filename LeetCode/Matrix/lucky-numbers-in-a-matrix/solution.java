class Solution {
    public List<Integer> luckyNumbers(int[][] matrix){

        
        int m = matrix.length;
        int n = matrix[0].length;

        int rowminmax = Integer.MIN_VALUE;
        int colmaxmin = Integer.MAX_VALUE;

        for(int i = 0 ; i < m ; i++){

            int minval = Integer.MAX_VALUE;
            
            for(int j = 0 ; j < n ; j++){
                minval = Math.min(minval,matrix[i][j]);
            }

            rowminmax = Math.max(minval,rowminmax);
        }

        for(int j = 0 ; j < n ; j++){

            int maxval = Integer.MIN_VALUE;
            
            for(int i = 0 ; i < m ; i++){
                maxval = Math.max(maxval,matrix[i][j]);
            }
            colmaxmin = Math.min(maxval,colmaxmin);
        }

        List<Integer> ans = new ArrayList<>();

        if(rowminmax == colmaxmin) ans.add(rowminmax);

        return ans;
    }
}