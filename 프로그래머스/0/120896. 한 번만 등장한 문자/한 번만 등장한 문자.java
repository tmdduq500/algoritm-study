import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        List<String> sb = new ArrayList<>();
        List<String> distinctStr = Arrays.stream(s.split("")).distinct().collect(Collectors.toList());
        for (String string : distinctStr) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (string.equals(String.valueOf(s.charAt(i)))) {
                    count++;
                }
            }
            if (count == 1) {
                sb.add(string);
            }
        }
        sb.sort(String::compareTo);
        answer = String.join("", sb);
        return answer;
    }
}