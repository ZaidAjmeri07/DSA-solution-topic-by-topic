class Solution {

    public int[] findBall(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int a[] = new int[m];

        for(int j = 0 ; j < m ; j++){
            
            int row = 0;
            int col = j;

            while(row < n){

                // System.out.println("grid[" + row + "]" + "["+ col +"] = " + grid[row][col]);

                if(grid[row][col] == 1){

                     if(col+1 >= m){
                        col = -1;
                        break;
                    }
                    
                    if(grid[row][col+1] == -1){
                        col = -1;
                        break;
                    }

                    // System.out.println("1 : grid[" + row + "]" + "["+ col +"] = " + grid[row][col]);
                    row+=1;
                    // System.out.println("row got incr : "+ row);
                    col+=1;
                    // System.out.println("col got incr : "+ col);
                }

                else if(grid[row][col] == -1){
                    
                    if(col-1 < 0){
                        col = -1;
                        break;
                    }

                    if(grid[row][col-1] == 1){
                        col = -1;
                        break;
                    }

                    // System.out.println("-1 : grid[" + row + "]" + "["+ col +"] = " + grid[row][col]);
                    row+=1;
                    // System.out.println("row got incr : "+ row);
                    col-=1;
                    // System.out.println("col got dcr : "+ col);
                }

            }
            
            a[j] = col;

            // System.out.println("I am passing a[" + j + "] : " + col);

        }

        return a;
    }
}