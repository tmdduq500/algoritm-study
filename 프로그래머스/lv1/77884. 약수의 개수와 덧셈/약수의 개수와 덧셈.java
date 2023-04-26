class Solution {
    public int solution(int left, int right) {
        int num;
        int sum=0;
        
        for(int j=left; j<=right; j++){
            num=0;
            for(int i=1; i<=j; i++){
                if(j%i==0){
                    num+=1;
                }
            }
            if(num%2!=0){
                sum=sum-j;
            }
            else{
                sum+=j;
            }        
        }
        return sum;
    }
}