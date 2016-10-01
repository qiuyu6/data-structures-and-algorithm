public class Solution {
    public int countPrimes(int n) {
        if(n <= 1) return 0;
        
        boolean[] isPrime = new boolean[n];
        for(int i = 2; i < n; i++){
            isPrime[i] = true;
        }
        for(int i = 2; i*i < n; i++){
            for(int j = 2; j * j <= i; j++){
                if(i % j == 0){
                    isPrime[i] = false;
                    
                }
            }
            int k = i;
            if(isPrime[i]){
                while(k * i < n){
                    isPrime[k*i] = false;
                    k++;
                }
            }
        }
        int count = 0;
        for(int i = 2; i < n; i++){
            if(isPrime[i]) count++;
        }
        return count;
    }
}