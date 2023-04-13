class Solution {
    public long solution(long n) {
        long answer = 0;
        long num = 0;
        
        for(long i=1; i<=n; i++){
            if(i*i==n){
                num=i;
                return answer=(num+1)*(num+1);
            }   
        }
        return -1;
    }
}