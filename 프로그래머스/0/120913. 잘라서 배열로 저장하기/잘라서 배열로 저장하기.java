import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        List<String> myStrList = new ArrayList<>();
        while (true) {
            myStrList.add(my_str.substring(0, n));
            my_str = my_str.substring(n);
            if (my_str.equals("")) {
                break;
            }
            if (my_str.length() < n) {
                myStrList.add(my_str);
                break;
            }
        }

        answer = new String[myStrList.size()];
        for (int i = 0; i < myStrList.size(); i++) {
            answer[i] = myStrList.get(i);
        }
        return answer;
    }
}