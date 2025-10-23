import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";

        String[] splitString = my_string.split("");
        Set<String> answerSet = new LinkedHashSet<>();
        for (String s : splitString) {
            answerSet.add(s);
        }

        for (String s : answerSet) {
            answer += s;
        }
        return answer;
    }
}