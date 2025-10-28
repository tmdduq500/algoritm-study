class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String[] split = String.valueOf(num).split("");
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals(String.valueOf(k)) && answer == 0) {
                answer = i + 1;
            }
        }
        if (answer == 0) {
            answer = -1;
        }
        return answer;
    }
}