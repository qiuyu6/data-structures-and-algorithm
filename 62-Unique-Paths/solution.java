public class Solution {
    public int uniquePaths(int m, int n) {
        if(m == 0 && n == 0) return 0;
        if(m == 1 && n == 1) return 1;
        if(m == 1 && n != 1) return 1;
        if(n == 1 && m != 1) return 1;
        int [][] path = new int[m][n];
        
        for(int i = 0; i < n; i++){
            path[0][i] = 1;
        }
        for(int i = 1; i < m; i++){
            path[i][0] = 1;
        }
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                path[j][i] = path[j][i-1] + path[j-1][i];
            }
        }
        return path[m-1][n-1];
    }
}