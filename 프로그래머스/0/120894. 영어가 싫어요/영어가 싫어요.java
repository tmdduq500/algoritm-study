class Solution {
    public long solution(String numbers) {
        long answer = 0;
        
        String[] numberStrArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < numberStrArr.length; i++) {
            numbers = numbers.replaceAll(numberStrArr[i], String.valueOf(i));
        }

        answer = Long.parseLong(numbers);
        return answer;
    }
}