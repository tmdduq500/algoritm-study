import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        List<Integer> answerList = new ArrayList<>();
        for (int i : numlist) {
            if (i % n == 0) {
                answerList.add(i);
            }
        }
        
        answer = answerList.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}