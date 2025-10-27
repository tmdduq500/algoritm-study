class Solution {
    public long solution(String numbers) {
        long answer = 0;
        
         String answerStr = "";
        String[] numberStrArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        int[] numberArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        String temp = "";
        for (int i = 0; i < numbers.length(); i++) {
            temp += numbers.charAt(i);
            for (int j = 0; j < numberStrArr.length; j++) {
                if(temp.equals(numberStrArr[j])){
                    answerStr += numberArr[j];
                    temp = "";
                }
            }
        }

        answer = Long.parseLong(answerStr);
        return answer;
    }
}