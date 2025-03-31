import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


class Solution {
    public int solution(String my_string) {
        int answer = 0;
        List<String> answerList = new ArrayList<>();
        char[] charArray = my_string.toCharArray();
        for (char c : charArray) {
            if (c >= 48 && c <= 57) {
                answerList.add(String.valueOf(c));
            }
        }
        String[] split = answerList.stream().sorted().collect(Collectors.joining()).split("");
        for (String s : split) {
            answer += Integer.parseInt(s);
        }
        return answer;
    }
}