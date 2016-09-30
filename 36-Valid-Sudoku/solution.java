public class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i = 0; i < 9; i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    int temp = board[i][j]-'0';
                    if(!set.add(temp)) return false;
                }
            }
        }
        for(int i = 0; i < 9; i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j = 0; j < 9; j++){
                if(board[j][i] != '.'){
                    int temp = board[j][i]-'0';
                    if(temp > 9 || temp <0) return false;
                    if(!set.add(temp)) return false;
                }
            }
        }
        for(int i = 0; i < 9; i = i+3){
            for(int j = 0; j < 9; j = j+3){
                HashSet<Integer> set = new HashSet<>();
                for(int k = 0; k < 3; k++){
                    if(board[i+k][j] != '.'){
                        int a = board[i+k][j] - '0';
                        if(a > 9 || a < 0 || !set.add(a)) return false;
                    } 
                    if(board[i+k][j+1] != '.'){
                        int b = board[i+k][j+1] - '0';
                        if(b > 9 || b < 0 || !set.add(b)) return false;
                    } 
                    if(board[i+k][j+2] != '.'){
                        int c = board[i+k][j+2] - '0';
                        if(c > 9 || c < 0 || !set.add(c)) return false;
                    } 
                    
                    
                    
                }
            }
        }
        return true;
    }
}