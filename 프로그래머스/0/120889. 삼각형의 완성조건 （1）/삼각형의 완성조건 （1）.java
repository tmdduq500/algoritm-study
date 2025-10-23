import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Arrays.stream(sides).max().getAsInt();
        int sum = Arrays.stream(sides).sum();

        answer = sum - max > max ? 1 : 2;
        return answer;
    }
}