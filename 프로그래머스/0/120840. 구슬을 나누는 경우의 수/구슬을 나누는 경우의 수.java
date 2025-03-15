import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        int answer = 0;

        BigInteger up = factorial(balls);
        BigInteger down1 = factorial(balls - share);
        BigInteger down2 = factorial(share);

        BigInteger bigAnswer = up.divide(down1.multiply(down2));
        answer = bigAnswer.intValue();
        
        return answer;
    }
    
    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}