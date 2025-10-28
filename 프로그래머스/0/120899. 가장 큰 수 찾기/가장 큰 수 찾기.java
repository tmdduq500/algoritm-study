import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];

        int max = Arrays.stream(array).max().getAsInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                answer[0] = max;
                answer[1] = i;
            }
        }
        return answer;
    }
}