class Solution {
    public String solution(String s, int n) {
        String answer = "";

        char[] charArr = s.toCharArray();

        for(char c : charArr) {
            if (c == ' ') {
                answer += " ";
            } else {
                if (c <= 90) {
                    c += n;
                    if (c > 90) {
                        c -= 26;
                    }
                } else {
                    c += n;
                    if (c > 122) {
                        c -= 26;
                    }
                }
                answer += c;
            }
        }

        return answer;
    }
}