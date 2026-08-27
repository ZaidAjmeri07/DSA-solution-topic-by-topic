class Solution {
    public String minWindow(String s, String t) {
        
        int m = s.length();
        int n = t.length();

        int start = 0;

        int frqt[] = new int[256];

        for(int i = 0 ; i < n ; i++){
            char ch = t.charAt(i);
            frqt[ch]++;
        }

        int left = 0;
        int right = 0;
        int i = 0;

        int req = n;
        int min_len = Integer.MAX_VALUE;


        while(right < m){

            if(frqt[s.charAt(right)] > 0){
                req--; 
            }

            frqt[s.charAt(right)]--;

            if(req == 0){
                while(req == 0){
                    
                    frqt[s.charAt(left)]++;

                    if(frqt[s.charAt(left)] > 0){
                        req++;

                        // System.out.println("right-left+1 : " + (right-left+1));
                        // System.out.println("len : " );

                        if(right-left+1 < min_len){
                            min_len = right-left+1;
                            start = left;
                        }

                    }

                    left++;
                }
            }

            right++;
        }

        // System.out.println(start);
        // System.out.println(start+min_len);

        
        return (min_len != Integer.MAX_VALUE)?s.substring(start,start+min_len):"";
    }
}