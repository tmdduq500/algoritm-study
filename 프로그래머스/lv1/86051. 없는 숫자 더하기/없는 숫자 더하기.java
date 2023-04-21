class Solution {
    public int solution(int[] numbers) {
        int len = numbers.length;
        int sum=0;
        for(int i=0; i<len; i++){
            sum+=numbers[i];
        }
        return 45-sum;
    }
}