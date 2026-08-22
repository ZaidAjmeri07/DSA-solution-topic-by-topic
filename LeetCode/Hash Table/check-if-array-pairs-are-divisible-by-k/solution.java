class Solution {
    public boolean canArrange(int[] arr, int k) {
        
        HashMap<Integer,Integer> mp = new HashMap<>();

        int n = arr.length;

        for(int val : arr){
            int rem = ((val%k)+k)%k;
            mp.put(rem,mp.getOrDefault(rem,0)+1);
        }

        for(var itr : mp.entrySet()){

            int key = itr.getKey();
            int val = itr.getValue();

            // System.out.println(key + " : " + val);

            if(key == 0 && (val)%2 != 0){
                // System.out.println("0 was responseble");
                return false;
            }

            if(key == 0 && (val)%2 == 0) continue;

            int comp = mp.getOrDefault(k - key,-1);

            if(comp == -1 || comp != val){
                // System.out.println("comp was responseble " + comp);
                return false;
            }

        }

        return true;
    }
}