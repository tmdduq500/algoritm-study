class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int i : array) {
            String[] split = String.valueOf(i).split("");
            for (String s : split) {
                if (s.equals("7")) {
                    answer++;
                }
            }
        }
        return answer;
    }
}