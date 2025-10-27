import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        List<Integer> differList = new ArrayList<Integer>();
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            differList.add(Math.abs(n - array[i]));
        }
        
        Integer minDiffer = differList.stream().min(Integer::compareTo).get();
        int minIndex = differList.indexOf(minDiffer);
        answer = array[minIndex];
        
        return answer;
    }
}