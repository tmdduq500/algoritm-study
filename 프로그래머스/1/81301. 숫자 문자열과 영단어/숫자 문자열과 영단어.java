import java.util.*;

class Solution {
    public int solution(String s) {
        Map<String, Integer> dic = new HashMap<String, Integer>() {{

            put("zero", 0);
            put("one", 1);
            put("two", 2);
            put("three", 3);
            put("four", 4);
            put("five", 5);
            put("six", 6);
            put("seven", 7);
            put("eight", 8);
            put("nine", 9);
        }};

        for (String str : dic.keySet()) {
            if(s.contains(str)) {
                s = s.replace(str, String.valueOf(dic.get(str)));
            }
        }
        
        return Integer.parseInt(s);
    }
}