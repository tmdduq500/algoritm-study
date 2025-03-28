class Solution {
    public int solution(int n) {
       int answer = 1;

        while (true) {
            if (factorial(answer) > n) {
                answer--;
                break;
            } else if (factorial(answer) == n) {
                break;
            } else {
                answer++;
            }
        }

        return answer;
    }

    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}