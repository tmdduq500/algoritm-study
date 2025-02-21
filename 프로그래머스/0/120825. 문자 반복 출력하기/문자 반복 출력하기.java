import java.util.*;

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        String[] split = my_string.split("");
        List<String> mergeList = new ArrayList<>();
        for (String s : split) {
            for (int i = 0; i < n; i++) {
                mergeList.add(s);
            }
        }
        answer = String.join("", mergeList);
        
        return answer;
    }
}