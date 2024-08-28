class Solution {
    public String solution(String s) {
        String answer = "";

        String[] strList = s.split("", -1);

        int index = 0;
        for(String str : strList) {
            if(str.equals(" ")) {
                index = 0;
                answer += " ";
                continue;
            }
            index += 1;

            if(index % 2 == 0) {
                answer += str.toLowerCase();
            } else {
                answer += str.toUpperCase();
            }
        }
        return answer;
    }
}