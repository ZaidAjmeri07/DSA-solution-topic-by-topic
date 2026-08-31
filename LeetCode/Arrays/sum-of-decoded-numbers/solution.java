class Solution {
    public long mod = 1_000_000_007L;

    public long power(long x , long y){

        if(y == 1){
            return x % mod;
        }

        if(x == 0){
            return 1;
        }

        long half = power(x,y/2) % mod;
        long halfsq = ((half %mod) * (half % mod)) % mod;

        if(y%2 != 0){
            halfsq = ((halfsq%mod)*(x % mod)) % mod;
        }
        
        return halfsq%mod;
    }
    
    public int sumDecoded(long[] nums) {

        int n = nums.length;

        long sum = 0;

        for(int i = 0 ; i < n ; i++){

            long wi = nums[i]%10;
            long di = nums[i]/10;

            String s = ""+di;

            String xstr = s.substring(0,(int)wi);
            String ystr = s.substring((int)wi);

            long xi = 0;

            for(int j = 0 ; j < xstr.length() ; j++){
                long x = xstr.charAt(j) - '0';
                xi = (xi*10)+x;
            }

            long yi = 0;

            for(int j = 0 ; j < ystr.length() ; j++){
                long y = ystr.charAt(j) - '0';
                yi = (yi*10)+y;
            }

            long pint = power(xi,yi);
                    
            sum = (sum%mod + pint%mod)%mod;
        }
        
        return (int)sum;
    }
}