class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] split = my_string.split(" ");
        answer = Integer.parseInt(split[0]);
        for (int i = 1; i < split.length - 1; i++) {
            switch (split[i]) {
                case "+":
                    i++;
                    answer = answer + Integer.parseInt(split[i]);
                    break;
                case "-":
                    i++;
                    answer = answer - Integer.parseInt(split[i]);
                    break;
            }
        }
        return answer;
    }
}