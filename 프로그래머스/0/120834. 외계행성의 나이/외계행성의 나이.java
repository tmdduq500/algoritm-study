class Solution {
    public String solution(int age) {
        String answer = "";
        
        String[] ageArr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        int fourth = age / 1000;
        int third = age / 100 < 10 ? age / 100 : age % 100;
        int second = (age % 100) / 10;
        int first = age % 10;

        if (fourth != 0) {
            answer = ageArr[fourth] + ageArr[third] + ageArr[second] + ageArr[first];
            return answer;
        }
        if (third != 0) {
            answer = ageArr[third] + ageArr[second] + ageArr[first];
            return answer;
        }
        if (second != 0) {
            answer = ageArr[second] + ageArr[first];
            return answer;
        } else {
            answer = ageArr[first];
            return answer;
        }
    }
}