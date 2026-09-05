class Solution {

    public int recurse(int n,ArrayList<Integer> dp){

        if(n == 2){
            return 1;
        }

        if(n <= 1){

            return n;
        }

        if(dp.get(n) != -1){
            return dp.get(n);
        }

        int res = recurse(n-1,dp) + recurse(n-2,dp) + recurse(n-3,dp);
        dp.set(n,res);

        return res;
    }

    public int tribonacci(int n) {
        
        ArrayList<Integer> dp = new ArrayList<>(Collections.nCopies(n+1,-1));

       int ans = recurse(n,dp);

        return ans;
    }
}