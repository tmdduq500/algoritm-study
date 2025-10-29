import java.util.Arrays;
import java.util.stream.Collectors;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String lowerCase = my_string.toLowerCase();
        answer = Arrays.stream(lowerCase.split("")).sorted().collect(Collectors.joining());
        return answer;
    }
}