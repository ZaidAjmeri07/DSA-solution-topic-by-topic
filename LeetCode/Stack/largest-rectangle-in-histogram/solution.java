class Solution {


    public int[] nsl(int []arr){

        int n = arr.length;

        Stack<Integer> st = new Stack<>();

        int ans[] = new int[n];

        for(int i = 0 ; i < n ; i++){

            if(st.isEmpty()){
                ans[i] = -1;
                st.push(i);
            }
            else{
                if(!st.isEmpty() && arr[i] < arr[st.peek()]){
                    while(!st.isEmpty() && arr[i] < arr[st.peek()]){
                        st.pop();
                    }
                }

                if(st.isEmpty()){
                    ans[i] = -1;
                    st.push(i);
                }
                else{
                    ans[i] = st.peek();
                    st.push(i);
                }

            }

        }

        
        return ans;
    }

    public int[] nsr (int []arr){

        int n = arr.length;

        Stack<Integer> st = new Stack<>();

        int ans[] = new int[n];

        for(int i = n-1 ; i >= 0 ; i--){

            if(st.isEmpty()){
                ans[i] = n;
                st.push(i);
            }
            else{
                if(!st.isEmpty() && arr[i] <= arr[st.peek()]){
                    while(!st.isEmpty() && arr[i] <= arr[st.peek()]){
                        st.pop();
                    }
                }

                if(st.isEmpty()){
                    ans[i] = n;
                    st.push(i);
                }
                else{
                    ans[i] = st.peek();
                    st.push(i);
                }
            }

        }

        return ans;
    }

    public int largestRectangleArea(int[] heights) {

        int n = heights.length;

        int maxa = -1;

        int nsel[] = nsl(heights);
        int nser[] = nsr(heights);

        for(int i = 0 ; i < n ; i++){

            int left = i - nsel[i];
            int right = nser[i] - i;

            int width = (left + right -1);

            int a = width * heights[i];

            maxa = Math.max(maxa,a);
        }   
        
        return maxa;
    }
}