import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};

        Set<Integer> answerSet = new LinkedHashSet<Integer>();

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                answerSet.add(i);
                n = n / i;
            }
        }

        int size = answerSet.size();
        answer = new int[size];
        
        int index = 0;
        for (int num : answerSet) {
            answer[index++] = num;
        }
        return answer;
    }
}