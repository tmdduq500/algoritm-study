class Solution {
    public long solution(int price, int money, int count) {
        long sum=0;
        for(int i=1; i<=count; i++){
            sum=sum+price*i;
        }
        if((money-sum)<0){
            return sum-money;
        }
        else
            return 0;
    }
}