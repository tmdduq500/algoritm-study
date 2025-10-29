import java.util.Arrays;
class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        array = Arrays.stream(array).sorted().toArray();
        for (int i : array) {
            if(i > height) {
                answer++;
            }
        }
        return answer;
    }
}