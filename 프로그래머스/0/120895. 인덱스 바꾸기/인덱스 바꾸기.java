class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        String[] myStringArr = my_string.split("");
        String temp = myStringArr[num1];
        myStringArr[num1] = myStringArr[num2];
        myStringArr[num2] = temp;

        for (String s : myStringArr) {
            answer += s;
        }

        return answer;
    }
}