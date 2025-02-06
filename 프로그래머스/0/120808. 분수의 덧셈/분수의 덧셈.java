class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        
        int denom3 = denom1 * denom2;
        int numer3 = numer1 * denom2 + numer2 * denom1;
        
        int gcd = getGCD(denom3, numer3);
        
        answer = new int[2];
        answer[0] = numer3/gcd;
        answer[1] = denom3/gcd;
        
        return answer;
    }
    
    public int getGCD(int num1, int num2) {
    if (num1 % num2 == 0) {
        return num2;
    }
    return getGCD(num2, num1%num2);
}
}
