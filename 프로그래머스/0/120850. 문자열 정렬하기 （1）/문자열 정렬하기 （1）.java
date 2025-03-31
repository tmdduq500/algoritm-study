import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        List<String> answerList = new ArrayList<>();
        char[] charArray = my_string.toCharArray();
        for (char c : charArray) {
            if( c>=48 && c<=57) {
                answerList.add(String.valueOf(c));
            }
        }
        answer = new int[answerList.size()];
        String[] split = answerList.stream().sorted().collect(Collectors.joining()).split("");
        for (int i = 0; i < split.length; i++) {
            answer[i] = Integer.parseInt(split[i]);
        }
        return answer;
    }
}