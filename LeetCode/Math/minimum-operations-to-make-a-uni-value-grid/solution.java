class Solution {
    public int minOperations(int[][] grid, int x) {

        int ans = 0;

        int m = grid.length;
        int n = grid[0].length;

        int arr[] = new int[m*n];

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                arr[i*n + j] = grid[i][j];
            }
        }

        Arrays.sort(arr);

        int len = arr.length;

        int target = arr[len/2];

        for(int i = 0 ; i < len ; i++){

            if(target%x != arr[i]%x) return -1;

            ans += Math.abs((target - arr[i]))/x;

        }

        return ans;
    }
}