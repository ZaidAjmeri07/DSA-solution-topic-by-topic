class Solution {

    public int numberOfSubstrings(String s) {
        
        int n = s.length();

        int count = 0;

        int right = 0;
        int left = 0;

        HashMap<Character,Integer> mp = new HashMap<>();

        while(right < n){
            
            char ch = s.charAt(right);
            mp.put(ch,mp.getOrDefault(ch,0)+1);

            while(mp.size() == 3){
                
                count += (n-right);
                mp.put(s.charAt(left),mp.get(s.charAt(left))-1);

                if(mp.get(s.charAt(left)) == 0){
                    mp.remove(s.charAt(left));
                }
                
                left++;
            }

            right++;
        }

        return count;
    }
}