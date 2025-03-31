import java.util.Arrays;
import java.util.List;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        List<String> aeiou = Arrays.asList("a", "e", "i", "o", "u");

        String[] myStringArray = my_string.split("");

        for (String s : myStringArray) {
            if (!aeiou.contains(s)) {
                answer += s;

            }
        }

        return answer;
    }
}