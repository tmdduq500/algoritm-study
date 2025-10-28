class Solution {
    public int solution(String message) {
        int answer = 0;
        String[] msgArr = message.split("");
        answer = 2 * msgArr.length;
        return answer;
    }
}