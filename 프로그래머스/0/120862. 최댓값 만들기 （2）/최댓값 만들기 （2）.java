class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int temp = numbers[0] * numbers[1];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (temp < numbers[i] * numbers[j]) {
                    temp = numbers[i] * numbers[j];
                }
            }
        }
        answer = temp;
        return answer;
    }
}