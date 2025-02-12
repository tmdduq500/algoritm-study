class Solution {
    public int solution(int n) {
        int answer = 1;
        int pizzaSlice = 6;
        while (true) {
            if ((pizzaSlice * answer) % n == 0) {
                break;
            } else {
                answer++;
            }
        }
        return answer;
    }
}