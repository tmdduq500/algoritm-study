class Solution {
    public String solution(String letter) {
        String answer = "";

        String[] mosArr = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        String[] letterArr = letter.split(" ");

        for (String letterStr : letterArr) {
            for (int i = 0; i < mosArr.length; i++) {
                if (letterStr.equals(mosArr[i])) {
                    char alphbet = (char) (97 + i);
                    answer += alphbet;
                }
            }
        }
        return answer;
    }
}