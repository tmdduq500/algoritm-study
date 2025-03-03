import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] copy = emergency.clone();

        int rank = emergency.length;

        while (rank > 0) {
            int min = Arrays.stream(copy).min().getAsInt();
            for (int i = 0; i < copy.length; i++) {
                if (copy[i] == min) {
                    answer[i] = rank;
                    copy[i] = Integer.MAX_VALUE;
                    rank--;
                }
            }
        }
        return answer;
    }
}