import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        Map<Character, Integer> map = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        answer = map.entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(e -> String.valueOf(e.getKey()))
                .sorted()
                .collect(Collectors.joining());
        
        return answer;
    }
}