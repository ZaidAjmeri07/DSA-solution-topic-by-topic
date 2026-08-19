class Solution{
    public int numberOfBeams(String[] bank) {
        
        int laser = 0;
        int prev = 0;

        for(String lasers : bank){

            int curr = 0;

            for(char ch : lasers.toCharArray()){
                if(ch == '1'){
                    curr+=1;
                }
            }

            if(curr == 0){
                prev = prev;
                continue;
            }

            laser += (prev*curr);
            prev = curr;
        }

        return laser;
    }
}