import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 1; i <= n; i++) {
            if(n % i == 0) {
                set.add(i);
            }
        }

        answer = new int[set.size()];
        set.stream().sorted(Integer::compareTo);
        int index = 0;
        for (Integer i : set) {
            answer[index] = i;
            index++;
        }
        return answer;
    }
}