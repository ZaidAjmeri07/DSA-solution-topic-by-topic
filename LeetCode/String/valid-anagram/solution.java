class Solution {
    public boolean isAnagram(String s, String t) {

        int n1 = s.length();
        int n2 = t.length();

        int frq1[] = new int[26];
        int frq2[] = new int[26];

        for(int i = 0 ;  i < n1 ; i++){
            char chs = s.charAt(i);
            frq1[chs - 'a']++;
        }

        for(int i = 0 ;  i < n2 ; i++){
            char cht = t.charAt(i);
            frq2[cht - 'a']++;
        }

        for(int i = 0 ; i < 26 ; i++){
            
            if(frq1[i] != frq2[i]){
                return false;
            }

        }
        
        return true;
    }
}