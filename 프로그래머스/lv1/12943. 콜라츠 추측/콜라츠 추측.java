class Solution {
    public int t=0;
    public int Cal(long n){
        if(t>500){
            return -1;
        }
        else if(n==1){
            return t;
        }
        else if(n%2==0){
            t++;
            return Cal(n/2);
        }
        else{
            t++;
            return Cal((n*3)+1);
        }
        
    }
    
    public int solution(int num) {
        return Cal(num);
    }
}