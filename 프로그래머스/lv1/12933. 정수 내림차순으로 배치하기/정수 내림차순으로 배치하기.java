class Solution {
    public long solution(long n) {
        String str = Long.toString(n);
        int len = str.length();
        
        int[] digits =new int[len];
        for (int i = 0; i < len; i++){
            digits[i] = str.charAt(i) - '0';
        }
        
        int temp=0;
        for(int i=0; i<len; i++){
            for(int j=i+1; j<len; j++){
                if(digits[i]<digits[j]){
                    temp=digits[i];
                    digits[i]=digits[j];
                    digits[j]=temp;
                }
            }
        }
        long num = 0;
        for (long digit : digits) {
            num *= 10;
            num += digit;
        }
        
        return num;
        
        
    }
}